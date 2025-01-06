public abstract class Arabina{
        public abstract Pizza createPizza(String type);
            public void orderPizza(String type) {
                Pizza pizza = createPizza(type);
                if (pizza != null) {
                    pizza.prepare();
                    pizza.bake();
                    pizza.cut();
                    pizza.box();
                } else {
                    System.out.println("This type of pizza is not available.");
                }
            }
    }
