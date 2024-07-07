/**
 * Description:
 * Date: 2024-07-06
 * Time: 13:32
 */

public class Test {
    public static void func(int[] array){
        if(array==null){
            //抛出异常
            throw new NullPointerException(array+"空指针异常 ,请重新输入一个数组");
        }
    }
    public static void main(String[] args) {


        //处理异常
        try{
            int[] array = null;
            func(array);

        }
        //捕获异常
        catch(Exception e ){
            e.printStackTrace();
            System.out.println("捕获到了Exception 异常");
        }
        //处理异常结束,关闭打开的资源
        finally{
            System.out.println("fianlly 执行了");
        }

        System.out.println("异常处理完  程序继续执行");
    }

}
