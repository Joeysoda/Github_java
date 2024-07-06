package demo;

/**
 * Description:
 * Date: 2024-07-05
 * Time: 21:25
 */

class OuterClass2 {
    public int data1 = 1;
    private int data2 = 2;
    public static int data3 = 3;

    /**
     * 静态内部类: 定义在类的内部, 使用 static 修饰
     * 1.怎么使用静态内部类
     * 2.如何访问和外部类一样的成员属性
     */

    static class InnerClass2 {
        public int data4 = 4;
        private int data5 = 5;
        public static int data6 = 6;

        public void test() {
            System.out.println("InnerClass::test()");

            //可以通过实例化外部类对象调用引用
            OuterClass2 outerClass2 = new OuterClass2();
            System.out.println(outerClass2.data1);
            System.out.println(outerClass2.data2);
            System.out.println(data3);
            System.out.println(data4);
            System.out.println(data5);
            System.out.println(data6);
        }
    }
}

public class Test2 {
    public static void main(String[] args) {
        // 创建静态内部类的实例

        OuterClass2.InnerClass2 innerClass = new OuterClass2.InnerClass2();

        // 调用静态内部类的方法
        innerClass.test();

          }
}
