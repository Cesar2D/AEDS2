class TP01Q03 {

    /*
     * Function to verify is the p1 is "FIM"
     * @param p1 - string to be verify
     * @return (T/F) - if is "FIM"
     */
    public static boolean isEnd(String p1) {
        return p1.equals("FIM");
    } // end isEnd()

    /*
     * Function to convert to cesar cipher
     * @param p1 - string to be converted
     * @return String - conversion to string of char
     */
    public static String conversion(String p1) {
        
        // counter
        int x = 0;
        
        // termporary char string 
        char[] temp = p1.toCharArray();

        // repetition to traverse the array
        while (x < p1.length()) {

            // sum of encrypiton
            temp[x] = (char) (temp[x] + 3);
            x = x + 1; // counter movement
        } // end while

        // return value
        return new String(temp);
    } // end conversion

    /* ----- main fuction ----- */
    public static void main(String[] args) {

        // read from keyboard
        String p1 = "";

        // frist reading
        p1 = MyIO.readLine();

        // result
        String result = "";

        // repeat as long as it is different from "FIM"
        while (!isEnd(p1)) {

            // conversion
            result = conversion(p1);

            // data output
            MyIO.println(result); // o erro estava na hora de usar o System.out.println();
            
            // second reading on loop
            p1 = MyIO.readLine();
        } // end while
    } // end main()
} // end class TP01Q03
