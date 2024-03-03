/**
 * Description:
 * Date: 2024-03-03
 * Time: 19:39
 */
public class Date {
        //attributes
    public int year;
    public int month;
    public int day;

        //method1
    public void setDate(int y,int m,int d){
       this.year = y;
        this.month = m;
        this.day = d;
    }

        //method2
    public void printDate(){
        System.out.println(this.year + "年" + this.month + "月" + this.day +"日"  );
    }

    public static void main(String[] args) {
        Date date = new Date();
        date.setDate(2024,3,3);
        date.printDate();
    }
}
