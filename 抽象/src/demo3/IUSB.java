package demo3;

/**
 * Description:
 * Date: 2024-06-15
 * Time: 15:53
 */
public interface IUSB {
    //变量默认为public s f
    public static final double brand = 3.0;

    //方法默认是public abstract
    public abstract void openDevice();
    void closeDevice();
}
