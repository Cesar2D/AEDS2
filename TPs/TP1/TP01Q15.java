/*
Crie um método iterativo que recebe uma string e retorna true se a mesma é composta somente por vogais. |||V||| Crie outro método iterativo} que recebe uma string e retorna true se a mesma é composta somente por consoantes. |||V||| Crie um terceiro método iterativo que recebe uma string e retorna true se a mesma corresponde a um número inteiro.|||V||| Crie um quarto método iterativo que recebe uma string e retorna true se a mesma corresponde a um número real.|||?||| Na saída padrão, para cada linha de entrada, escreva outra de saída da seguinte forma X1 X2 X3 X4 onde cada Xi é um booleano indicando se a é entrada é: composta somente por vogais (X1); composta somente somente por consoantes (X2); um número inteiro (X3); um número real (X4). Se Xi for verdadeiro, seu valor será SIM, caso contrário, NÃO.
*/
/*
public class TP01Q15 {
    /*
     * Method to verify if the string consists of only vowels
     * @param x - String to be verify
     * @return result - true or false
     */
    /*
    public static boolean isVogal(String x, int i) {
        boolean result = true;

        // for to walk the string
        if (i < x.length()) {

            // assign the character to be checked to a variable
            char c = x.charAt(i);

            // test to check if the character to be searched for is 'a', 'e', 'i,' 'o', 'u' (or 'A', 'E', 'I', 'O', 'U')
            if (!(c == 'a' || c == 'e' || c == 'i' || c == 'o'
                    || c == 'u' || c == 'A' || c == 'E' || c == 'I'
                    || c == 'O' || c == 'U')) {
                result = false;
                i = x.length(); // stop de loop
            } // end if
            return isVogal(x, i+1);
        } // end for

        // return T | F
        return result;
    } // end isVogal()

    public static boolean isWord(String x, int i) {
        boolean result = true;
        if(i < x.length()) {
            char y = x.charAt(i);
            if (!(y >= 'a' && y <= 'z' || y >= 'A' && y <= 'Z')) {
                result = false;
                i = x.length();
            } // end if
            return isWord(x, i+1);
        } // end for

        return result;
    } // end isWord()

    public static boolean isConsoante(String x) {
        boolean result = false;
        boolean vogais = isVogal(x, 0);
        boolean word = isWord(x, 0);

            if (vogais && word) {
                result = true;
            } // end if
        
        return result;
    } // end isConsoante()

    public static boolean isInt(String x, int i) {
        boolean result = true;
        if(i < x.length()) {
            if (!(x.charAt(i) >= '0' && x.charAt(i) <= '9')) {
                result = false;
                i = x.length();
            }
            return isInt(x, i+1);
        }
        return result;
    } // end isInt()

    public static boolean isNum(String x, int i) {
        boolean ponto = false;
        boolean num = false;
        boolean erro = true;

        if(i < x.length()) {
            char c = x.charAt(i);
            if (c == '.' || c == ',') {
                ponto = true;
                i++;
            } else if (c <= '9' && c >= '0') {
                num = true;
                i++;
            } else {
                erro = false;
                i = x.length();
            }
            return isNum(x, i+1);
        }
        return (ponto && num && erro);
    }

    public static boolean isPonto(String x, int i) {
        boolean result = false;
        boolean num = isNum(x, 0);

        if(i < x.length()) {
            if (num) {
                result = true;
                i = x.length();
            }
            return isPonto(x, i+1);
        } // end for
        return result;
    } // end isPonto

    public static boolean isDouble(String x, int i) {
        boolean result = false;

        if(i < x.length()) {
            if (isPonto(x, 0)) {
                result = true;
                i = x.length();
            } // end if
            return isDouble(x, i+1);
        } // end for

        return result;
    } // end isDouble()

    public static boolean isFIM(String x) {
        return x.equals("FIM");
    }

    public static void main(String[] args) {
        String value = "";
        // BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (!isFIM(value)) {
            value = MyIO.readLine();

            if (isVogal(value, 0) && !isFIM(value)) {
                MyIO.print("SIM");
            } else {
                MyIO.print("NAO");
            } // end if X1

            MyIO.print(" ");
            
            if (isConsoante(value) && !isFIM(value)) {
                MyIO.print("SIM");
            } else {
                MyIO.print("NAO");
            } // end if X2

            MyIO.print(" ");

            if (isInt(value, 0) && !isFIM(value)) {
                MyIO.print("SIM");
            } else {
                MyIO.print("NAO");
            } // end if X3

            MyIO.print(" ");

            if (isDouble(value, 0) && !isFIM(value)) {
                MyIO.println("SIM");
            } else {
                MyIO.println("NAO");
            } // end if X4

        }
    } // end main()
}
*/
public class TP01Q15 {

    public static boolean isVogal(String x, int i) {
        if (i < x.length()) {
            char c = x.charAt(i);
            if (!(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                  c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')) {
                return false;
            }
            return isVogal(x, i + 1);
        }
        return true;
    }

    public static boolean isConsoante(String x, int i) {
        if (i < x.length()) {
            char c = x.charAt(i);
            if (!(c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z')) {
                return false;
            }
            return isConsoante(x, i + 1);
        }
        return true;
    }

    public static boolean isInt(String x, int i) {
        if (i < x.length()) {
            char c = x.charAt(i);
            if (!(c >= '0' && c <= '9')) {
                return false;
            }
            return isInt(x, i + 1);
        }
        return true;
    }

    public static boolean isDouble(String x, int i, boolean ponto) {
        if (i < x.length()) {
            char c = x.charAt(i);
            if ((c == '.' || c == ',') && !ponto) {
                return isDouble(x, i + 1, true);
            } else if (!(c >= '0' && c <= '9')) {
                return false;
            }
            return isDouble(x, i + 1, ponto);
        }
        return ponto; // Verifica se foi encontrado o ponto decimal
    }

    public static boolean isFIM(String x) {
        return x.equals("FIM");
    }

    public static void main(String[] args) {
        String value = "";
        while (!isFIM(value)) {
            value = MyIO.readLine();

            boolean isVogal = isVogal(value, 0);
            boolean isConsoante = isConsoante(value, 0);
            boolean isInt = isInt(value, 0);
            boolean isDouble = isDouble(value, 0, false);

            if (isVogal) {
                MyIO.print("SIM");
            } else {
                MyIO.print("NAO");
            }

            MyIO.print(" ");

            if (isConsoante) {
                MyIO.print("SIM");
            } else {
                MyIO.print("NAO");
            }

            MyIO.print(" ");

            if (isInt) {
                MyIO.print("SIM");
            } else {
                MyIO.print("NAO");
            }

            MyIO.print(" ");

            if (isDouble) {
                MyIO.println("SIM");
            } else {
                MyIO.println("NAO");
            }
        }
    }
}
