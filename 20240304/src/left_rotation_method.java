/**
 * Description:
 * Date: 2024-03-04
 * Time: 14:10
 */
public class left_rotation_method {


        public static String[] leftRotateArray(int d, String[] arr) {
            int n = arr.length;
            String[] rotatedArr = new String[n];

            // Perform left rotation
            for (int i = 0; i < n; i++) {
                rotatedArr[(i + n - d) % n] = arr[i];
            }

            return rotatedArr;
        }


        public static void main(String[] args) {
        // Checking if there are enough arguments
        if (args.length < 2) {
            System.out.println("Usage: java LeftRotation <d> <element1> <element2> ...");

        }

        // Parsing the value of d from command line argument
        int d = Integer.parseInt(args[0]);

        // Extracting elements from command line arguments
        String[] elements = new String[args.length - 1];
        System.arraycopy(args, 1, elements, 0, args.length - 1);

        // Performing left rotation
        String[] result = leftRotateArray(d, elements);

        // Outputting the result array
        for (String element : result) {
            System.out.print(element + " ");
        }

    }

}


