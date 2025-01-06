package Revision;//    package Revision;
//
//    // 飞行行为接口（不需要 public 修饰符）
//    interface FlyBehavior {
//        void fly();
//    }
//
//    // 具体的飞行行为实现
//    class FlyFast implements FlyBehavior {
//        public void fly() {
//            System.out.println("Flying fast!");
//        }
//    }
//
//    class FlyNoWay implements FlyBehavior {
//        public void fly() {
//            System.out.println("I can't fly.");
//        }
//    }
//
//    // 鸭子基类
//    abstract class Duck {
//        FlyBehavior flyBehavior;
//
//        public void performFly() {
//            flyBehavior.fly();
//        }
//
//        public void setFlyBehavior(FlyBehavior fb) {
//            flyBehavior = fb;
//        }
//
//        public abstract void display();
//    }
//
//    // 具体的鸭子实现
//    class MallardDuck extends Duck {
//        public MallardDuck() {
//            flyBehavior = new FlyFast(); // 默认行为
//        }
//
//        public void display() {
//            System.out.println("I'm a Mallard Duck");
//        }
//    }
//
//    class RubberDuck extends Duck {
//        public RubberDuck() {
//            flyBehavior = new FlyNoWay(); // 默认行为
//        }
//
//        public void display() {
//            System.out.println("I'm a Rubber Duck");
//        }
//    }
//
//    // 测试主类（唯一的 public 类）
//    public class StrategyPatternTest {
//        public static void main(String[] args) {
//            Duck mallard = new MallardDuck();
//            mallard.performFly(); // 输出: Flying fast!
//
//            Duck rubberDuck = new RubberDuck();
//            rubberDuck.performFly(); // 输出: I can't fly.
//
//            // 动态改变行为
//            rubberDuck.setFlyBehavior(new FlyFast());
//            rubberDuck.performFly(); // 输出: Flying fast!
//        }
//    }

    interface Flybehavior{
        void fly();
    }

        class FlyNoWay implements Flybehavior{
            @Override
            public void fly() {
                System.out.println("Fly No Way");
            }
        }

        class FlyFast implements Flybehavior{
            @Override
            public void fly() {
                System.out.println("Fly fast");
            }
        }


        abstract class  Duck {
        Flybehavior flybehavior;

        public void performFly(){
            flybehavior.fly();
        }

        public void setFlybehavior(Flybehavior fb){
            flybehavior = fb;
        }

        public abstract void display();
    }


    class NottinghamDuck extends Duck{
        @Override
        public void display(){
            System.out.println("I can fly");
        }

        public NottinghamDuck(){
            flybehavior = new FlyFast();
        }
    }

    class RubberDuck extends Duck{
        @Override
        public void display(){
            System.out.println("I can not fly");
        }

        public RubberDuck(){
            flybehavior = new FlyNoWay();
        }
    }


    public class StrategyPatternTest{
        public static void main(String[] args) {
            Duck nottinghamduck = new NottinghamDuck();
            nottinghamduck.performFly();

            Duck rubberduck = new RubberDuck();
            rubberduck.performFly();
            rubberduck.display();

            NottinghamDuck duck = new NottinghamDuck();
            duck.performFly();
            rubberduck.setFlybehavior(new FlyFast());
        }
    }