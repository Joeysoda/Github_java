/**
 * Description:
 * Date: 2024-09-16
 * Time: 21:13
 */


class Animal1 {
    public String name;

    public Animal1(String name) {
        this.name = name;
    }

    public void play(){
        System.out.println(this.name+ " is "+ "playing");
    }
}

class Dog1 extends Animal1{
    public String name = "狗狗";

    //子类调用父类构造方法
    public Dog1(String name){
        super("animal");
//        this.name = name;
    }
    public void eat(){
        //用法1:this/super指定父类还是子类的变量
        System.out.println("Dog1_狗狗吃:");
        System.out.println(this.name+" eating");
        System.out.println("Animal1_animal吃:");
        System.out.println(super.name+" eating");
    }

    @Override
    public void play() {
        System.out.println(name+ " is "+ "playing");
    }

    public void diaplay(){
        //用法二选择是使用父类还是子类的方法
        System.out.println("Dog1_狗狗玩:");
        this.play();
        System.out.println("Animal1_animal玩:");
        super.play();
    }
}

public class Test_super {
    public static void main(String[] args) {
        Dog1 d1 = new Dog1("gougou");
        d1.eat();
        d1.diaplay();
    }
}
