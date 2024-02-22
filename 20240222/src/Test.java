/**
 * Description:
 * Date: 2024-02-21
 * Time: 20:50
 */
public class Test {
    /**
     * 不能做switch的参数的数据类型有哪些
     * long， float， double，boolean
     * @param args
     */
    public static void main(String[] args) {
        int a = 2;
        switch (a){
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            case 4:
                System.out.println("4");
                break;
            default:
                System.out.println("输入有错！");
                break;
        }

        int i=1;
        while(i<=10){
            System.out.print(i + " ");
            i++;
        }


        //计算1~100奇数和偶数的和
        int j=2;
        while(j<=100) {
            j += 2;
        }        System.out.println("偶数的和"+j);
        int k=1;
        while(k<=100) {
            k += 2;
        } System.out.println("奇数的和"+k);

        //求1~5的阶乘



    }







}
