package ExercisesClass;

public class Employee {


    public void method1(){
        System.out.println("Hi! This is the Employee method1 called from class: " + this.getClass().getSimpleName());
    }

    public void method2(){
        System.out.println("Hi! This is the Employee method2 called from class: " + this.getClass().getSimpleName());
    }
}
