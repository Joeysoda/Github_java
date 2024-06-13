/**
 * Description:
 * Date: 2024-06-13
 * Time: 15:39
 */
class Parent {
    int data = 10;

    Parent() {
        System.out.println("Parent Constructor");
    }

    void func() {
        System.out.println("Parent func method");
    }
}

class Child extends Parent {
    int data = 20;

    Child() {
        super(); // 调用父类的构造方法
        System.out.println("Child Constructor");
    }

    void func() {
        System.out.println("Child func method");
    }

    void display() {
        System.out.println(super.data); // 访问父类的成员变量
        super.func(); // 调用父类的 func 方法
    }

    public static void main(String[] args) {
        Child c = new Child();
        c.display();
    }
}

public class Super {
}
