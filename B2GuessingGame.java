import java.util.Random;
class B2GuessingGame extends ConsoleProgram{

    /**
     * A program B2GuessingGame that lets the computer generate a secret number (an integer between 1 and 100, for your friend to guess.   If they guess too high, print: "too high, guess again." If they guess too low, print: "too low, guess again".   If they guess the number, let the program stop and print "congratulations".  If they've guessed incorrectly after 5 attempts, print "Nice Try"
     * @author: Simon Tse
     */

     public void run() {
        // Declare variables
        Random myRandom = new Random();
        int intSecretNum;
        int intGuess = 0;
        int intA = 0;

        // Set the secret number1
        intSecretNum = myRandom.nextInt(1, 100);

        // The 5 guesses and responses
        while (intGuess > intSecretNum || intGuess < intSecretNum) {
            intGuess = readInt("What number would you like to guess? ");
            if (intGuess > intSecretNum){
                System.out.println("Too high. Guess Again.");
                intA = intA + 11;
            }
            if (intGuess < intSecretNum){
                System.out.println("Too Low. Guess Again");
                intA = intA + 1;
            }
            if (intGuess == intSecretNum){
                System.out.println("Congratulations");
                {break;}
            }
            if (intA == 5){
                System.out.println("Nice Try. Try again next time.");
                {break;}
            }
        }
     }
}
