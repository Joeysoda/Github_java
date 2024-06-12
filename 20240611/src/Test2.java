class Student {
    /*
    attributes
     */
    //name 只能在student类中使用
    private String name;
    private int age;
    private String sex;

    /*
        methods
         */
    public void sleep(){
        System.out.println(this.name + "Sleeping!");
    }

    public void eat(){
        System.out.println(this.name + "Eatting!");
    }

    public void show(){
        System.out.println("Name:"+this.name+" age:"+this.age+" sex:"+this.sex);
    }

    /*
    constructor methods
     */
    public Student(){
        System.out.println("Without prarteters");
    }

    public Student(String name, int age, String sex) {
        System.out.println("With parameters");
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    /*
    创建setter和getter分别进行赋值和访问
    get和set 用来对private进行访问
     */
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }
}

public class Test2{
    public static void main(String[] args) {
        Student student1 = new Student();
        //这里不能使用,因为name是private
        //private只能在当前class只用
        //public在哪里都能使用
        //student1.name="huawei ";
        student1.setName("wnagwu");
        System.out.println(student1.getName());
        student1.eat();
    }
}