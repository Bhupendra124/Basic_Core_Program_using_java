import java.util.Scanner;

public class LargestFind {
    public static void main(String[] args) {
        int a ,b, c ,largest ,temp; //

        Scanner s=new Scanner(System.in);
        System.out.println("Enter First number ");
        a =s.nextInt();

        System.out.println("Enter Second number ");
        b =s.nextInt();

        System.out.println("Enter Third number ");
        c =s.nextInt();

        temp= a>b?a:b;
        largest=c>temp?c:temp;

        System.out.println("Laregest number is  " +largest);
    }
}
