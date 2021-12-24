import java.util.Arrays;
import java.util.Scanner;

public class Start {
   public static void main(String args[]){
//
//        Student student   = new Student();
//
//        student.init();
       
       int x =2;
       deleteElement(x);

    }
    static int[] a = new int[]{2,6,5,1,7,4,3,2};
      static void deleteElement(int index){
          int n = a.length;
        for(int i=index;i<(n-1);i++)
            a[i]=a[i+1];

        n-=1;

        System.out.println(Arrays.toString(a));

    }


}
