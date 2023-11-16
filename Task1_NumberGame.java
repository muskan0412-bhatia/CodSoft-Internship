import java.util.Scanner;

public class Task1_NumberGame {
    public static void guessingNumberGame() {
        Scanner sc = new Scanner(System.in);

        int number = 1 + (int)(100 * Math.random());

        int k = 5;

        int i, guess;

        System.out.println("Welcome to the Number Guessing Game!!!");
        System.out.println("A number is chosen"
                +" between 1 to 100."
                +"Guess the number");

        for(i = 0; i < k; i++)

        {
            System.out.println("Guess the number:");
            guess = sc.nextInt();

            if (number == guess) {
                System.out.println("Congratulations!"
                        + " You guessed the number.");
                break;
            }
            else if (number > guess && i != k - 1) {
                System.out.println("The number is " + "greater than " + guess);
            }
            else if (number < guess && i != k - 1) {
                System.out.println("The number is "
                        + " less than " + guess);
            }
        }

        if(i == k)
        {
            System.out.println("You have exhausted"
                    + " k trials.");

            System.out.println("The number was " + number);
        }
    }
        public static void main(String[] args) {
        guessingNumberGame();
    }
}
