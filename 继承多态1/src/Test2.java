/**
 * Description:
 * Date: 2024-06-12
 * Time: 15:48
 */

class Animal{
    public String name;
    public int age;
    public String color;

    public void eat(){
        System.out.println(this.name+"正在吃饭");
    }
}

class Dog extends Animal{

    public void bark(){
        System.out.println(this.name+"正在汪汪");
    }
}

class Cat extends Animal{

    public void Meomeo(){
        System.out.println(this.name+"正在喵喵");
    }
}

public class Test2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name="huang";
        dog.age=1;
        dog.color="yellow";
        dog.eat();
        dog.bark();

        Cat cat = new Cat();
        cat.name ="mi";
        cat.color="white";
        cat.eat();
        cat.Meomeo();
    }
}
