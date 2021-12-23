import java.io.*;
import java.util.Scanner;

public class Student {
    static final int TOTAL_STUDENTS = 10;
    static int currentIndex = -1;
    static Student[] student = new Student[TOTAL_STUDENTS];
    static Scanner sc = new Scanner(System.in);
    String name;
    String mobile;
    String rollNumber;
    String dob;
    File studentdata;

    Student() {
        studentdata = new File("STUDENTS");
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

        System.out.println("press 1 to Add Students" + "\n" + "press 2 to print all Students");
        option = sc.nextInt();
        switch (option) {
            case 1 -> addStudent();
            case 2 -> printStudents();
            default -> System.out.println("not a valid option");
        }
    }

    void init() {
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
        if (currentIndex >= TOTAL_STUDENTS - 1) {
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
            System.out.println(data);
            fileWriter.append(data);
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("file can't be Written");
        }
    }


    void printStudents() throws FileNotFoundException {

        Scanner sc = new Scanner(studentdata);    //file to be scanned
        while (sc.hasNextLine()) {

            String[] printStudentDetails;
            printStudentDetails = readFile(studentdata);

            for(int i =0 ; i<printStudentDetails.length;i++)
            System.out.print("  "+printStudentDetails[i]);
                System.out.println("");



        }

    }
    String[] readFile(File student){
        try {
            sc = new Scanner(studentdata);

            while(sc.hasNextLine()){

                String[] addStudentDetails;
                String studentDetails = sc.nextLine();
                addStudentDetails = studentDetails.split("\\|");
                return addStudentDetails;
            }
        } catch (FileNotFoundException e) {

            System.out.println("Can't read File");}

        return new String[0];
    }


}
