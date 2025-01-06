// NBA分店具体工厂类
    public class NBArabina extends Arabina {
        @Override
        public Pizza createPizza(String type) {
            if (type.equalsIgnoreCase("cheese")) {
                return new CheesePizza();
            } else if (type.equalsIgnoreCase("pepperoni")) {
                return new PepperoniPizza();
            }
            return null;
        }
    }
