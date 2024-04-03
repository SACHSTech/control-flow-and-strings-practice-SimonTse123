class B4IsPrime extends ConsoleProgram {

    /**
     * A program, B4IsPrime.java that lets you enter an integer, and that will print appropriately "is a prime number" or "is a composite number".
     * @author: Simon Tse
     */

     public void run(){

        // Declare variables
        int intNum;

        //Get variable
        intNum = readInt("Enter the value of an integer that you want to check: ");

        //Calculations 
        for ( int a = 2; a < intNum; a++){
            // Outputs answer if composite
            if (intNum % a == 0) {
                System.out.println("The interger entered is a composite number.");
                
                return;
            }
        }
        System.out.println("This is a prime number.");
     }
}
