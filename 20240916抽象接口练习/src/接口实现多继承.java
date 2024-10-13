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


class Duck extends Animal implements Runable, Swimmable {

    public Duck(String name) {
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

    @Override
    public void swim() {
        System.out.println(name+"正在swim");
    }
}


public class 接口实现多继承 {
    public static void main(String[] args) {
        Dog a1 = new Dog("huang");
        a1.eat();
        a1.run();

        Duck a2 = new Duck ("ga");
        a2.eat();
        a2.run();
        a2.swim();
    }
}
