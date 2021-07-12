import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter how many Time you want to flip  coin ");
        int numofFlip = s.nextInt();

        if (numofFlip < 0) {
            System.out.println("Please Provide Positive integer ");

        } else {
            int numofHead = 0;
            for (int i = 1; i < numofFlip; i++) {
                if (Math.random() > 0.5) {
                    numofHead++;

                }
            }

            double percentofHead = (numofHead * 100) / numofFlip;
            double percentofTails = 100 - percentofHead;
            System.out.println("heads perecentage : " + percentofHead);
            System.out.println("Tails perecentage : " + percentofTails);
        }
    }
}