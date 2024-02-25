/**
 * Description:
 * Date: 2024-02-25
 * Time: 20:01
 */
public class First_add_then_minus {
        public static double func(){
            double sum=0.0;
                    int flg = 1;
                    for(int i=1;i<=100;i++){
                        sum+=1.0/i*flg;
                        flg=-flg;//1  -1  1  -1

                    }return sum;

}

    public static void main(String[] args) {
        System.out.println(func());
    }

}
