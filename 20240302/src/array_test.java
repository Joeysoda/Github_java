/**
 * Description:
 * Date: 2024-03-02
 * Time: 20:23
 */
public class array_test {





        public static void bubble(int[]array){
            int tmp;

            for (int i = 0; i < array.length-1; i++) {

                for (int j = 0; j < array.length-1-i; j++) {
                    if(array[j]%2==1&&array[j+1]%2==0){
                        tmp=array[j];
                        array[j]=array[j+1];
                        array[j+1]=tmp;

                    }
                }

            }
        }

        public static void main(String[] args) {
            int[]array={1,2,3,4,5,6};

            bubble(array);

            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i]+" ");
            }
            System.out.println();
        }
    }



