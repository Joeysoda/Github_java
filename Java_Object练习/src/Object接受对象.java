/**
 * Description:
 * Date: 2024-09-17
 * Time: 15:51
 */
public class Object接受对象 {
    public static void printObject(Object obj){
        //获取对象的类名
        System.out.println("Class: "+obj.getClass().getName());

        //获取字符串表达形式
        System.out.println("toString: "+obj.toString());
    }

    public static void main(String[] args) {
        //创建不同类型的对象
        String str = "Hello World";
        int number = 100;
        Double decimal = 45.67;

        // 使用 Object 接收并打印对象信息
        printObject(str);  // String 类型
        printObject(number);  // Integer 类型
        printObject(decimal);  // Double 类型

    }
}
