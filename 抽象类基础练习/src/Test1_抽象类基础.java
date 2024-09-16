/**
 * Description:练习题 1：抽象类基础
 * 定义一个抽象类 Shape，并创建几个不同的形状类，如 Circle、Rectangle 等，
 * 继承自 Shape 类。要求：
 *
 * 在 Shape 类中定义一个抽象方法 area() 用于计算面积。
 * 每个子类必须实现 area() 方法，计算各自的面积。
 * Shape 类中还要有一个普通方法 description()，输出 “This is a shape”。
 * 提示：
 *
 * 抽象类可以包含抽象方法和普通方法。
 * 子类必须实现抽象类的抽象方法。
 * Date: 2024-09-16
 * Time: 19:00
 */

abstract class Shape{

    protected String name;


    public Shape (String name){
        this.name=name;
    }

    public abstract void area();

    public void description(){
        System.out.println("This is a "+name);
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public void area() {
        System.out.println(Math.PI * radius * radius);
    }
}


public class Test1_抽象类基础 {
    public static void main(String[] args) {
        Shape circle = new Circle("circle",5);
        circle.area();
        circle.description();
    }
}
