/**
 * Description:
 * Date: 2024-09-15
 * Time: 23:59
 */

class Animal {

    public void eat(){
        System.out.println("吃东西");
    }
}

// 跑的接口
interface Runnable {
    void run();  // 跑的行为
}

// 游泳的接口
interface Swimmable {
    void swim();  // 游泳的行为
}

// 飞的接口
interface Flyable {
    void fly();  // 飞行的行为
}

class Cat extends Animal implements Runnable{
    @Override
    public void run(){
        System.out.println();
    }
}
class Frog extends Animal implements Runnable, Swimmable {
    @Override
    public void run() {
        System.out.println("青蛙在跑");
    }



    @Override
    public void swim() {
        System.out.println("青蛙在游泳");
    }
}

class Duck extends Animal implements Runnable, Swimmable, Flyable {
    @Override
    public void run() {
        System.out.println("鸭子在跑");
    }


    @Override
    public void swim() {
        System.out.println("鸭子在游泳");
    }

    @Override
    public void fly() {
        System.out.println("鸭子在飞");
    }
}

public class Test {

        public static void main(String[] args) {
            Cat cat = new Cat();
            Frog frog = new Frog();
            Duck duck = new Duck();

            // 猫的行为
            cat.eat();  // 输出：动物正在吃东西
            cat.run();  // 输出：猫在跑

            // 青蛙的行为
            frog.eat();  // 输出：动物正在吃东西
            frog.run();  // 输出：青蛙在跑
            frog.swim(); // 输出：青蛙在游泳

            // 鸭子的行为
            duck.eat();  // 输出：动物正在吃东西
            duck.run();  // 输出：鸭子在跑
            duck.swim(); // 输出：鸭子在游泳
            duck.fly();  // 输出：鸭子在飞
        }
    }



