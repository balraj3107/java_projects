import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileOperation {
    File studentdata;
    Scanner sc = new Scanner(System.in);
    FileOperation(String FilePath){
        studentdata= new File(FilePath);
        try {
            if(studentdata.createNewFile()){
                System.out.println("File is Created");
            }
            else{
                System.out.println("File not created");
            }
        } catch (IOException e) {
            System.out.println("can't create File");
        }
    }
    void writeFile(String data){
        try {
            FileWriter fileWriter = new FileWriter(studentdata,true);
            //fileWriter.write(data);
            fileWriter.append(data);
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("file can't be Written");
        }
    }
    void readFile(){
        try {
            sc = new Scanner(studentdata);
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());

            }
        } catch (FileNotFoundException e) {

        System.out.println("Can't read File");}

    }
}
