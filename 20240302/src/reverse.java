package src;

/**
 * Description:
 * Date: 2024-03-02
 * Time: 17:08
 */
public class reverse {
    public static void Reverse(int[] array) {
        int left = 0;
        int right = array.length-1;
        while (left<right){
            int tmp=array[left];
            array[left]=array[right];
            array[right]= tmp;
            left++;
            right--;
        }
    }

}
