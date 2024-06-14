package demo1;

/**
 * Description:
 * Date: 2024-06-12
 * Time: 14:13
 */
class Person{

  public String name;
  private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
//=======初始化成员变量=======

    //---方法一---
  //静态代码块初始化静态成员变量
  static{

    }

    //----方法二----
//实例代码块初始动态成员变量
    {

    }

    //----方法三----

    //构造方法(带参数/不带参数)
    public Person(){
        System.out.println("不带参数的构造方法");
    }

    public Person(String name, int age) {
        System.out.println("带参数的构造方法");
        this.name = name;
        this.age = age;
    }

    //非静态method
    public void eat() {
        System.out.println(this.name);
    }
    //static method
    public static void func(){

    }

}

public class Test {
    public boolean a;
    public boolean d;
    public boolean e;

    public static void main(String[] args) {
        Person person = new Person();
    }
}

