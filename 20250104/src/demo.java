import java.util.ArrayList;
import java.util.List;

/**
 * Description:展示Aggregatioin和Composittion
 * Date: 2025-01-04
 * Time: 22:30
 */
public class demo {

    class Team {
        private List<Employee> employees;

        public Team() {
            employees = new ArrayList<>();
        }

        public void addEmployee(Employee emp) {
            employees.add(emp);
        }
    }

    class Employee {
        private String name;

        public Employee(String name) {
            this.name = name;
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
