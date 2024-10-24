/**
 * Description:
 * Date: 2024-10-24
 * Time: 15:35
 */
public class ConcreteFactoryB extends Factory{
    @Override
    public Product factoryMethod() {
        return new ConcreteProductB();
    }
}
