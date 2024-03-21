import java.util.*;
public class TP01Q10{
    /**
    * Checks if a given string is equal to "FIM"
    * @param p1 - the string to be checked
    * @return true if the string is equal to "FIM", false otherwise
    */
    public static boolean ifIsEnd(String p1){
        return p1.equals("FIM");
    }

    public static boolean verify(String s){
        if(s.length() <= 1){
            return true;
        }
        else
        {
            if(s.charAt(0) == s.charAt(s.length() - 1)){
                return verify(s.substring(1, s.length() - 1));
            } else {
                return false;
            }
        }
    }
    /* -- Main function -- */
    public static void main(String[] args) {

        // data declaration
        String p1 = "";
        boolean result = false;
        try (Scanner sc = new Scanner(System.in)) {
            // repetition to cycle through the string (while different from "FIM")
            while(!ifIsEnd(p1)){
                p1 = sc.nextLine();
                result = verify(p1);
                // test to check if it is a palindrome(T/F)
                if(result){
                    MyIO.println("SIM");
                }else {
                    MyIO.println("NAO");
                }
                // read from the keyboard util the string is "FIM"
            } // end while    
        }catch (Exception e) {
            MyIO.print("Erro ao ler " + e.toString());
        }
    } // end main()

} // end class TP01Q01
