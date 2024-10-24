import java.awt.image.CropImageFilter;

/**
 * Description:
 * Date: 2024-10-24
 * Time: 15:36
 */
public class Main {
    public static void main(String[] args) {
        Factory factory1 = new ConcreteFactoryA();
        Factory factory2 = new ConcreteFactoryA();
        Product product = factory1.factoryMethod();
        product.operation();
    }
}
