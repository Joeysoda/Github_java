package important;

/**
 * Description:
 * Date: 2024-06-13
 * Time: 15:40
 */
class Example {
    int data;

    Example() {
        this(10); // 调用带参构造方法
        System.out.println("Default Constructor");
    }

    Example(int data) {
        this.data = data;
        System.out.println("Parameterized Constructor");
    }

    void func() {
        System.out.println("important.This is func method");
    }

    void anotherFunc() {
        this.func(); // 调用当前对象的 func 方法
    }

    void display() {
        System.out.println(this.data); // 访问当前对象的成员变量
    }

    public static void main(String[] args) {
        Example e = new Example();
        e.display();
        e.anotherFunc();
    }
}

public class This {
}
