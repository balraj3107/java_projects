import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileManager {
    File mobileData;
    Scanner sc = new Scanner(System.in);
   void FileCreation(String FilePath){
        mobileData = new File(FilePath);
        try {
            if(mobileData.createNewFile()){
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
            FileWriter fileWriter = new FileWriter(mobileData,true);
            //fileWriter.write(data);
            System.out.println(data);
            fileWriter.append(data);
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("file can't be Written");
        }
    }
    void readFile(){
        try {
            sc = new Scanner(mobileData);
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());

            }
        } catch (FileNotFoundException e) {

            System.out.println("Can't read File");}

    }
}
