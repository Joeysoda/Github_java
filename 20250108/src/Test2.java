/**
* Description:
* Date: 2025-01-08
* Time: 12:33
*/
interface  Aninmal{
    void eat();
}
class Lion implements Animal{
    @Override
    public void eat(){
        System.out.println(" 1");
    }
}
class Monkey implements Animal{
    @Override
    public   void eat(){
        System.out.println(" 2");
    }
}

class Feeder {
    private Animal animal;

    public Feeder (Animal animal){
        this.animal = animal;
    }
}

public class Test2 {
}


abstract  class A {
    public abstract void  abc();
}

interface  B{
    void abcd();
}