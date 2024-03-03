/**
 * Description:
 * Date: 2024-03-03
 * Time: 20:54
 */
public class Constructor {
    public String name;
    public int age;
    public String color;

    public void eat(){
        System.out.println(this.name+" is Eating~~~");
    }


    public void sleep(){
        System.out.println(this.name+" is Sleeping~~~");
    }

    public void show(){
        System.out.println("name:"+this.name+" age:"+this.age+" color:"+this.color);
    }



    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.show();

        Dog dog1 = new Dog();
        dog1.show();

        Dog dog2 = new Dog();
        dog2.show();

        Dog dog3 = new Dog();
        dog3.show();

    }
}
