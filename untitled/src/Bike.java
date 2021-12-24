import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Bike {
    String company;
    String name;
    String cc;
    static int  currIndex=-1;
    static ArrayList<Bike> bikeArray = new ArrayList<>(10);
    static Scanner sc  = new Scanner(System.in);
    void addBike(){
        currIndex++;
        System.out.println("Enter bike name: ");
         bikeArray.add() = sc.nextLine();
        System.out.println("Enter bike Company: ");
        bikeArray.get(currIndex).company = sc.nextLine();
        System.out.println("Enter Engine CC: ");
        bikeArray.get(currIndex).cc = sc.nextLine();
    }

    void printBikeDetails(){
        for(int i =0;i<=currIndex;i++){
            System.out.println("Bike name is: "+bikeArray.get(i).name);
            System.out.println("Bike Company name is: "+bikeArray.get(i).company);
            System.out.println("Bike Engine cc is: "+bikeArray.get(i).cc);
        }
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
