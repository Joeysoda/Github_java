package demo1;

/**
 * Description:
 * Date: 2024-06-13
 * Time: 16:42
 *
 *
*/
class Animal {
    public String name;
    public int age;


    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void eat(){
        System.out.println(this.name+"eating");
    }
}

class Dog extends Animal{


    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat(){
        System.out.println(this.name+" Eating Dog food");
    }
}

class Bird extends Animal{
    public Bird(String name, int age) {
        super(name, age);
    }
    @Override
    public void eat(){
        System.out.println(this.name+" Eating Bird food");
    }
}

public class Test1{

    public static void func(Animal animal2){
        animal2.eat();
        System.out.println("方法传参结束\n");

    }

    public static Animal func2(){
        return new Dog("dog3",3);
    }


    public static void main(String[] args) {

        //直接赋值
        System.out.println("直接赋值开始");
        Animal animal1 = new Dog("dog1",1);
        animal1.eat();
        System.out.println("直接赋值结束\n");

        System.out.println("方法传参开始");
        func( new Dog("dog2",1));
        //goto line 49

        System.out.println("返回值法开始");
        Animal animal3=func2();
        animal3.eat();
        System.out.println("返回值法结束\n");
    }
}