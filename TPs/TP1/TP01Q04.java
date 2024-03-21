/*
    Crie um método ITERATIVO que recebe uma string, sorteia duas letras minúsculas aleatórias
    (código ASCII <= 'a' e >= 'z'), substitui todas as ocorrências da primeira letra na string
    pela segunda e retorna a string com as alterações efetuadas. Na saída padrão, para cada 
    linha de entrada, execute o método desenvolvido nesta questão e mostre a string retornada 
    como uma linha de saída. Abaixo, observamos um exemplo de entrada supondo que para a primeira 
    linha as letras sorteados foram o 'a' e o 'q'. Para a segunda linha, foram o 'e' e o 'k'.

EXEMPLO DE ENTRADA:                                     EXEMPLO DE SAÍDA:
o rato roeu a roupa do rei de roma             o rqto roeu q roupq do rei de romq
e qwe qwe qwe ewq ewq ewq                      k qwk qwk qwk kwq kwq kwq

FIM


A classe Random do Java gera números (ou letras) aleatórios e o exemplo abaixo mostra uma letra minúscula na tela. Em especial, destacamos que:

i) \textit{seed} é a semente para geração de números aleatórios;
ii) nesta questão, por causa da correção automática, a *seed* será quatro;
iii) a disciplina de Estatística e Probabilidade faz uma discussão sobre ``aleatório''.

Random gerador = new Random();
gerador.setSeed(4);
System.out.println((char)('a' + (Math.abs(gerador.nextInt()) % 26)));
 */

import java.util.Random;

public class TP01Q04 {

    /*
     * Function to generate two words to be change
     * @param void
     * @return array - two char, one to be searched for, one to be swapped
     */
    public static char[] random(){
        
        int x = 0; // counter
        
        // random object creation
        Random gerador = new Random();
        gerador.setSeed(4);

        // allocation od result
        char[] array = new char[2];
        
        // repeat to move through the array
        while(x < 2){

            // random value generation
            array[x] = (char)('a' + (Math.abs(gerador.nextInt()) % 26));
            x = x + 1; // movement
        } // end while

        // result
        return array;
    } // end random()
    
    /*
     * Function to verify if the string is "FIM"
     * @param end - string to be verify
     * @return T/F - if the string is "FIM" 
     */
    public static boolean isEnd(String end){
        return end.equals("FIM");
    } // end isEnd()

    /* ----- main function ----- */
    public static void main(String[] args) {
        
        // data declaration 
        String result = "";
        int i = 0; // counter
        char[] letter = new char[2]; // array with 2 chars
        
        // frist reading
        String palavra = MyIO.readLine();

        // repeat while other than "FIM"
        while (!isEnd(palavra)) {

            // random generate method call
            letter = random();
            result = ""; // final string
            i = 0; // counter 

            // repeat to traverse the string
            while(i < palavra.length()){
                
                // test to see if there is the generated letter
                if( palavra.charAt(i) == letter[0]){
                    result += letter[1]; // concatenate
                }else{
                    result += palavra.charAt(i);
                } // end if

                i = i + 1; // counter
            } // end while 2

            // display result
            MyIO.println(result);

            // second reading
            palavra = MyIO.readLine();
        } // end while 1
    } // end main()
} // end TP01Q04