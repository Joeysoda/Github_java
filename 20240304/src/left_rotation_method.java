/**
 * Description:
 * Date: 2024-03-04
 * Time: 14:10
 */
public class left_rotation_method {

        public static String[] leftRotate(int integer,String[] arr){
            int n= arr.length;
            String[] rotatedArr=new String [n];

            for (int i = 0; i < n; i++) {
                rotatedArr[(i + n - integer) % n] = arr[i];
                
            }return rotatedArr;
        }




    public static void main(String[] args) {

        //1. 从键盘获取第一个数字(利用parseInt将String转化为int类型)
        int integer=Integer.parseInt(args[0]);


        //2.从键盘获取后续内容,将其存放到新数组elements中
        String[] elements = new String[args.length-1];

        //利用arraycopy(原数组,原数组起始复制点,新数组,新数组起始复制点,复制元素数)
        System.arraycopy(args, 1,elements, 0, args.length-1);

        //3.调用方法
        String[] result = leftRotate(integer, elements);

        //4.输出
        for (String element : result) {
            System.out.print(element + " ");
        }
    }


}


