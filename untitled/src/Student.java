import java.util.Scanner;

public class Student {
   static final int TOTAL_STUDENTS=10;
    static int currentIndex=-1;
   static Student[] student = new Student[TOTAL_STUDENTS];
    static Scanner sc = new Scanner(System.in);
    String name;
    String mobile;
    String roll_number;
    String dob;
    void start(){
        int option;

        System.out.println("press 1 to Add Students"+"\n"+"press 2 to print all Students");
        option = sc.nextInt();
            switch (option) {
                case 1 -> addStudent();
                case 2 -> printStudents();
                default -> System.out.println("not a valid option");
            }
        }
    void init(){
        int continueProcess=0;
        do{
            start();
            System.out.print("press 1 to continue: ");
            continueProcess= sc.nextInt();
        }while(continueProcess==1);
    }
        void addStudent(){
        if(currentIndex>=TOTAL_STUDENTS-1){
            System.out.println("Seats are full");
        }else{
            int StudentNumber=++currentIndex;
            student[StudentNumber]= new Student();
            sc.nextLine();
            System.out.print("Enter Student Name: ");
            student[StudentNumber].name = sc.nextLine();System.out.print("Enter Student mobile number: ");
            student[StudentNumber].mobile = sc.nextLine();System.out.print("Enter Student roll number: ");
            student[StudentNumber].roll_number = sc.nextLine();System.out.print("Enter Student dob: ");
            student[StudentNumber].dob = sc.nextLine();
        }

        }
        void printStudents(){
           for(int i = 0;i<currentIndex+1;i++){
               System.out.print("name: "+student[i].name+" ");
               System.out.print("mobile number : "+student[i].mobile+" ");
               System.out.print("roll number : "+student[i].roll_number+" ");
               System.out.print("dob : "+student[i].dob+" ");
               System.out.println(" ");
           }
        }



}
