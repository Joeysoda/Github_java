package src;


/**
 * Description:
 * Date: 2024-03-02
 * Time: 16:08
 */
public class bubble_sort {
    public static void bubble(int[]array){
        int tmp;

        for (int i = 0; i < array.length-1; i++) {
            boolean flg=false;//优化：如果外层循环前一个数字小于后一个，则不进行内层循环,如： [1,2,3]
            for (int j = 0; j < array.length-1-i; j++) {
                if(array[j]>array[j+1]){
                    tmp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=tmp;
                    flg=true;
                }
            }
            if(flg==false){
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[]array={2,4,3,5,63,21,3};

        bubble(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
}
