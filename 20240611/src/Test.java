/**
 * Description:
 * Date: 2024-06-11
 * Time: 13:53
 */
//public 开头的只能是文件名 例如public class Test
class WashMachine{
    public String brand; // 品牌
    public String type; // 型号
    public double weight; // 重量
    public double length; // 长
    public double width; // 宽
    public double height; // 高
    public String color; // 颜色
    public void washClothes(){ // 洗衣服
        System.out.println("洗衣功能");
    }
    public void dryClothes(){ // 脱水
        System.out.println(brand+"脱水功能");
    }
    public void setTime(){ // 定时
        System.out.println("定时功能");
    }
}
public class Test{
    public static void main(String[] args) {
        System.out.println("Test method");
        //实例化对象
        WashMachine washMachine = new WashMachine();
        //可以通过对象的引用+.访问对象的属性和方法
        washMachine.brand = "haier";
        washMachine.dryClothes();
        System.out.println(washMachine.brand);
    }
}

