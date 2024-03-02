package src;
import java.util.Arrays;



/**
 * Description:
 * Date: 2024-03-02
 * Time: 13:25
 */
public class print_array {


    public static String func(int[]arr){
        if(arr==null){
            return "null";
        }
        if(arr.length==0){
            return "[]";
        }

       String ret = "[";
        for (int i = 0; i < arr.length; i++) {
            ret=ret+arr[i];
           if(i!= arr.length-1){
                ret=ret+",";
           }
        }
        ret +="]";

        return ret;
    }
    /**
     * print array的三中方式
     * @param
     */
    //方式一for
    public static void main(String[] args) {
    int [] array={1,2,3,4,5};
    for(int i=0;i<array.length;i++){
        System.out.print(array[i]+" ");
    }
        System.out.println();


    //方法二for each
    for(int x:array){
        System.out.print(x+" ");
    }
        System.out.println();

    //方法三toString

        String newarr = Arrays.toString(array);
        System.out.println(newarr);

    //方法四mytostring

        String ret=func(array);
        System.out.println(ret);
}

 }