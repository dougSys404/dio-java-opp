package ExercisesClass;

public class Cleaner extends Employee{

    @Override
    public void method1(){
        System.out.println("Hi! This is the Employee method1 called from class: " + this.getClass().getSimpleName());
    }


}
