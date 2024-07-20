/**
 * Description:
 * Date: 2024-07-07
 * Time: 16:11
 */
public class Yield {
    public static void main(String[] args) {
        String data = "one";
        int result = switch (data){
            case "one": yield 1;
            case "two": yield 2;
            case "three" : yield 3;
            default : yield 4;
        };
        System.out.println(result);
    }

    public static void main1(String[] args) {
        String data = "one";
        int result = switch (data){
            case "one"-> 1;
            case "two"-> 2;
            case "three" ->3;

            default->4;
        };











        System.out.println(result);
    }
}
