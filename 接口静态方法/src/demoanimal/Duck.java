package demoanimal;

import jdk.swing.interop.SwingInterOpUtils;

/**
 * Description:
 * Date: 2024-06-25
 * Time: 0:08
 */
public class Duck extends Animal implements IFlying, IRunning, ISwimming{
    public Duck(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(this.name+" is eating");
    }

    @Override
    public void fly(){
        System.out.println(this.name+"is flying");
    }

    @Override
    public void run() {
        System.out.println(this.name+" is runing");
    }

    @Override
    public void swim() {
        System.out.println(this.name+" is swimming");
    }
}
