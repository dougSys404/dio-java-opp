package ExercisesClass;

public class Mathamatics implements MathOperations{
    @Override
    public double sum(double numberOne, double numberTwo) {
        return numberOne + numberTwo;
    }

    @Override
    public double multiplication(double numberOne, double numberTwo) {
        return numberOne * numberTwo;
    }

    @Override
    public double substraction(double numberOne, double numberTwo) {
        return numberOne - numberTwo;
    }

    @Override
    public double division(double numberOne, double numberTwo) {
        return numberOne / numberTwo;
    }
}
