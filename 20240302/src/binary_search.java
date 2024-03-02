package src;

/**
 * Description:
 * Date: 2024-03-02
 * Time: 15:45
 */
public class binary_search {
    public static int binarySearch(int [] array,int key) {
        int left=0;
        int right=array.length-1;
        while(left<=right){
            //int mid = (left+right)>>>1;
           int mid = left + ((right-left)>>>1);//防止越界
            if(array[mid]<key){
                left=mid+1;
            }
            else if (array[mid]>key){
                right=mid-1;
            }
            else{
                return mid;
            }
        }return -1;


    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int key = 1;
        int ret = binarySearch(array, key);
        System.out.println(ret);
    }

}
