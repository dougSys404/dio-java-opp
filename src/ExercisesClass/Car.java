package ExercisesClass;

public class Car {

    String color;
    String model;
    double fuelTankCapacity;

    public Car(){}

    public Car(String color, String model, double fuelTankCapacity){
        this.color = color;
        this.model = model;
        this.fuelTankCapacity = fuelTankCapacity;
    }

    public double fillTank(double fuelTankCapacity, double price){

        return fuelTankCapacity * price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getFuelTankCapacity() {
        return fuelTankCapacity;
    }

    void setFuelTankCapacity(double fuelTankCapacity) {
        this.fuelTankCapacity = fuelTankCapacity;
    }
}
