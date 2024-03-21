/*
 * Crie um método iterativo que recebe uma string contendo uma expressão booleana e o valor de suas entradas e retorna um booleano indicando se a expressão é verdadeira ou falsa. Cada string de entrada é composta por um número inteiro n indicando o número de entradas da expressão booleana corrente. Em seguida, a string contém n valores binários (um para cada entrada) e a expressão booleana. Na saída padrão, para cada linha de entrada, escreva uma linha de saída com SIM / NÃO indicando se a expressão corrente é verdadeira ou falsa.
 */
public class TP01Q05 {
    static String expressao(String s){
        s = s.replace(" ", "");
        int numVariaveis = (int)(s.charAt(0) - 48);
        String a = "",b = "",c = "";
        if(numVariaveis == 2){
            a += s.charAt(1);
            b += s.charAt(2);
            s = s.replace(a, "");
            s = s.replace(b, "");
            s = s.replace("2", "");
        }else{
            a += s.charAt(1);
            b += s.charAt(2);
            c += s.charAt(3);
            s = s.replace(a, "");
            s = s.replace(b, "");
            s = s.replace(c, "");
            s = s.replace("3", "");
        }
        while (s.length() > 1) {
            s = s.replace("A", a);
            s = s.replace("B", b);
            s = s.replace("C", c);
            s = s.replace("and(0,0)", "0");
            s = s.replace("and(0,1)", "0");
            s = s.replace("and(1,0)", "0");
            s = s.replace("and(1,1)", "1");
            s = s.replace("and(0,0,0)", "0");
            s = s.replace("and(0,0,1)", "0");
            s = s.replace("and(0,1,0)", "0");
            s = s.replace("and(0,1,1)", "0");
            s = s.replace("and(1,0,0)", "0");
            s = s.replace("and(1,0,1)", "0");
            s = s.replace("and(1,1,0)", "0");
            s = s.replace("and(1,1,1)", "1");
            s = s.replace("or(0,0)", "0");
            s = s.replace("or(0,1)", "1");
            s = s.replace("or(1,0)", "1");
            s = s.replace("or(1,1)", "1");
            s = s.replace("or(0,0,0)", "0");
            s = s.replace("or(0,0,1)", "1");
            s = s.replace("or(0,1,0)", "1");
            s = s.replace("or(0,1,1)", "1");
            s = s.replace("or(1,0,0)", "1");
            s = s.replace("or(1,0,1)", "1");
            s = s.replace("or(1,1,0)", "1");
            s = s.replace("or(1,1,1)", "1");
            s = s.replace("or(0,0,0,0)", "0");
            s = s.replace("or(0,0,0,1)", "1");
            s = s.replace("or(0,0,1,0)", "1");
            s = s.replace("or(0,0,1,1)", "1");
            s = s.replace("or(0,1,0,0)", "1");
            s = s.replace("or(0,1,0,1)", "1");
            s = s.replace("or(0,1,1,0)", "1");
            s = s.replace("or(0,1,1,1)", "1");
            s = s.replace("or(1,0,0,0)", "1");
            s = s.replace("or(1,0,0,1)", "1");
            s = s.replace("or(1,0,1,0)", "1");
            s = s.replace("or(1,0,1,1)", "1");
            s = s.replace("or(1,1,0,0)", "1");
            s = s.replace("or(1,1,0,1)", "1");
            s = s.replace("or(1,1,1,0)", "1");
            s = s.replace("or(1,1,1,1)", "1");
            s = s.replace("not(0)", "1");
            s = s.replace("not(1)", "0");       
        }
        return s;
    }
    public static void main(String[] args) {
        int numVariaveis;
        String entrada;
        entrada = MyIO.readLine();
        numVariaveis = entrada.charAt(0)-48;
        while (numVariaveis != 0) {
            MyIO.println(expressao(entrada));
            entrada = MyIO.readLine();
            numVariaveis = entrada.charAt(0)-48;
        }
    }
}