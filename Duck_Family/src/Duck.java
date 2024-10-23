/**
 * Description:
 * Date: 2024-10-21
 * Time: 10:38
 */
public abstract class  Duck {
    public Strategy_Fly strategyFly;

    public void performFly(){
        strategyFly.fly();
    }

    public void setFlyBehavior(Strategy_Fly fb) {
        strategyFly = fb;}

    public abstract void display();

}
