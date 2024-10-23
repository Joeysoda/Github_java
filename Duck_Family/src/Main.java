/**
 * Description:
 * Date: 2024-10-21
 * Time: 10:37
 */
public class Main {
    public static void main(String[] args) {

        Duck duck1 = new RubberDuck();

        duck1.setFlyBehavior(new StrategyFlyFast());

    }
}
