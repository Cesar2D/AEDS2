public class TP01Q01{

    /**
    * Checks if a given string is equal to "FIM"
    * @param p1 - the string to be checked
    * @return true if the string is equal to "FIM", false otherwise
    */
    public static boolean ifIsEnd(String p1){
        return p1.equals("FIM");
    }

    /* 
     * Function to verify if the string is a palindrome
     * @param p1 - string to be check
     * @return result - boolean value (T/F)
    */
    public static boolean verify(String p1){
        
        // data declaration
        int contInv = p1.length() - 1; // inverted counter
        boolean result = false; // result 

        // repeat to cycle through the string
        for(int i = 0; i < p1.length()/2; i++){
            
            // test to avoid comparing the same char
            if(i != contInv){

                // check if the position "i" is equal to position "contInv"
                if(p1.charAt(i) == p1.charAt(contInv)){
                    result = true;
                }else{
                    result = false;
                    i = p1.length()/2;
                } // end if 2
            } // end if 1

            // counter movment in reverse
            contInv = contInv - 1;
        } // end for

        // return result
        return result;
    }

    /* -- Main function -- */
    public static void main(String[] args) {

        // data declaration
        String p1;

        // read from keyboard
        p1 = MyIO.readLine();

        // repetition to cycle through the string (while different from "FIM")
        while(!ifIsEnd(p1)){

            // test to check if it is a palindrome(T/F)
            if(verify(p1)){
                System.out.println("SIM");
            }else{
                System.out.println("NAO");
            }

            // read from the keyboard util the string is "FIM"
            p1 = MyIO.readLine();
        } // end while    
    } // end main()

} // end class TP01Q01