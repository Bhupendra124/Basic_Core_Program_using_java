import java.util.Scanner;

public class VowelAndConsonant {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Alphabet");
        char alphabet;
        alphabet=s.next().charAt(0);

        switch (alphabet){
            case 'a':
                System.out.println("VOWEL");
                break;
            case 'i':
                System.out.println("VOWEL");
                break;
            case 'o':
                System.out.println("VOWEL");
                break;
            case 'u':
                System.out.println("VOWEL");
                break;
            case 's':
                System.out.println("VOWEL");
                break;
            default:
                System.out.println("Consonant");

        }
    }
}
