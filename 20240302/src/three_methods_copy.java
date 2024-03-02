package src;

import java.util.Arrays;

/**
 * Description:
 * Date: 2024-03-02
 * Time: 17:08
 */
public class three_methods_copy {
    public static int[] copy1(int[] array){
        int [] copy = new int [array.length];


        for (int i = 0; i < array.length; i++) {
        copy[i]=array[i];
        }
        return copy;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};

        //方法一，利用函数
        int [] copy = copy1(array);
        System.out.println(Arrays.toString(copy));


        //方法二利用内置copyof(可以扩容array)
        int [] copy2= Arrays.copyOf(array,array.length*2);
        System.out.println(Arrays.toString(copy2));//扩容


        //方法三 arraycopy
        int[] copy3 = new int[array.length];
        System.arraycopy(array,0,copy3,0,array.length);
        System.out.println(Arrays.toString(copy));



        //特殊copy

        int[] copy4= Arrays.copyOfRange(array,1,3);
        System.out.println(Arrays.toString(copy));

    }
}
