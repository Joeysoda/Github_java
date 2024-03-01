/**
 * Description:
 * Date: 2024-03-01
 * Time: 21:26
 */
public class array_2 {
    public static void main(String[] args) {
        int[] array1= new int[3];
        array1[0]=10;
        array1[1]=20;
        array1[2]=30;
        //array1={10,20,30}

        int[] array2 = new int[]{1,2,3,4,5};
        array2[0]=100;
        array2[1]=200;
        //array2={100,200,3,4,5}

        array1 = array2;
        //array1原本的内容被收回
        //array1={100,200,3,4,5}
        array1[2]=300;
        array1[3]=400;
        array1[4]=500;
        //array1={100,200,300,400,500}
        for(int i=0;i<array2.length;i++){
            System.out.print(array2[i]+" ");
        }
        //int [] array = null 代表array这个引用   不指向任何的对象
        //引用指向的是对象
        //一个引用不能指向多个对象
    }
}
