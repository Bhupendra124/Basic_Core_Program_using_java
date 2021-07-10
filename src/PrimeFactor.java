import java.util.Scanner;

public class PrimeFactor {
    public static void main(String[] args) {
        int num;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number");
        num = s.nextInt();
        System.out.println("Number is" +num);
        System.out.println("factor ");

        for (int i = 2; i * i <= num; i++) {

            while (num % i == 0) {
                System.out.print(i + " ");
                num = num / i;
            }
            if (num > 2)
                System.out.println(num);
        }
    }
}