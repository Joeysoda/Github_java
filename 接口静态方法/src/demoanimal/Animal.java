package demoanimal;

/**
 * Description:
 * Date: 2024-06-24
 * Time: 23:57
 */
public abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void eat();

}

