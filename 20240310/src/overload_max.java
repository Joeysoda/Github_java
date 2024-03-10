import java.util.Scanner;

/**
 * Description:
 * Date: 2024-03-10
 * Time: 22:08
 */
public class overload_max {
    public static int max(int x,int y){
        if(x<y){
            return x;
        }
        return y;
    }
    public static float max(float x, float y,float z){
        if (x<y){
            if(y<z&&x<z) {
                return x;
            }
            else
                return z;
        }
        else{//y<x
            if (z<y&&z<x){
                return z;
            }else return y;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 =in.nextInt();
        int num2 =in.nextInt();
        float num3 =in.nextFloat();
        float num4 =in.nextFloat();
        float num5 =in.nextFloat();
        int sum1=max(num1,num2);
        double sum2 = max(num3,num4,num5);
        System.out.println(sum1);
        System.out.println(sum2);
    }
}
