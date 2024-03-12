/**
 * Description:
 * Date: 2024-03-12
 * Time: 22:13
 */
public class Person {

        /*
            属性/成员变量
            1.定义在类的内部，方法的外部
            2.默认值是null
         */
        public String name;
        public int age;
        public String sex;

        //成员方法
        public void eat(){
            System.out.println(name+" 正在吃饭");
        }
        public void sleep(){
            System.out.println(name+"正在睡觉");
        }
        public void show(){
            System.out.println("姓名: "+name+"年龄："+age+"性别："+sex);

        }


            public static void main(String[] args) {
                //类的实例化
                Person person1=new Person();
                person1.age = 10;
                person1.name = "zhangsan";
                person1.sex = "男";
                person1.show();

                Person person2=new Person();
                person2.age = 10;
                person2.name = "zhangsan";
                person2.sex = "男";
                person2.show();
            }
        }


