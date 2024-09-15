/**
 * Description:
 * Date: 2024-09-08
 * Time: 17:46
 */

class MyArray<T>{
    public Object[] array = new Object[10];
    //public T[] array = (T[])new Object[10];

    public void setValue(int pos, T x){
        array[pos]=x;
    }

    public T getValue(int pos){
        return (T)array[pos];
    }
}





public class 泛型 {
    public static void main(String[] args) {




        MyArray<Integer> myArray = new MyArray<>();
        MyArray<String> myArray2 = new MyArray<>();
        myArray.setValue(0,10);
        myArray2.setValue(1,"element1");

        Integer x = myArray.getValue(0);
        String s = myArray2.getValue(1);

        System.out.println(x);
        System.out.println(s);

    }
}
