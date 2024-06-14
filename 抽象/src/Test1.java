/**
 * Description:
 * Date: 2024-06-14
 * Time: 22:16
 */
 abstract class Shape{
     public String name;

     public  abstract void draw();
}

class Rect extends Shape{

     //通过重写继承抽象类
     @Override
    public void draw(){
         System.out.println("画一个矩形");
     }
}
class Cycle extends Shape{

    //通过重写继承抽象类
    @Override
    public void draw(){
        System.out.println("画一个圆形");
    }
}
class Triangle extends Shape{

    //通过重写继承抽象类
    @Override
    public void draw(){
        System.out.println("画一个三角形");
    }
}

public class Test1 {
     public static void drawMap(Shape shape){
         shape.draw();
     }
    public static void main(String[] args) {
         //抽象类虽然不能被实例化
        //但是可以通过向上转型实例化
        Shape shape = new Rect();
         drawMap(new Rect());
         drawMap(new Cycle());
         drawMap(new Triangle());
        //Shape shape = new Shape();抽象类不能被实例化
        //作用的意义就是被继承
        //当一个普通类继承这个抽象类要重写这个抽象方法

    }
}
