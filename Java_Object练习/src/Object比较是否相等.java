/**
 * Description:
 * Date: 2024-09-17
 * Time: 16:00
 */

class Person{
    String name;
    Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj)return true; //判断地址是否相同
        if(obj == null || getClass() !=obj.getClass()) return false; // 判断类型是否相同

        Person person = (Person) obj;  // 强制转换为 Person
        return age == person.age && name.equals(person.name);  // 比较内容
    }
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }


}

public class Object比较是否相等 {

    public static void main(String[] args) {
        Person p1 = new Person("Alice", 30);
        Person p2 = new Person("Alice", 30);
        Person p3 = new Person("Alice", 30);
    }

}
