/**
 * Description:
 * Date: 2024-10-21
 * Time: 12:21
 */
public class RubberDuck extends Duck{
    @Override
    public void display() {
        System.out.println("Rubber Duck");
    }

    public RubberDuck(){
        strategyFly = new StrategyFlyNoWay() ;


    }
}
