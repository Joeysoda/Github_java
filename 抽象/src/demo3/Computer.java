package demo3;
/**
 * Description:
 * Date: 2024-06-15
 * Time: 15:58
 */
public class Computer{

    public void powerOn() {
        System.out.println("打开电脑");
    }


    public void powerOff() {
        System.out.println("关闭电脑");
    }


    public void useDevice(IUSB usb){

        usb.openDevice();

        if(usb instanceof Mouse){
            Mouse mouse = (Mouse) usb;
            mouse.click();
        }

        if (usb instanceof Keyboard){
            Keyboard keyboard = (Keyboard) usb;
            keyboard.input();
        }

        usb.closeDevice();
    }


    public static void main(String[] args) {
      Computer computer = new Computer();
      computer.powerOn();
      computer.useDevice(new Keyboard());
      computer.useDevice(new Mouse());
      computer.powerOff();
    }}
