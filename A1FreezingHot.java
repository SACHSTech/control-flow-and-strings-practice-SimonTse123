class A1FreezingHot extends ConsoleProgram {

    /**
    * A program A1FreezingHot that given two temperatures via user input, output true if one is less than 0 and the other is greater than 100.
    * @author: Simon Tse
    */

     public void run() {

        // Declare variables
        int intTempOne;
        int intTempTwo;

        // Get variables
        intTempOne = readInt("Enter the value for one of the temperatures: ");
        intTempTwo = readInt("Enter the value for the other temperature: ");


        // Check whether variables follow the conditions
        if (intTempOne < 0 && intTempTwo > 100 || intTempOne > 100 && intTempTwo <0 ){
          //Print results 
          System.out.println("True");
        }

        else{
            System.out.println("False");
        }

     }
}
