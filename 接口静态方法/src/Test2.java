/**
 * Description:
 * Date: 2024-06-24
 * Time: 23:40
 */
interface IA{
    void testA();
}

interface IB{
    void testB();
}

class TestDemo2 implements IA,IB{

    @Override
    public void testA() {
        System.out.println("testA");
    }

    @Override
    public void testB() {
        System.out.println("testB");
    }
}
public class Test2 {
    public static void main(String[] args) {
        TestDemo2 testDemo2 = new TestDemo2();
        testDemo2.testA();
        testDemo2.testB();
    }
}
