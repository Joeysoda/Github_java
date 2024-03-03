/**
 * Description:
 * Date: 2024-03-03
 * Time: 20:30
 */
public class Dog {

    //属性
    public String name;
    public int age;
    public String color;

    //方法
    public void eat(){
        System.out.println(this.name+" is Eating~~~");
    }

    public void sleep(){
        System.out.println(this.name+" is Sleeping~~~");
    }

    public void show(){
        System.out.println("name:"+this.name+" age:"+this.age+" color:"+this.color);
    }

    //======构造方法=====

    //不带参数的构造方法
    public Dog(){
        this.name="abc";
        this.age=9;
        this.color="yellow";
    }
    //带参数的构造方法
    public Dog(String name, int age, String color){
        this.name=name;
        this.age=age;
        this.color=color;
    }

    //=====main函数=====
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.eat();
        dog1.show();
        dog1.sleep();
        System.out.println();


        Dog dog2 = new Dog("qweasd",12,"blue");
        dog2.show();
        System.out.println();

        Dog dog3 = new Dog("zxc",32,"green");
        dog3.show();
    }
}

