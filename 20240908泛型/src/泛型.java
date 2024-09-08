/**
 * Description:
 * Date: 2024-09-08
 * Time: 17:46
 */

class MyArray{
    public Object[] array = new Object[10];

    public void setValue(int pos, Object x){
        array[pos]=x;
    }

    public Object getValue(int pos){
        return array[pos];
    }
}


public class 泛型 {
    public static void main(String[] args) {

        MyArray myArray = new MyArray();
        myArray.setValue(0,10);
        myArray.setValue(1,"element1");

        String s = (String)myArray .getValue(2);
    }
}
