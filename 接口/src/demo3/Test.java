package demo3;

/**
 * Description:
 * Date: 2024-06-17
 * Time: 15:40
 */

class Money implements Cloneable {
    public double money = 12.5;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Student implements Cloneable{

    public Money m = new Money();

    public int age;
    public Student(int age){
        this.age=age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //super.clone();
        Student tmp = (Student)super.clone();
        tmp.m= (Money) this.m.clone();
        return tmp;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                '}';
    }
}
public class Test {
    public static void main(String[] args)  throws CloneNotSupportedException{

        Student student1 = new Student (10);
        Student student2 =(Student)student1.clone();

        System.out.println(student1.m.money);
        System.out.println(student2.m.money);
        System.out.println("===========");
        student2.m.money = 100;


        System.out.println(student1.m.money);
        System.out.println(student2.m.money);
        System.out.println("深拷贝");
    }
}
