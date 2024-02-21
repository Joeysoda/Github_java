/**
 * Description:
 * Date: 2024-02-21
 * Time: 16:35
 */
public class Test {
    public static void main(String[] args) {
//long类型
        long a = 10L;//末尾说明 当前这个10是一个long类型的数据
        System.out.println(a);
        /*
        8个字节
        64个bit位     1符号位        63数值位
        -2^63       到       2^63-1
         */


//short
        short b = 10;
        System.out.println(b);
        /*
        -2^15~2^15-1
        两个字节
         */
//byte字节类型
        byte c =127;
        System.out.println(c);
        /*一个字节
        -128~127
         */

//double
        double d = 1.2;
        System.out.println(d);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
        /*
        八个字节
         */
//float 转换成double 需要在末尾加上f
        float num = 1.0f;
        System.out.println(num);
        System.out.printf("%f\n",num);
        /*
        四个字节
         */
//char
        char ch = '高';
        System.out.println(ch);
        char ch2 = 123;
        System.out.println(ch2);
        /*
        两个字节
         */
//boolean
        boolean flg = true;
        System.out.println(flg);
        /*
        没有明确字节大小
         */

//int 与long int 会被提升为long
        int h = 10;
        long i = 20;
        //int j = h + i;//编译出错,赋值给int时会精度丢失
        long j = h + i;// 编译成功,long赋值给long

//两个byte相运算会先自动转化为int,再进行计算,得到的结果也是int
    byte k = 10;
    byte l = 20;
    //byte m = k+l;//报错
    byte m =(byte)(k+l);//正常运行
        System.out.println(c);
        System.out.println(c);
        System.out.println(c);
        System.out.println(c);
        System.out.println(c);//ctrl + D快速复制

        //字符串拼接
        int n = 10;
        int p = 20;
        System.out.println("n="+ n + " p="+ p);

        System.out.println("n+p="+n+p );//整体都是字符串看待的

        System.out.println("n+p="+(n+p) );

//======================运算符=====================

        System.out.println(5.0/0);//Infinitely

        //System.out.println(5/0);//报错

        //除法的结果的符号和被除数的正负有关
        System.out.println(9%-2);

        System.out.println(-9%2);

        System.out.println(-9%-2);

        /*
        对应增量运算符来说，会进行自动的类型转换
         */
        double d2 = 12.5;
        int c2 = 20;
        d2+=c2;
        System.out.println(d2);
//短路求值，只要前一个表达式是假(真)，&&(||)就不会(会)检查后面一个表达式
        System.out.println(10>20 && 10/0==0);
        System.out.println(10<20 || 10/0==1);


        boolean flag = true ? ((true == false) ? true : false) : true;
        System.out.println(flg);

    }
}
