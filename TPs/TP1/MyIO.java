
import java.io.*;
import java.nio.charset.*;
import java.util.*;

public class MyIO {

   private static BufferedReader in = new BufferedReader(
         new InputStreamReader(System.in, Charset.forName("ISO-8859-1")));
   private static String charset = "ISO-8859-1"; // special characters (Latin)

   public static void setCharset(String charset_) {
      charset = charset_;
      in = new BufferedReader(new InputStreamReader(System.in, Charset.forName(charset)));
   }

   public static void print() {
   }

   public static void print(int x) {
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.print(x);
      } catch (UnsupportedEncodingException e) {
         System.out.println("Erro: charset invalido");
      }
   }

   public static void print(float x) {
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.print(x);
      } catch (UnsupportedEncodingException e) {
         System.out.println("Erro: charset invalido");
      }
   }

   public static void print(double x) {
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.print(x);
      } catch (UnsupportedEncodingException e) {
         System.out.println("Erro: charset invalido");
      }
   }

   public static void print(String x) {
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.print(x);
      } catch (UnsupportedEncodingException e) {
         System.out.println("Erro: charset invalido");
      }
   }

   public static void print(boolean x) {
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.print(x);
      } catch (UnsupportedEncodingException e) {
         System.out.println("Erro: charset invalido");
      }
   }

   public static void print(char x) {
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.print(x);
      } catch (UnsupportedEncodingException e) {
         System.out.println("Erro: charset invalido");
      }
   }

   public static void println() {
   }

   public static void println(int x) {
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.println(x);
      } catch (UnsupportedEncodingException e) {
         System.out.println("Erro: charset invalido");
      }
   }

   public static void println(float x) {
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.println(x);
      } catch (UnsupportedEncodingException e) {
         System.out.println("Erro: charset invalido");
      }
   }

   public static void println(double x) {
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.println(x);
      } catch (UnsupportedEncodingException e) {
         System.out.println("Erro: charset invalido");
      }
   }

   public static void println(String x) {
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.println(x);
      } catch (UnsupportedEncodingException e) {
         System.out.println("Erro: charset invalido");
      }
   }

   public static void println(boolean x) {
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.println(x);
      } catch (UnsupportedEncodingException e) {
         System.out.println("Erro: charset invalido");
      }
   }

   public static void println(char x) {
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.println(x);
      } catch (UnsupportedEncodingException e) {
         System.out.println("Erro: charset invalido");
      }
   }

   public static void printf(String formato, double x) {
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.printf(formato, x);// "%.2f"
      } catch (UnsupportedEncodingException e) {
         System.out.println("Erro: charset invalido");
      }
   }

   public static double readDouble() {
      double d = -1;
      try {
         d = Double.parseDouble(readString().trim().replace(",", "."));
      } catch (Exception e) {
      }
      return d;
   }

   public static double readDouble(String str) {
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.print(str);
      } catch (UnsupportedEncodingException e) {
         System.out.println("Erro: charset invalido");
      }
      return readDouble();
   }

   public static float readFloat() {
      return (float) readDouble();
   }

   public static float readFloat(String str) {
      return (float) readDouble(str);
   }

   public static int readInt() {
      int i = -1;
      try {
         i = Integer.parseInt(readString().trim());
      } catch (Exception e) {
      }
      return i;
   }

   public static int readInt(String str) {
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.print(str);
      } catch (UnsupportedEncodingException e) {
         System.out.println("Erro: charset invalido");
      }
      return readInt();
   }

   public static String readString() {
      String s = "";
      char tmp;
      try {
         do {
            tmp = (char) in.read();
            if (tmp != '\n' && tmp != ' ' && tmp != 13) {
               s += tmp;
            }
         } while (tmp != '\n' && tmp != ' ');
      } catch (IOException ioe) {
         System.out.println("lerPalavra: " + ioe.getMessage());
      }
      return s;
   }

   public static String readString(String str) {
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.print(str);
      } catch (UnsupportedEncodingException e) {
         System.out.println("Erro: charset invalido");
      }
      return readString();
   }

   public static String readLine() {
      String s = "";
      char tmp;
      try {
         do {
            tmp = (char) in.read();
            if (tmp != '\n' && tmp != 13) {
               s += tmp;
            }
         } while (tmp != '\n');
      } catch (IOException ioe) {
         System.out.println("lerPalavra: " + ioe.getMessage());
      }
      return s;
   }

   public static String readLine(String str) {
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.print(str);
      } catch (UnsupportedEncodingException e) {
         System.out.println("Erro: charset invalido");
      }
      return readLine();
   }

   public static char readChar() {
      char resp = ' ';
      try {
         resp = (char) in.read();
      } catch (Exception e) {
      }
      return resp;
   }

   public static char readChar(String str) {
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.print(str);
      } catch (UnsupportedEncodingException e) {
         System.out.println("Erro: charset invalido");
      }
      return readChar();
   }

   public static boolean readBoolean() {
      boolean resp = false;
      String str = "";

      try {
         str = readString();
      } catch (Exception e) {
      }

      if (str.equals("true") || str.equals("TRUE") || str.equals("t") || str.equals("1") ||
            str.equals("verdadeiro") || str.equals("VERDADEIRO") || str.equals("V")) {
         resp = true;
      }

      return resp;
   }

   public static boolean readBoolean(String str) {
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.print(str);
      } catch (UnsupportedEncodingException e) {
         System.out.println("Erro: charset invalido");
      }
      return readBoolean();
   }

   public static void pause() {
      try {
         in.read();
      } catch (Exception e) {
      }
   }

   public static void pause(String str) {
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.print(str);
      } catch (UnsupportedEncodingException e) {
         System.out.println("Erro: charset invalido");
      }
      pause();
   }

   // ---------------------------------- My Editions ---------------------------------- //

   // Author: Vinicius Cesar D'Ascenção Dias
   // Contributions: PUC Minas - AEDS2 - https://github.com/icei-pucminas/aeds2
   //                Alice Valle       - https://github.com/AliceValle1985

   /*------- character and string checking -------*/
   /**
    * - Function to check if the charactere is a vowel
    * 
    * @param c - char
    * @return result - Boolean value if c is a vowel
    */
   public static boolean ifIsVowel(char c) {

      // result value (if it's True or False)
      boolean result = false;

      // test to check if is a vowel
      if ((c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
            || (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')) {

         // assignment if true
         result = true;
      } // end if

      // return result (T/F)
      return result;
   } // end isVowel()

   /**
      - Function to verify if the char c is a alphabet character
    * @param c - char to be verify
    * @return result - boolean value if c is a alphabet char
    */
   public static boolean ifIsAlphabetChar(char c) {

      // boolean value, to return
      boolean result = false;

      // test if it's a alphabet char
      if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {

         // assigment if true
         result = true;
      } // end if

      // return result (T/F)
      return result;
   } // end ifIsAlphabetChar()

   /**
      - Fuction to find out if there is any alphabet char in the string
    * @param s - string to be searched for
    * @return result - boolean value of s if has a alphabet char (T/F)
    */
   public static boolean ifHasChar(String s){

      // boolean value, to return
      boolean result = false;

      // repeat to traverse the string
      for(int x = 0; x < s.length(); x = x + 1){

         // assigment the char(from x position) to char variable (c)
          char c = s.charAt(x);

          // test to know if it's a alphabet char
          if(ifIsAlphabetChar(c)){

            // assigment if true
            result = true;
          } // end if
      } // end for

      // return result(T/f)
      return result;
   } // end ifHasChar()

   /**
      - Function to verify if the char is a consonat
    * @param c - char to be verify
    * @return result - boolean value (T/F)
    */
   public static boolean ifIsConsonat(char c){

      // result to be returned
      boolean result = false;

      // test to be is a alphabet char end is a !(not)vowel
      if(ifIsAlphabetChar(c) && !ifIsVowel(c)){

         // assign value if true
         result = true;
      }

      // tetrun result(T/F)
      return result;
   }

/*------- Checking and searching with Arrays -------*/
   /**
      - Function to test which is the largest value in the Array
    * @param a - Array to be verify
    * @return result - largest value in the Array
    */
   public static int largestArray(int a[]){
      int result = 0; // variable to save the largest value 

      result = a[0]; // set the frist value to be verify

      // repetition to "walk" through the array
      for(int x = 1; x < a.length; x = x + 1){

         // test to verify if the 
         if(result < a[x]){
            result = a[x];
         }
      }

      return result;
   } // end largestArray()


/*------- Checking and searching with Arrays -------*/

   /**
    * @param fileName
    * @return
    */
   public static int[] readArqIntArray(String fileName) {
      ArrayList<Integer> numList = new ArrayList<>();

      try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
         String line = "";

         while ((line = reader.readLine()) != null) {
            numList.add(Integer.parseInt(line));
         }

      } catch (IOException e) {
         e.printStackTrace();
      }

      int[] array = new int[numList.size()];

      for (int i = 0; i < numList.size(); i = i + 1) {
         array[i] = numList.get(i);
      }

      return array;
   }

   public static void writeToFileArray(String fileName, int[] data) {
      try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
         for (int num : data) {
            writer.write(Integer.toString(num));
            writer.newLine();
         }
      } catch (IOException e) {
         e.printStackTrace();
      }
   }

   public static int getArqLength(String fileName) {
      String result = "";

      try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
         result = reader.readLine();
      } catch (IOException e) {
         e.printStackTrace();
      }
      return Integer.parseInt(result);
   }

}
