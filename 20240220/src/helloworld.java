/**
 * @author JieZHANG
 * @version 1.0.0
 *作用helloworld类，入门第一个程序练习
 */
public class helloworld {
    /**
     * 这个是一个main方法
     * @param args 这是一个数组
     */
    //数据类型与变量
    public static void main(String[] args) {
        /*
        大小是四个字节，不分是多少位的操作系统
         */
        int a = 10;
        //输出int最大值和最小值
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        int c =2147483647;
        System.out.println(c);//2147483647
        int d = c+1;
        System.out.println(d);//-2147483648 overflow
    }
}
