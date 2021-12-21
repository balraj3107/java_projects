import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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
    File studentdata;

    void FileCreation(String FilePath){
        studentdata= new File(FilePath);
        try {
            if(studentdata.createNewFile()){
                System.out.println("File is Created");
            }
            else{
                System.out.println("File is already exists!!");
            }
        } catch (IOException e) {
            System.out.println("can't create File");
        }
    }

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
            String student_details = (student[StudentNumber].name+"|"+student[StudentNumber].mobile
            +"|"+student[StudentNumber].roll_number+"|"+student[StudentNumber].dob+"\n" );
            writeFile(student_details);
        }

        }
    void writeFile(String data){
        try {
            FileWriter fileWriter = new FileWriter(studentdata,true);
            //fileWriter.write(data);
            System.out.println(data);
            fileWriter.append(data);
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("file can't be Written");
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
