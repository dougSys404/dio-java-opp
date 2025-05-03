package auxiliary;

import ExercisesClass.Car;

import java.util.Scanner;

public final class AuxiliaryCaller {

    public static void caller(){
        Scanner sc = new Scanner(System.in);
        int option;
        System.out.println("Choose the exercise!");
        System.out.println("1 - Create 3 cars");
        System.out.println("0 - Quit");
        System.out.println();
        System.out.print("Option: ");
        option = sc.nextInt();

        switch (option){
            case 0: {
                System.out.println("Exiting program....");
                break;
            }
            case 1: {
                makeCars();
                break;
            }
            default:{
                System.out.println("Invalid option!");
            }
        }


    }

    public static void makeCars(){
        Scanner sc = new Scanner(System.in);
        int counter = 1;

        System.out.println("Calling method makeCars");

        while (counter <= 3) {
            System.out.println("Input #" + counter);
            System.out.println();
            System.out.print("Enter car's color: ");
            String color = sc.nextLine();
            System.out.print("Enter car's model: ");
            String model = sc.nextLine();
            System.out.print("Enter car's fuel tank capacity: ");
            double tankFuel = sc.nextDouble();

            Car car = new Car(color,model,tankFuel);

            System.out.println("\nCar info | Color: " + car.getColor()
                    + " | Model: " + car.getModel()
                    + " | Fuel tank capacity: " + car.getFuelTankCapacity()
            );

            System.out.print("\nNow, enter gas price to fill tank: ");
            double price = sc.nextDouble();

            System.out.println("\nTo fill the tank, you'll spend $"
                    + (car.fillTank(car.getFuelTankCapacity(), price)));
            counter++;
        }

    }
}
