import java.util.Scanner;

public class Start {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
    FileOperation fileOperation = new FileOperation("student.txt");
    String hello =sc.nextLine();
    fileOperation.writeFile(hello);
    fileOperation.readFile();



    }
}
