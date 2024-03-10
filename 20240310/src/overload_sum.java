import java.util.Scanner;

/**
 * Description:
 * Date: 2024-03-10
 * Time: 21:52
 */
public class overload_sum {
    public static int add(int x,int y){
        return x+y;
    }
    public static float add(float x, float y,float z){
    return x+y+z;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 =in.nextInt();
        int num2 =in.nextInt();
        float num3 =in.nextFloat();
        float num4 =in.nextFloat();
        float num5 =in.nextFloat();
        int sum1=add(num1,num2);
        double sum2 = add(num3,num4,num5);
        System.out.println(sum1);
        System.out.println(sum2);
    }
}
