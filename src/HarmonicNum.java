

import java.util.Scanner;
public class HarmonicNum {
 public static void main(String[] args) {
        int num;
         double result=0.0;
       Scanner s=new Scanner(System.in);
       System.out.println("Enter Number");
       num=s.nextInt();


        // printing the harmonic series till num value
         while (num > 0){
             result = result + (double)1/num;
            num--;
            System.out.println(result + ",");
        }
   }
}
