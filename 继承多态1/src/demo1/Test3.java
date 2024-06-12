package demo1;

/**
 * Description:
 * Date: 2024-06-12
 * Time: 16:12
 */

class Base{
    public int a=1;
    public int b=2;
}

class Derived extends Base{
    public int c=3;
    public void test(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}



public class Test3 {
    public static void main(String[] args) {
        Derived derived = new Derived();
        derived.test();
    }
}
