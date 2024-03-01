/**
 * Description:
 * Date: 2024-03-01
 * Time: 23:15
 */
public class my_toString {
    /**
     * 把数组转换成字符串
     * @param
     */
    public static String mytoString(int[] array){

        if(array==null){
            return "null";
        }

        if(array.length==0){
            return "[]";
        }

        String ret = "[";
        for(int i=0;i<array.length;i++){
            ret=ret + array[i];
            if(i!=array.length-1){
            ret = ret + ",";
        }
        }

        ret+="]";
        return ret;
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        String ret = mytoString(array);
        System.out.println(ret);
    }
}
