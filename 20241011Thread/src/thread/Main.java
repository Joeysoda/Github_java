/**
 * Description:
 * Date: 2024-10-11
 * Time: 22:20
 */
package thread;
class MyThread extends Thread{
    @Override
    public void run(){
        while(true){
            System.out.println("Hello world");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
public class Main {


        public static void main(String[] args) {

            MyThread t = new MyThread();
            System.out.println("Thread");
            t.start();
        }



    }