package demo1;

/**
 * Description:
 * Date: 2024-06-13
 * Time: 16:42
 */
class Animal {
    public String name;
    public int age;

    public void eat() {
        System.out.println(this.name + " eating");
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Dog extends Animal {

    public Dog() {
        super("不带参数构造", 1);
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    public void bark() {
        System.out.println(this.name + " Barking");
    }

    @Override
    public void eat() {
        System.out.println(this.name + " Eating dog food!");
    }
}

class Bird extends Animal {
    public Bird(String name, int age) {
        super(name, age);
    }

    public void gigi() {
        System.out.println(this.name + " jijiing");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println(this.name + " 正在吃鸟粮");
    }
}

public class Test1 {
    // 向上转型方法1: 方法传参
    public static void func(Animal animal1) {
        animal1.eat();
        System.out.println("向上转型1");

    }

    // 向上转型方法2: 方法返回, 返回任意子类对象
    public static Animal func2() {
        return new Dog("向上转型2", 10);
    }

    public static void main(String[] args) {
        // 向上转型方法1: 方法传参
        Dog dog = new Dog();
        func(dog); // Dog 对象作为 Animal 参数传递

        // 向上转型方法3: 直接赋值
        Animal animal2 = new Dog("向上转型3", 5);

        // 向上转型方法2: 方法返回
        Animal animal3 = func2();

        // 调用父类方法
        animal2.eat(); // 调用 Dog 类的 eat 方法，因为 Dog 重写了 eat 方法
        animal3.eat(); // 调用 Dog 类的 eat 方法，因为 func2() 返回 Dog 对象

        // 调用子类特有的方法，需要向下转型
        if (animal2 instanceof Dog) {
            Dog dog2 = (Dog) animal2; // 向下转型
            dog2.bark();
        }
    }
}
