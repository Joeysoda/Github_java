package Revision;
// 抽象产品类
abstract class Pizza {
    public abstract void prepare();
    public abstract void bake();
    public abstract void cut();
    public abstract void box();
}

// 具体产品类：希腊披萨
class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing Greek Pizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking Greek Pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting Greek Pizza");
    }

    @Override
    public void box() {
        System.out.println("Boxing Greek Pizza");
    }
}

// 具体产品类：奶酪披萨
class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing Cheese Pizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking Cheese Pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting Cheese Pizza");
    }

    @Override
    public void box() {
        System.out.println("Boxing Cheese Pizza");
    }
}


// 抽象工厂类
abstract class Arabina {
    public abstract Pizza createPizza(String type); // 工厂方法

    // 披萨的订单逻辑，隐藏了创建细节
    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type); // 通过工厂方法创建具体的披萨
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}

// 具体工厂类：南京披萨工厂
class NBArabina extends Arabina {
    @Override
    public Pizza createPizza(String type) {
        if (type.equals("Greek")) {
            return new GreekPizza();
        } else if (type.equals("Cheese")) {
            return new CheesePizza();
        } else {
            return null;
        }
    }
}

// 具体工厂类：上海披萨工厂
class SHArabina extends Arabina {
    @Override
    public Pizza createPizza(String type) {
        if (type.equals("Greek")) {
            return new GreekPizza();
        }
        else if (type.equals("Cheese")) {
            return new CheesePizza();
        }
        else {
            return null;
        }
    }
}

public class FactoryMethodTest {
    public static void main(String[] args) {
        // 创建南京披萨工厂
        Arabina nbFactory = new NBArabina();
        Pizza Pizza1 = nbFactory.orderPizza("Greek");
        System.out.println("Ordered a Greek Pizza from Nanjing");

        // 创建上海披萨工厂
        Arabina shFactory = new SHArabina();
        Pizza Pizza2 = shFactory.orderPizza("Cheese");
        System.out.println("Ordered a Cheese Pizza from Shanghai");
    }
}
