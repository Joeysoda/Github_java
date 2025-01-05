import java.util.ArrayList;
import java.util.List;

/**
 * Description:展示Aggregatioin和Composittion
 * Date: 2025-01-04
 * Time: 22:30
 */
public class demo {

//class Team {
//    public Team (Person person){
//
//    }
//}
//class Person{
//
//    public Person(){
//
//    }
//}//low coupling
//
//
//
//
//
//class House {
//    public House(Brick brick){
//
//    }
//    class Brick {
//        public Brick(){
//
//        }
//    }
//  }
//    //解释overload override
//    class Calculator{
//        public int add(int a, int b){
//            return a + b;
//        }
//
//        public double add (double a, double b){
//            return a +b;
//        }
//    }
//
//
//    class Animal{
//        public void sound(){
//            System.out.println("Animal sound");
//        }
//    }
//
//    class Dog extends Animal{
//        @Override
//        public void sound(){
//            System.out.println("Dog sound");
//        }
//    }
//
abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void sleep() {
        System.out.println(name + " 正在睡觉");
    }

    public abstract void makeSound();
}

    class Dog extends Animal {
        public Dog(String name) {
            super(name);
        }

        @Override
        public void makeSound() {
            System.out.println(name + " 在汪汪叫");
        }
    }

    interface Flyable {
        void fly();
    }

    interface Swimmable {
        void swim();
    }

    class Duck implements Flyable, Swimmable {
        @Override
        public void fly() {
            System.out.println("鸭子在飞");
        }

        @Override
        public void swim() {
            System.out.println("鸭子在游泳");
        }
    }
}
