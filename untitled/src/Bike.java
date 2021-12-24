import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Bike {
    String company;
    String name;
    String cc;
    static ArrayList<Bike> bikesArray = new ArrayList<>();
    static Scanner sc  = new Scanner(System.in);
    Bike bikes = new Bike();
    void addBike(){

        System.out.println("Enter bikes name: ");
        bikes.name = sc.nextLine();
        System.out.println("Enter bikes Company: ");
        bikes.company = sc.nextLine();
        System.out.println("Enter Engine CC: ");
        bikes.cc = sc.nextLine();
        bikesArray.add(bikes);
    }

    void printBikeDetails(){
       bikesArray.forEach(bikes1 -> {
           System.out.println("Company: "+bikes1.company);
           System.out.println("name: "+bikes1.name);
           System.out.println("Engine Cc : "+bikes1.cc);
       });
    }
    void start(){

        System.out.println("Press 1 to Add Bike Details: ");
        System.out.println("Press 2 to Print Bike Details: ");
        int option = sc.nextInt();
        switch (option){
            case 1: addBike();
            case 2 : printBikeDetails();
            default:
                System.out.println("Enter Valid Option ");

        }
    }
    void init() {
        int continueProcess;

        do {
            start();
            System.out.print("press 1 to continue: ");
            continueProcess = sc.nextInt();
        } while (continueProcess == 1);
    }
}
