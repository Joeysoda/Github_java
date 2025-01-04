import java.util.ArrayList;
import java.util.List;

/**
 * Description:展示Aggregatioin和Composittion
 * Date: 2025-01-04
 * Time: 22:30
 */
public class demo {

    class Team {
        private Employee employee; // 聚合关系

        public Team(Employee employee) {
            this.employee = employee;
        }
    }

    class Employee {
        public Employee() {
        }
    }







    public class House{

        public House(){
        }

        private class Brick{

            public Brick (){

            }
        }
    }
}
