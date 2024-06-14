package demo1;

/**
 * Description:
 * Date: 2024-06-14
 * Time: 11:30
 */
class Shape{
    public void draw(){
        System.out.println("画图像");
    }
}
class Rectangle extends Shape{
    @Override
    public void draw() {
        System.out.println("画一个矩形");
    }
}

class Circle extends Shape{
    @Override
    public void draw() {
        System.out.println("画一个圆形");
    }
}

class Triangle extends Shape{
    @Override
    public void draw() {
        System.out.println("画一个三角形");
    }
}


public class Test2 {
    //向上转型方法传参
    public static void drawMap(){
        Rectangle rectangle= new Rectangle();
        Circle circle= new Circle();
        Triangle triangle= new Triangle();
        Shape[] shapes = {rectangle,triangle,circle,rectangle,triangle,rectangle};

        for(Shape shape : shapes){
            shape.draw();
        }

    }

    public static void main(String[] args) {
        drawMap();
    }





}
