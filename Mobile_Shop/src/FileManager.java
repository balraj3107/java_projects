import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileManager {
    File mobiledata;
    Scanner sc = new Scanner(System.in);
   void FileCreation(String FilePath){
        mobiledata= new File(FilePath);
        try {
            if(mobiledata.createNewFile()){
                System.out.println("File is Created");
            }
            else{
                System.out.println("File is already exists!!");
            }
        } catch (IOException e) {
            System.out.println("can't create File");
        }
    }
    void writeFile(String data){
        try {
            FileWriter fileWriter = new FileWriter(mobiledata,true);
            //fileWriter.write(data);
            fileWriter.append(data);
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("file can't be Written");
        }
    }
    void readFile(){
        try {
            sc = new Scanner(mobiledata);
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());

            }
        } catch (FileNotFoundException e) {

            System.out.println("Can't read File");}

    }
}
