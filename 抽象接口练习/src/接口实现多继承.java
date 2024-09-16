/**
 * Description:
 * Date: 2024-09-16
 * Time: 23:45
 */
class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat(){
        System.out.println(name+"正在吃");
    }
}
interface Runable{
    void run();
}

interface Swimmable{
    void swim();
}

interface Flyable{
    void fly();
}

class Dog extends Animal implements Runable {


    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void run() {
        System.out.println(name+"正在run");
    }
}


public class 接口实现多继承 {
    public static void main(String[] args) {
        Dog a1 = new Dog("huang");
        a1.eat();
        a1.run();
    }
}
