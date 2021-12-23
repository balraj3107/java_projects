import java.io.*;
import java.util.Scanner;

public class Student {
    static final int TOTAL_student = 10;
    static int currentIndex = -1;
    static Student[] student = new Student[TOTAL_student];
    static Scanner sc = new Scanner(System.in);
    String name;
    String mobile;
    String rollNumber;
    String dob;
    static File studentdata;

    Student() {
        studentdata = new File("student");
        try {
            if (studentdata.createNewFile()) {
                System.out.println("File is Created");
            } else {
                System.out.println(" ");
            }
        } catch (IOException e) {
            System.out.println("can't create File");
        }
    }

    void start() throws FileNotFoundException {
        int option;

        System.out.println("press 1 to Add student" + "\n" + "press 2 to print all student");
        option = sc.nextInt();
        switch (option) {
            case 1 -> addStudent();
            case 2 -> printAllstudent();
            default -> System.out.println("not a valid option");
        }
    }

    void init() {
        readStudentDataFromFile();

        int continueProcess;

        do {
            try {
                start();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            System.out.print("press 1 to continue: ");
            continueProcess = sc.nextInt();
        } while (continueProcess == 1);
    }

    void addStudent() {
        if (currentIndex >= TOTAL_student - 1) {
            System.out.println("Seats are full");
        } else {
            int StudentNumber = ++currentIndex;
            student[StudentNumber] = new Student();
            sc.nextLine();
            System.out.print("Enter Student Name: ");
            student[StudentNumber].name = sc.nextLine();
            System.out.print("Enter Student mobile number: ");
            student[StudentNumber].mobile = sc.nextLine();
            System.out.print("Enter Student roll number: ");
            student[StudentNumber].rollNumber = sc.nextLine();
            System.out.print("Enter Student dob: ");
            student[StudentNumber].dob = sc.nextLine();
            String studentDetails = (student[StudentNumber].name + "|" + student[StudentNumber].mobile
                    + "|" + student[StudentNumber].rollNumber + "|" + student[StudentNumber].dob + "\n");
            addStudentToFile(studentDetails);
        }

    }

    void addStudentToFile(String data) {
        try {
            FileWriter fileWriter = new FileWriter(studentdata, true);
            //fileWriter.write(data);
            //System.out.println(data);
            fileWriter.append(data);
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("file can't be Written");
        }
    }


    private void printAllstudent(){
        for (int i =0; i<= currentIndex; i++){
            System.out.println("/********************************/");
            System.out.println("Student Name     " + student[i].name );
            System.out.println("Mobile Number     " + student[i].mobile );
            System.out.println("Roll Number          " + student[i].rollNumber );
            System.out.println("Date of Birth       " + student[i].rollNumber );
            System.out.println("/********************************/\n");
        }
    }

    static void readStudentDataFromFile(){
        try {
            Scanner studentcanner = new Scanner(studentdata);

            int count = 0;
            while (studentcanner.hasNextLine()){
                String studentRow = studentcanner.nextLine();
                //byte[] decodedString = Base64.getDecoder().decode(encodedRow);
                //String studentRow = new String(encodedRow);
                if(!studentRow.isEmpty()){
                    String[] studentArray = studentRow.split("\\|");
                    student[count] = new Student();
                    student[count].name = studentArray[0];
                    student[count].mobile = studentArray[1];
                    student[count].rollNumber = studentArray[2];
                    student[count].dob = studentArray[2];
                    count++;
                    currentIndex++;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


}
