/**
 * Description:
 * Date: 2024-02-26
 * Time: 12:44
 */
public class overload {
    public static int add(int a, int b){
    return a+b;
}
    public static double add(double a , double b){
        return a+b;
    }

    public static void main(String[] args) {

        int ret2= add(1,2);
        int ret1 = add(1,2);
        System.out.println("ret1=" +ret1 + " ret2=" +ret2);
    }
}
