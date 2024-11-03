/**
 * Description:
 * Date: 2024-10-22
 * Time: 21:47
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(()->{
            for (int i = 0; i < 3; i++)
            {
                System.out.println("helloworld");
                try {
                    Thread.sleep(1000);
                 } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        },"自定义线程");
        System.out.println(t.isAlive());
        t.start();
        //t变为守护线程不能组织线程结束

        System.out.println(t.isAlive());
        Thread.sleep(5000);

        System.out.println(t.isAlive());
    }
}
