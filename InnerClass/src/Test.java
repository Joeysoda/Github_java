import java.util.Arrays;

/**
 * Description:
 * Date: 2024-06-25
 * Time: 22:18
 */
public class Test {
    public  static  void func1(int[] array1){

        array1=new int [10];//创建了一个新的array，这个新的array是十个0
        System.out.println(Arrays.toString(array1));
    }

    public  static  void  func2(int[] array2){
        array2[0]=10;//在原array中做修改
        System.out.println(Arrays.toString(array2));

    }

    public static void main(String[] args) {
        int [] array = {1,2,3,4,5};
        func1(array);
        System.out.println(Arrays.toString(array));

        func2(array);
        System.out.println(Arrays.toString(array));

    }
}
