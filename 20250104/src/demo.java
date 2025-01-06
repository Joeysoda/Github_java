import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.List;

/**
 * Description:展示Aggregatioin和Composittion
 * Date: 2025-01-04
 * Time: 22:30
 */
public class demo {

//class Team {
//    public Team (Person person){
//
//    }
//}
//class Person{
//
//    public Person(){
//
//    }
//}//low coupling
//
//
//
//
//
//class House {
//    public House(Brick brick){
//
//    }
//    class Brick {
//        public Brick(){
//
//        }
//    }
//  }
//    //解释overload override
//    class Calculator{
//        public int add(int a, int b){
//            return a + b;
//        }
//
//        public double add (double a, double b){
//            return a +b;
//        }
//    }
//
//
//    class Animal{
//        public void sound(){
//            System.out.println("Animal sound");
//        }
//    }
//
//    class Dog extends Animal{
//        @Override
//        public void sound(){
//            System.out.println("Dog sound");
//        }
//    }
//
    public abstract class Animal{

        public abstract void swim();
//        public String name;
//        public Animal(String name){
//            this.name=name;
//        }
//
//        public void sleep(){}
}
    interface  Running{
        public abstract void run();
    }

//    class Dog extends Animal implements Running{
//        public Dog(){
//            super("name");
//        }
//        @Override
//        public void swim(){
//            System.out.println("a");
//        }
//        @Override
//        public void run(){
//
//        }








    //=================违反Open Close Principle===================
    //=======================例子1=========================
//    public double calculateSalary(Employee employee) {
//        double salary = 0.0;
//        if (employee is Developer) {
//            Developer developer = (Developer) employee;
//            salary += employee.workingHours * employee.hourlyRate;
//        }
//  else if (employee is TeamLeader) {
//            TeamLeader teamLeader = (TeamLeader) employee;
//            salary += teamLeader.workingHours * teamLeader.hourlyRate * teamLeader.bonus;
//        }
//  else if (employee is Recruiter) {
//            Recruiter recruiter = (Recruiter) recruiter;
//            salary += recruiter.workingHours * recruiter.hourlyRate * recruiter.bonus * 1.5;
//        }
//
//        return salary;
//    }

    public abstract  class Employee{
        public abstract  double calculateSalary();
        public double hours, rates, bonus;

    }
    public class Developer extends  Employee{

        @Override
        public double calculateSalary(){
            return hours * rates;
        }
    }
    public class TeamLeader extends  Employee{

        @Override
        public double calculateSalary(){
            return hours * rates * bonus;
        }
    }
    public class Recruiter extends  Employee{

        @Override
        public double calculateSalary(){
            return hours * rates * bonus;
        }
    }

//========================例题2===============================
//public class NotificationService {
//
//    public void sendNotification(String notificationType, String message) {
//        if (notificationType.equalsIgnoreCase("EMAIL")) {
//            sendEmail(message);
//        } else if (notificationType.equalsIgnoreCase("SMS")) {
//            sendSMS(message);
//        } else if (notificationType.equalsIgnoreCase("PUSH")) {
//            sendPush(message);
//        }
//    }
//
//    private void sendEmail(String message) {
//        System.out.println("Sending EMAIL notification: " + message);
//    }
//
//    private void sendSMS(String message) {
//        System.out.println("Sending SMS notification: " + message);
//    }
//
//    private void sendPush(String message) {
//        System.out.println("Sending PUSH notification: " + message);
//    }
//}
    public abstract class NotificationService{
        public  String message;
        public abstract String sendNotification ();
}
    private class EMAIL extends NotificationService{

        @Override
        public String sendNotification(){
        return "Sending EMAIL notification: "+message;
        }
    }
    private class SMS extends NotificationService{

        @Override
        public String sendNotification(){
            return "Sending EMAIL notification: "+message;
        }
    }
    private class PUSH extends NotificationService{

        @Override
        public String sendNotification(){
            return "Sending EMAIL notification: "+message;
        }
    }


//    }





















//abstract class Animal {
//    protected String name;
//
//    public Animal(String name) {
//        this.name = name;
//    }
//
//    public void sleep() {
//        System.out.println(name + " 正在睡觉");
//    }
//
//    public abstract void makeSound();
//}
//
//    class Dog extends Animal {
//        public Dog(String name) {
//            super(name);
//        }
//
//        @Override
//        public void makeSound() {
//            System.out.println(name + " 在汪汪叫");
//        }
//    }
//
//    interface Flyable {
//        void fly();
//    }
//
//    interface Swimmable {
//        void swim();
//    }
//
//    class Duck extends Animal implements Flyable, Swimmable {
//        public Duck(String name) {
//            super(name);
//        }
//
//        @Override
//        public void fly() {
//            System.out.println("鸭子在飞");
//        }
//
//        @Override
//        public void swim() {
//            System.out.println("鸭子在游泳");
//        }
//
//        @Override
//        public void makeSound() {
//
//        }
//    }
}
