class C1BackToBack extends ConsoleProgram{

    /**
     * A program C1BackToBack.java that takes the last character and print a new string with the last character added at the front and back, so "cat" yields "tcatt". The original string will be length 1 or more.
     * @author: Simon Tse
     */

     public void run(){

        // Declare variables
        String strWord;
        char chrLastLetter;

        // Get variable
        strWord = readLine("Enter your desired word: ");

        // Find last letter
        chrLastLetter = strWord.charAt(strWord.length() - 1);
        
        // Output result
        System.out.println(chrLastLetter + strWord + chrLastLetter);

        
        

     }
}