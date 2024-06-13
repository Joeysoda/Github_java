package important;

/**
 * Description:
 * Date: 2024-06-13
 * Time: 15:41
 */
class Parent1 {
    // 静态代码块
    static {
        System.out.println("important.Parent static block");
    }

    // 实例初始化块
    {
        System.out.println("important.Parent instance block");
    }

    // 构造方法
    Parent1() {
        System.out.println("important.Parent constructor");
    }
}

class Child1 extends Parent1 {
    // 静态代码块
    static {
        System.out.println("important.Child static block");
    }

    // 实例初始化块
    {
        System.out.println("important.Child instance block");
    }

    // 构造方法
    Child1() {
        System.out.println("important.Child constructor");
    }
}

public class Sequence {
    public static void main(String[] args) {
        System.out.println("Main method starts");
        Child1 child = new Child1();
        System.out.println("Main method ends");
        System.out.println("---------------");
        Child1 child2 = new Child1();

    }
}


