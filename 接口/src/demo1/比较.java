package demo1;

import java.util.Arrays;

/**
 * Description:
 * Date: 2024-06-17
 * Time: 10:24
 */
class Student implements Comparable<Student>{
    public String name;
    public int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.age-o.age;
    }
}
public class 比较 {

    public static void mySort(Comparable[] comparable) {
        for (int i = 0; i < comparable.length; i++) {
            for (int j = 0; j < comparable.length - 1 - i; j++) {
                if (comparable[j].compareTo(comparable[j + 1]) > 0) {
                    Comparable tmp = comparable[j];
                    comparable[j] = comparable[j + 1];
                    comparable[j + 1] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("zhangsan", 10);
        students[1] = new Student("lisi", 15);
        students[2] = new Student("wangwu", 20);
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));
    }


        public static void main2 (String[]args){
            Student[] students = new Student[3];
            students[0] = new Student("zhangsan", 10);
            students[1] = new Student("lisi", 15);
            students[2] = new Student("wangwu", 20);
            Arrays.sort(students);
            System.out.println(Arrays.toString(students));
        }



    public static void main1(String[] args) {
        Student student1 = new Student("zhangsan", 10);
        Student student2 = new Student("lisi", 15);
        Student student3 = new Student("wangwu", 20);
//        if(student1>student2){
//
//        }
        if (student1.compareTo(student2) > 0) {
            System.out.println("str1 > str2");
        }
        System.out.println("str1<=str2");

    }

}