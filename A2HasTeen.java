class A2HasTeen extends ConsoleProgram {
    
    /**
     * A program A2HasTeen.java that will ouput true when at least one of the 3 inputted values are between 13 and 19
     * @author: Simon Tse
     */

     public void run() {
        // Declare variables
        int intAgeOne;
        int intAgeTwo;
        int intAgeThree;

        // Get variables
        intAgeOne = readInt("Enter the age of the first person: ");
        intAgeTwo = readInt("Enter the age of the second person: ");
        intAgeThree = readInt("Enter the age of the third person: ");

        // Check whether values fulfill requirements and show results
        if (13 <= intAgeOne || intAgeOne <= 19){
            System.out.println("True");
            if (13 <= intAgeTwo || intAgeThree <= 19){
                System.out.println("True");
                if (13 <= intAgeThree || intAgeThree <= 19){
                    System.out.println("True");
                }
            }
        }
        else {
            System.out.println("False");
        }
     }
}
