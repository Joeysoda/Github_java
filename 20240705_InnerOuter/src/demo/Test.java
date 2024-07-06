package demo;

/**
 * Description:
 * Date: 2024-07-05
 * Time: 21:25
 */

class OuterClass{
    public int data1 = 1;
    private int data2 = 2;
    public static int data3 = 3;

    /**
     * 实例内部类: 定义在类的内部,方法的外部
     * 1.怎么使用实例内部类
     * 2.如何访问和外部类一样的成员属性
     */


    class InnerClass{
        public int data1 = 100;

        public int data4 = 4;
        private int data5 = 5;
        public static int data6 = 6;

        public void test(){
            System.out.println("InnerClass::test()");
            //获取外部类的data1
            System.out.println(OuterClass.this.data1);
            //获取内部类的data1
            System.out.println(data1);
            System.out.println(data2);
            System.out.println(data3);
            System.out.println(data4);
            System.out.println(data5);
            System.out.println(data6);
        }
    }
}
public class Test {
      public static void main(String[] args) {

        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();

        innerClass.test();

        // 实例内部类不能用这样的方法实例化
        //InnerClass innerClass = new InnerClass();
    }
}
