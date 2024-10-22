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

        System.out.println("线程ID"+ t.getId());
        System.out.println("线程名字"+ t.getName());
        System.out.println("线程状态"+ t.getState());
        System.out.println("线程优先级"+t.getPriority());
    }
}
