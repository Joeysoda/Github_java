/**
 * Description:
 * Date: 2024-06-24
 * Time: 23:19
 */
interface A {
    void test1();

    static  void test2(){
        System.out.println("static()");
    }

    default void test3(){
        System.out.println("default()");
    }

}
class TestDemo implements A {
    @Override
    public void test1() {
        System.out.println("重写方法test1");
    }

//    @Override
//    public void test3() {
//        System.out.println("重写方法test3");
//    }
}


public class Test {
    public static void main(String[] args) {
        TestDemo testDemo = new TestDemo();
        testDemo.test1();
        A.test2();
        testDemo.test3();

    }
}
