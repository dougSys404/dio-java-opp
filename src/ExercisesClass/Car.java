package ExercisesClass;

public class Car {

    String color;
    String model;
    double fuelTankCapacity;

    Car(){}

    Car(String color, String model, double fuelTankCapacity){
        this.color = color;
        this.model = color;
        this.fuelTankCapacity = fuelTankCapacity;
    }

    double fillTank(double fuelTankCapacity, double price){

        return fuelTankCapacity * price;
    }

    String getColor() {
        return color;
    }

    void setColor(String color) {
        this.color = color;
    }

    String getModel() {
        return model;
    }

    void setModel(String model) {
        this.model = model;
    }

    double getFuelTankCapacity() {
        return fuelTankCapacity;
    }

    void setFuelTankCapacity(double fuelTankCapacity) {
        this.fuelTankCapacity = fuelTankCapacity;
    }
}
