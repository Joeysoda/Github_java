/**
 * Description:
 * Date: 2024-09-16
 * Time: 21:19
 */

class Animal{
    public void sound(){
        System.out.println("动物 make noise");
    }
}

class Dog extends Animal{
    @Override
    public void sound() {
        System.out.println("Dog make noise");
    }

    public void eat(){
        System.out.println("Dog eat");
    }
}

class Cat extends Animal{
    String name;

    public Cat(String name) {
        this.name = name;
    }

    public void eat(){
        System.out.println(name+" eat");
    }
}


public class Test_多态基本语法 {
    public static void main(String[] args) {
        //调用Animal向上转型且动态绑定
        Animal a = new Dog();
        a.sound();

        //想要调用dog的特殊method就要使用向下转型
        if (a instanceof Dog){
        Dog d = (Dog) a ;
        d.eat();
    }

        //没有override
        Animal c = new Cat("Kitty");
        c.sound();
        if (c instanceof Cat){
            Cat d = (Cat) c ;
            d.eat();
        }
    }
}
