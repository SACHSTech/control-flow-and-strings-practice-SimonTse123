class A3Within10 extends ConsoleProgram {

    /**
     * A program A3Within10.java that takes 2 inputted values and outputs whichever value is nearest to the value 10, or output 0 in the event of a tie.
     * @author: Simon Tse
     */

     public void run() {

        // Declare variables
        int intNumOne;
        int intNumTwo;
        int intDifferenceOne;
        int intDifferenceTwo;

        // Get variables
        intNumOne = readInt("Enter the value of one of the numbers: ");
        intNumTwo = readInt("Enter the value of the other number: ");

        // Calculating variables differences        
        intDifferenceOne = Math.abs(10 - intNumOne);
        intDifferenceTwo = Math.abs(10 - intNumTwo);

        // Subcase if they have same differences
        if (intDifferenceOne == intDifferenceTwo){
            System.out.println(0);
        }
        // 
        else {
            // Showing which munber is closer to 10
            if (intDifferenceOne > intDifferenceTwo){
                System.out.println("The number closer to 10 is " + intNumTwo);
            }
            else {
                System.out.println("The number closer to 10 is " + intNumOne);
            }
        }
     }
}

