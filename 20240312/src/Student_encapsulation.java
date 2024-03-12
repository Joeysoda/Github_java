/**
 * Description:
 * Date: 2024-03-12
 * Time: 23:01
 */
public class Student_encapsulation {
        class Student {
            /*
                属性/成员变量
                1.定义在类的内部，方法的外部
                2.默认值是null
             */
            private String name;
            public int age;
            public String sex;

            //成员方法
            public void eat() {
                System.out.println(this.name + " 正在吃饭");
            }

            public void sleep() {
                System.out.println(this.name + "正在睡觉");
            }

            public void show() {
                System.out.println("姓名: " + this.name + "年龄：" + this.age + "性别：" + this.sex);

            }

            //构造方法
            public Student() {
                System.out.println("不带参数的构造方法");
            }

            public Student(String name, int age, String sex) {
                this.name = name;
                this.age = age;
                this.sex = sex;
                System.out.println("带有三个参数的构造方法");
            }
        }
        public static void main(String[] args) {
            //类的实例化
            Student_encapsulation student1 =  new Student_encapsulation();
            //student1.name="JieZHANG";由于此处name被修饰成private，导致在class Student外的内容不能被修饰
        }

}
