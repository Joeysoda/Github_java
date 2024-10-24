/**
 * Description:
 * Date: 2024-10-24
 * Time: 15:34
 */
public class ConcreteFactoryA extends   Factory{
    @Override
    public Product factoryMethod() {
        return new ConcreteProductA();
    }
}
