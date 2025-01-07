/**
 * Description:
 * Date: 2025-01-07
 * Time: 23:12
 */

interface Animal{
    void eat();
}

class Lion implements  Animal{
    @Override
    public void eat(){
        System.out.println("Meat");
    }
}
class Monkey implements Animal{
    @Override
    public void eat(){
        System.out.println("Fruits");
    }
}

class ZooKeeper{
    private Animal animal;

    public ZooKeeper(Animal animal){
        this.animal=animal;
    }

    public void feed(){
        animal.eat();
    }
}

public class Exam {
    public static void main(String[] args) {

        ZooKeeper zooKeeper = new ZooKeeper(new Lion());
        zooKeeper.feed();
        ZooKeeper zooKeeper2 = new ZooKeeper(new Monkey());
        zooKeeper2.feed();
    }

}
