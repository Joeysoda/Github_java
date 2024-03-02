package src;

/**
 * Description:
 * Date: 2024-03-02
 * Time: 13:40
 */
public class array_reference {


    public static void Func(int[] array1){
        for(int i=0;i<array1.length;i++){
            array1[i]=2*array1[i];
        }
    }

    public static int[] Func2(int[] array1){//java可以直接输出数组
        int[] tmp = new int [array1.length];
        for(int i=0;i<array1.length;i++){
            tmp[i]=array1[i]*2;
        }return tmp;
    }


    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");

        }
        System.out.println();


        Func(array);//array进行Func变成246810,,也就是说array-->array1


        int []arrayret=Func2(array);//array进行Func将array1*2赋值给tmp:48121620,,
        for(int i=0;i<arrayret.length;i++){
            System.out.print(arrayret[i]+" ");//输出tmp
        }System.out.println();


        for (int i = 0; i < array.length; i++) {//array1进行输出
            System.out.print(array[i]+" ");
        }System.out.println();

    }
}
