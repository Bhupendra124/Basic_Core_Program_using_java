import java.util.Random;

public class FlipCoin {
    public static void main(String[] args) {
        System.out.println("###FLIP COIN AND WIN ###");
        Random randomNum=new Random();

         enum coin{Head,Tail}
        int result;
        int Head=1;
        int Tail=0;
        coin coinFlip;
         void flip{
            result =randomNum.nextInt(2);
            if (result== 1){
                coinFlip= coin.Head;
                System.out.println("Head ");
            }else {
                System.out.println("Tail");
            }

            }
    }
}
