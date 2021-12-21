import java.util.Scanner;

public class Start {
   public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
        Student student   = new Student();
       System.out.println("Enter Batch Name : ");
       String batch_name = sc.nextLine();
        student.FileCreation(batch_name);
        student.init();

    }


}
