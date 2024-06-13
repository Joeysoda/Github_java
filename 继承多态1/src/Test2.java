import org.w3c.dom.ls.LSOutput;

/**
 * Description:
 * Date: 2024-06-12
 * Time: 15:48
 */

class Animal{
    //属性(成员变量)
    public String name;
    public int age;
    public String color;


    //添加不带参数构造方法
    public Animal(){

    }

    //带参数构造方法
    public Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
        System.out.println("父类方法");
    }

    //方法
    public void eat(){
        System.out.println(this.name+"正在吃饭");
    }
}


class Dog extends Animal{
    //从父类继承name age color
    //父类构造方法带有参数,需要用户为子类定义构造方法

    //不带参数构造方法
    public Dog(){
        //先实例化父类的成员变量
        super("haha",5,"s");
    }
    public void bark(){
        System.out.println(this.name+"正在汪汪");
    }
}

class Cat extends Animal{

    //带参数构造方法
    public Cat (String name,int age,String color){
        super(name, age, color);
    }
    public void Meomeo(){
        System.out.println(this.name+"正在喵喵");
    }
}

public class Test2 {
    public static void main(String[] args) {
        //实例化子类对象要先初始化父类对象
        //使用不带参数构造方法
        Dog dog = new Dog();
        dog.name="huang";
        dog.age=1;
        dog.color="yellow";
        dog.eat();
        dog.bark();

        //使用带参数构造方法
        Cat cat = new Cat("hua",3,"White");
        cat.eat();
        cat.Meomeo();
    }


}
