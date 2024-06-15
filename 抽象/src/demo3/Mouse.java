package demo3;

/**
 * Description:
 * Date: 2024-06-15
 * Time: 15:54
 */
public class Mouse implements IUSB{
    @Override
    public void openDevice() {
        System.out.println("打开鼠标");
    }

    @Override
    public void closeDevice() {
        System.out.println("关闭鼠标");
    }
    public void click(){
        System.out.println("点击鼠标");
    }
}
