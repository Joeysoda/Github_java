/**
 * Description:
 * Date: 2024-10-22
 * Time: 21:47
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(()->{
            while (true){
                System.out.println("helloworld");
                try {
                    Thread.sleep(1000);
                 } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        },"自定义线程");
        t.start();

        while (true){
            System.out.println("Hello Main");
            Thread.sleep(1000);
        }
    }
}
