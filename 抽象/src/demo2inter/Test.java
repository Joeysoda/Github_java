package demo2inter;

/**
 * Description:
 * Date: 2024-06-15
 * Time: 15:38
 */
interface IShape{
    //接口当中的成员变量    public static final 修饰
    //或者什么都不写
    public static final int age=10;
    int AGE=20;


    //定义的时候可以省略
    //接口当中的方法默认是public static final修饰
    void draw();
}

class Rect implements IShape{
    @Override
    public void draw() {
        System.out.println("画一个矩形");
    }
}
class Triangle implements IShape{
    @Override
    public void draw() {
        System.out.println("画一个三角形");
    }
}


public class Test {
    public static void drawMap(IShape iShape){
        iShape.draw();
    }
    public static void main(String[] args) {
        drawMap(new Rect());
        drawMap(new Triangle());

    }
}
