import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args){
        int key=1;
        Scanner sc = new Scanner(System.in);
        FileManager fileoperation = new FileManager();
        System.out.println("Enter Mobile Name: ");
        String mobileName = sc.nextLine();
        fileoperation.FileCreation(mobileName);
        while(key==1) {
            System.out.println("Hello Welcome to A1 Mobile shapp :)");
            System.out.println("Press 1 to ADD Mobile Info : \n" +
                    "Press 2 to View Mobile Items: \n" +
                    "Press 3 to Exit: \n");

            int option = sc.nextInt();
            sc.nextLine();
            switch(option){
                case 1:
                            System.out.println("Enter Mobile Details : ");
                            String mobile_Details = sc.nextLine();
                            fileoperation.writeFile(mobile_Details);
                            System.out.println("Details Added Sucessfully");
                            break;



                case 2:
                    fileoperation.readFile();
                    break;

                case 3:
                    break;
            }
            System.out.println("\n\n\n");
            System.out.println("press 1 to continue: ");
            key= sc.nextInt();
        }

    }
}
