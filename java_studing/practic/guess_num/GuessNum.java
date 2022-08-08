package practic.guess_num;

import java.util.Random;
import java.util.Scanner;

public class GuessNum {
    private static final int RANDOM_INT = new Random().nextInt(10) + 1;

    public static void guessNum(){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your num: ");
            int input = scanner.nextInt();
            if (input > RANDOM_INT){
                System.out.println("Your num is too big");
            }else if (input < RANDOM_INT){
                System.out.println("Your num is too small");
            }else {
                System.out.println("OKKKKKK!");
                break;
            }

        }
        System.out.println("Finish");
    }

    public static void main(String[] args) {
        guessNum();
    }
}
