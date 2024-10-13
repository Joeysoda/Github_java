/**
 * Description:练习题 1：抽象类基础
 * 定义一个抽象类 Shape，并创建几个不同的形状类，如 Circle、Rectangle 等，继承自 Shape 类。要求：
 *
 * 在 Shape 类中定义一个抽象方法 area() 用于计算面积。
 * 每个子类必须实现 area() 方法，计算各自的面积。
 * Shape 类中还要有一个普通方法 description()，输出 “This is a shape”。
 * 提示：
 *
 * 抽象类可以包含抽象方法和普通方法。
 * 子类必须实现抽象类的抽象方法。
 * Date: 2024-09-17
 * Time: 0:08
 */

abstract class Shape{
    public void area(){};

    String name;

    public Shape(String name) {
        this.name = name;
    }



    public void description(){
        System.out.println("This is a "+ name);
    }
}

class Square extends Shape{

    double length;

    public Square(String name, double length) {
        super(name);
        this.length = length;
    }

    public Square(String name) {
        super(name);
    }

    @Override
    public void area() {
        System.out.println("Rectangle's area equals to "+length*length);
    }
}

class Circle extends Shape{

    double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    public Circle(String name){
        super(name);
    }

    @Override
    public void area() {
        System.out.println("Circlr's area equals to "+radius * radius*Math.PI);
    }
}

public class 练习题目1_抽象类基础 {
    public static void main(String[] args) {
        Shape s1 = new Circle("yuan",5);
        s1.description();
        s1.area();

        Shape s2 = new Square("fang",5);
        s2.description();
        s2.area();
    }
}
