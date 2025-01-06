// SHA分店具体工厂类
    public class SHArabina extends Arabina {
        @Override
        public Pizza createPizza(String type) {
            if (type.equalsIgnoreCase("pepperoni")) {
                return new PepperoniPizza();
            } else if (type.equalsIgnoreCase("cheese")) {
                return new CheesePizza();
            }
            return null;
        }
    }
