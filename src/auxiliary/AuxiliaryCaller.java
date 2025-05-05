package auxiliary;

import ExercisesClass.*;

import java.util.Scanner;

public final class AuxiliaryCaller {

    public static void caller(){
        Scanner sc = new Scanner(System.in);
        int option;
        System.out.println("Choose the exercise!");
        System.out.println("1 - Create 3 cars");
        System.out.println("2 - Show Employees with inheritance");
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

            case 2: {
                showEmployees();
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
            System.out.print("Enter vehicle's color: ");
            String color = sc.nextLine();
            System.out.print("Enter vehicle's model: ");
            String model = sc.nextLine();
            System.out.print("Enter vehicle's fuel tank capacity: ");
            double tankFuel = sc.nextDouble();

            Vehicle vehicle = new Vehicle(color,model,tankFuel);

            System.out.println("\nVehicle info | Color: " + vehicle.getColor()
                    + " | Model: " + vehicle.getModel()
                    + " | Fuel tank capacity: " + vehicle.getFuelTankCapacity()
            );

            System.out.print("\nNow, enter gas price to fill tank: ");
            double price = sc.nextDouble();

            System.out.println("\nTo fill the tank, you'll spend $"
                    + (vehicle.fillTank(vehicle.getFuelTankCapacity(), price)));
            counter++;
        }

    }

    public static void showEmployees(){
        /* upcasting
        Employee manager = new Manager();
        Employee salesPerson = new SalesPerson();
        Employee cleaner = new Cleaner();

         */

        /* downcasting, do not use it!

        Manager manager1 = (Manager) new Employee();
        SalesPerson salesPerson1 = (SalesPerson) new Employee();
        Cleaner cleaner1 = (Cleaner) new Employee();

         */
        System.out.println("Method showEmployees called!");
        System.out.println("");
        Employee[] employees = new Employee[]{
                new Manager(),
                new SalesPerson(),
                new Cleaner(),
                new Employee()
        };

        System.out.println("Overrited methods:");
        for (Employee employee : employees){
            employee.method1();
        }

        System.out.println("");
        System.out.println("Child methods:");
        for (Employee employee : employees){
            employee.method2();
        }
    }
}
