import java.util.Random;
class B1DiceGame extends ConsoleProgram {

    /**
     *  A program B1DiceGame.java that lets you simulate the rolling of 100 pairs of dice. For each roll,
     *  If the pair adds up to 2, print "snake eyes!"
     *  If the pair adds up to 7, print "lucky seven"
     *  If the pair adds up to any other sum, do not print out anything
     *  @author: Simon Tse
     */

     public void run() {

        // Declare variables and set to zero
        int intDieOne = 0;
        int intDieTwo = 0;
        Random myRandom = new Random();
        // Recreating 100 rolls
        for (int intI = 0; intI < 100; intI += 1){
            intDieOne = myRandom.nextInt(1, 6);
            intDieTwo = myRandom.nextInt(1, 6);
            if (intDieOne + intDieTwo == 2){
                System.out.println("Snake Eyes!");
            }
            if (intDieOne + intDieTwo == 7) {
                System.out.println("Lucky Seven!");
            }
        }
    }
}

