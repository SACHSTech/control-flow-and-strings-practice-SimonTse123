class B3DivisorCount extends ConsoleProgram {

    /**
     *  A program B3DivisorDount that lets you enter an integer and that prints all the divisors of that number
     * @author: Simon Tse
     */

     public void run() {
        // Declare variables 
        int intNum;
        int intDivisor;

        // Get variables
        intNum = readInt("Enter an integer you want to find the divsors of: ");

        // Calculations
        System.out.print("");
        for(int intA = 1; intA <= intNum; intA++){
            if (intNum % intA == 0) {
                intDivisor = intA;
                System.out.print(intDivisor + ", ");
            }
        }
     }
}
