package Revision;

/**
 * Description:
 * Date: 2025-01-06
 * Time: 16:45
 */
public class Singleton {

    private static Singleton instance = new Singleton();;

    private Singleton(){}

    public static Singleton getInstance(){
        return instance;
    }
}
