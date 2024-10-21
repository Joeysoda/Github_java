/**
 * Description:
 * Date: 2024-10-21
 * Time: 10:38
 */
public abstract class  Duck {
    public FlyBehaviour flyBehaviour;

    public void performFly(){
        flyBehaviour.fly();
    }

    public void setFlyBehavior(FlyBehaviour fb) {
        flyBehaviour = fb;}
}
