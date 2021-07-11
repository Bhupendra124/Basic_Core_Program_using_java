import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        int temp = 0;
        int i;
        int num;
        Scanner s = new Scanner(System.in);
        num = s.nextInt();

        for (i = 2; i <= num - 1; i++) {
            if (num % i == 0) {
                temp = temp+1;

            }
            if (temp==0) {
                System.out.println(num+" prime number");

            } else System.out.println(num +"is not prime");
        }
    }
}