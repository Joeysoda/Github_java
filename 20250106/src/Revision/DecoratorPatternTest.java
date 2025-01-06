package Revision;
//
///**
// * Description:
// * Date: 2025-01-06
// * Time: 20:24
// */
//// 抽象组件：饮品
//abstract class Beverage {
//    String description = "Unknown Beverage";
//
//    public String getDescription() {
//        return description;
//    }
//
//    public abstract double cost(); // 价格
//}
//
//// 具体组件：基础饮品
//class Decaf extends Beverage {
//    public Decaf() {
//        description = "Decaf Coffee";
//    }
//
//    @Override
//    public double cost() {
//        return 2.0; // 基础价格
//    }
//}
//
//// 装饰器基类
//abstract class CondimentDecorator extends Beverage {
//    public abstract String getDescription(); // 子类必须实现
//}
//
//// 具体装饰器：牛奶
//class Milk extends CondimentDecorator {
//    Beverage beverage; // 被装饰的对象
//
//    public Milk(Beverage beverage) {
//        this.beverage = beverage;
//    }
//
//    @Override
//    public String getDescription() {
//        return beverage.getDescription() + ", Milk";
//    }
//
//    @Override
//    public double cost() {
//        return beverage.cost() + 0.5; // 添加牛奶的价格
//    }
//}
//
//// 具体装饰器：摩卡
//class Mocha extends CondimentDecorator {
//    Beverage beverage;
//
//    public Mocha(Beverage beverage) {
//        this.beverage = beverage;
//    }
//
//    @Override
//    public String getDescription() {
//        return beverage.getDescription() + ", Mocha";
//    }
//
//    @Override
//    public double cost() {
//        return beverage.cost() + 0.7; // 添加摩卡的价格
//    }
//}
//
//// 测试类
//public class DecoratorPatternTest {
//    public static void main(String[] args) {
//        // 点一杯基础的脱因咖啡
//        Beverage beverage = new Decaf();
//        System.out.println(beverage.getDescription() + " $" + beverage.cost());
//
//        // 加牛奶
//        beverage = new Milk(beverage);
//        System.out.println(beverage.getDescription() + " $" + beverage.cost());
//
//        // 加摩卡
//        beverage = new Mocha(beverage);
//        System.out.println(beverage.getDescription() + " $" + beverage.cost());
//    }
//}
//











//
//
//abstract class Beverage{
//    String description;
//    public abstract double cost();
//    public String getDescription() {
//        return description;
//    }
//}
//class Decaf extends Beverage{
//    @Override
//    public double cost(){
//        return 2.3;
//    }
//    public Decaf(){
//        description = "Decaf coffee";
//    }
//}
//
//class Caf extends Beverage{
//    @Override
//    public double cost(){
//        return 2.0;
//    }
//    public Caf(){
//        description = "Normal coffee";
//    }
//}
//
//abstract  class Jidi extends Beverage{
//    public abstract String getDescription();
//}
//
//class Milk extends Jidi{
//    Beverage beverage;
//    @Override
//    public String getDescription(){
//        return beverage.description+ "Milk";
//    }
//    @Override
//    public double cost(){
//        return beverage.cost()+0.37;
//    }
//    public Milk (Beverage beverage){
//        this.beverage=beverage;
//    }
//}
//
//class Tea extends Jidi{
//    Beverage beverage;
//    @Override
//    public String getDescription(){
//        return beverage.description+ "Tea";
//    }
//    @Override
//    public double cost(){
//        return beverage.cost()+0.45;
//
//    }
//}
//
//abstract class Toppings extends Beverage{
//    Beverage beverage;
//    public abstract String getDescription();
//}
//
//class naipao extends Toppings{
//
//    @Override
//    public String getDescription(){
//        return beverage.description+ " naipao";
//    }
//    @Override
//    public double cost(){
//        return beverage.cost()+0.30;
//    }
//    public naipao (Beverage beverage){
//        this.beverage = beverage;
//    }
//}
//
//class chacolate extends Toppings{
//    @Override
//    public String getDescription(){
//        return beverage.description+ "chacolate";
//    }
//    @Override
//    public double cost(){
//        return beverage.cost()+0.3;
//    }
//}
//public class DecoratorPatternTest{
//    public static void main(String[] args) {
//        Beverage beverage = new Decaf();
//        System.out.println(beverage.getDescription() + "$" + beverage.cost());
//
//        // 加牛奶
//        beverage = new Milk(beverage);
//        System.out.println(beverage.getDescription() + " $" + beverage.cost());
//
//        // 加摩卡
//        beverage = new naipao(beverage);
//        System.out.println(beverage.getDescription() + " $" + beverage.cost());
//
//    }
//}
// 抽象组件：饮品
abstract class Beverage {
    String description = "Unknown Beverage"; // 默认描述

    public abstract double cost(); // 价格

    public String getDescription() {
        return description;
    }
}

// 具体组件：基础饮品
class Decaf extends Beverage {
    public Decaf() {
        description = "Decaf Coffee"; // 描述
    }

    @Override
    public double cost() {
        return 2.0; // 基础价格
    }
}

class Caf extends Beverage {
    public Caf() {
        description = "Normal Coffee"; // 描述
    }

    @Override
    public double cost() {
        return 2.3; // 基础价格
    }
}
// 装饰器基类
abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription(); // 子类必须实现
}
class Milk extends CondimentDecorator {
    Beverage beverage; // 被装饰的对象

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " + Milk";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.37; // 加牛奶的价格
    }
}
class Tea extends CondimentDecorator {
    Beverage beverage;

    public Tea(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " + Tea";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.45; // 加茶的价格
    }
}
class naipao extends CondimentDecorator {
    Beverage beverage;

    public naipao(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " + Foam";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.30; // 加奶泡的价格
    }
}
class chacolate extends CondimentDecorator {
    Beverage beverage;

    public chacolate(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " + Chocolate";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.3; // 加巧克力的价格
    }
}
public class DecoratorPatternTest {
    public static void main(String[] args) {
        // 点一杯基础的脱因咖啡
        Beverage beverage = new Decaf();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        // 动态加牛奶
        beverage = new Milk(beverage);
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        // 动态加奶泡
        beverage = new naipao(beverage);
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        // 动态加巧克力
        beverage = new chacolate(beverage);
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        // 新点一杯普通咖啡，加茶和巧克力
        Beverage beverage2 = new Caf();
        beverage2 = new Tea(beverage2);
        beverage2 = new chacolate(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
    }
}
