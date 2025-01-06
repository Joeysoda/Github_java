public class CheesePizza extends Pizza{
        @Override
    public void prepare(){
            System.out.println("Preparing Cheese Pizza");
        }

    @Override
    public void box() {
        System.out.println("Box");
    }

    @Override
    public void cut() {
        System.out.println("Cut");
    }

    @Override
    public void bake() {
        System.out.println("baking");
    }
}
