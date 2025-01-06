public class PizzaTest {
        public static void main(String[] args) {
            // NBA 分店
            Arabina nbaStore = new NBArabina();
            System.out.println("Order from NBA store:");
            nbaStore.orderPizza("cheese");
            nbaStore.orderPizza("pepperoni");

            // SHA 分店
            Arabina shaStore = new SHArabina();
            System.out.println("\nOrder from SHA store:");
            shaStore.orderPizza("pepperoni");
        }
    }


