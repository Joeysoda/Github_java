/**
 * Description:
 * Date: 2024-02-22
 * Time: 20:47
 */
public class factrorial1to5 {
    public static void main(String[] args) {


    int j = 1;
    int sum = 0;
    while (j<=5){
        int i =1;
        int ret = 1;
        while (i<=j){
            ret *= i;
            i++;

        }
        sum+=ret;
        j++;

    }
   System.out.println(sum);

}}
