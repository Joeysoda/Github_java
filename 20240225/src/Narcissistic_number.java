/**
 * Description:
 * Date: 2024-02-25
 * Time: 15:49
 */
public class Narcissistic_number {
    public static void main(String[] args) {
        for (int i = 0; i <=999999; i++) {
            //计算当前数字是几位数
            int count = 0;
            //123
            int tmp = i;
            while(tmp != 0){
                count++;
                tmp/=10;
            }
            tmp=i;//123
            //2.求tmp的每一位
            int sum=0;
                while(tmp!=0){
                    sum+=Math.pow(tmp%10,count);
                    tmp/=10;//12
                }
                if(sum==i){
                    System.out.println(i);
                }


        }
    }
}
