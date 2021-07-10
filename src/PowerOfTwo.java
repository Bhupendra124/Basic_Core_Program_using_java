import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please Enter number");
        int num = s.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.println(num+" * "+i+" = "+num*i);

        
        }

    }
}
