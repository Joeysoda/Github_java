package demo1;

/**
 * Description:
 * Date: 2024-06-12
 * Time: 16:37
 */
class Base2{
    public void testA(){
        System.out.println("TestA");
    }
}
class Derived2 extends Base2{
    public void testA(){
        System.out.println("Derived2::TestA");
    }
    public void testB() {
        System.out.println("TestB");

    }
    public void testC() {
        this.testA();//同名使用this优先在子类中找
        super.testA();//super就在父类中找
        this.testB();
    }
}

public class Test4 {
    public static void main(String[] args) {
        Derived2 derived2 = new Derived2();
        derived2.testC();
    }
}
