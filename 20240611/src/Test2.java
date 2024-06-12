class Student {
    /*
    attributes
     */
    //name 只能在student类中使用
    private String name;
    private int age;
    private String sex;
    public static String classRoom="112";
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


    public Student(String name, int age, String sex, String classRoom) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.classRoom = classRoom;
    }


    {//实例代码块执行顺序先于构造代码块
        System.out.println("构造块/实例代码块/非静态代码块");
        this.name = "zhangsan";
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
    Student student2 = new Student("张三",13,"male","112");
    Student student3 = new Student("李四",13,"male","112");
    Student student4 = new Student("王五",13,"male","112");
        System.out.println(Student.classRoom);
        System.out.println(student2.getName());
        //静态成员变量不依赖于对象
    }


    public static void main1(String[] args) {
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