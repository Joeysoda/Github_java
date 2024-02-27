/**
 * Description:
 * Date: 2024-02-27
 * Time: 15:49
 */
public class recursive {

    public static int fac(int n){
        if(n ==1){
            return 1;
        }
        return n*fac(n-1);
    }

    public static void main(String[] args) {
     int a = fac(10);
        System.out.println(a);
    }
}
