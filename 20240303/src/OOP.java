/**
 * Description:
 * Date: 2024-03-02
 * Time: 20:46
 */

public class OOP {
    int method1=123;
    String method2="abc";
    String attribute1="qwe" ;
    int attribute2=456;

    public static void main(String[] args) {
        OOP object1 = new OOP();//实例化
        object1.attribute1="qwe";
        object1.method2="abc";
        System.out.println(object1.attribute1+" "+object1.method2);

        OOP object2 = new OOP();//通过new实例化，可以实例化多个对象
        object2.attribute2=123;
        object2.method1=456;
        System.out.println(object2.attribute2+" "+object2.method1);

    }
}


