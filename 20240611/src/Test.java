/**
 * Description:
 * Date: 2024-06-11
 * Time: 15:52
 */
class Person {
    /*
    attributes
     */
    public String name;
    public int age;
    public String sex;

    /*
    methods
     */
    public void sleep(){
        System.out.println(this.name + "Sleeping!");
    }

    public void show(){
        System.out.println("Name:"+this.name+" age:"+this.age+" sex:"+this.sex);
    }

    /*
    constructor methods
     */
    public Person(){
        System.out.println("Without prarteters");
    }

    public Person(String name, int age, String sex) {
        System.out.println("With parameters");
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
}
public class Test{
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.age = 10;
        person1.name ="z";
        person1.sex= "male";
        person1.show();
        System.out.println("---------------");

        Person person2 = new Person();
        person2.age = 1;
        person2.name ="zs";
        person2.sex= "malesfas";
        person2.show();
        System.out.println("---------------");

        Person person3 = new Person();
        person3.show();
        System.out.println("---------------");
        Person person4 = new Person("a",12,"male");
        person4.show();
    }

}

