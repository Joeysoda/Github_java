package demoanimal;

/**
 * Description:
 * Date: 2024-06-25
 * Time: 0:19
 */
public class Test3 {
    public static void eatFunc(Animal animal){
        animal.eat();
    }
public static void walkFunc(IRunning running){
        running.run();
}
    public static void main(String[] args) {
        eatFunc(new Duck("McDuck") );
        walkFunc(new Duck("helon"));
    }
}
