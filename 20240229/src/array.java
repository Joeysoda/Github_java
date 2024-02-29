import java.util.Arrays;

/**
 * Description:
 * Date: 2024-02-29
 * Time: 16:43
 */
public class array {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int [] array2 = new int []{1,2,3,4,5};
        int[] array3 = new int[10];
        //数组长度
        System.out.println(array.length);
        System.out.println(array[0]);
//        int[] array4 = null;
//        System.out.println(array4[0]);
//        array4这个引用不指向任何的对象



        //数组的遍历
        //法1
        int[] array5 = {1,2,3,4,5};
        for (int i=0;i<array5.length;i++){
            System.out.print(array5[i]+" ");
        }
        System.out.println();


        //for each这个循环获取不到下标
        //法2
        for(int x : array){
            System.out.print(x+" ");
        }
        System.out.println();

        //借助JAVA原生的办法

        String ret=Arrays.toString(array5);
        System.out.println(ret);
    }
}
