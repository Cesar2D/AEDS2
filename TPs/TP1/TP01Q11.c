/*
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <stdbool.h>
#include <wchar.h>
*/
/*
    Method to verify if the string is a palindrome
    @param *p1 - pointer to string
    @return result - boolean result
*/
/*
bool verify(char *p1, int i, int contInv)
{
    bool result = false;
    int length = strlen(p1) / 2;
    wchar_t *wide_str = (wchar_t *)malloc((length + 1) * sizeof(wchar_t));
    // data declaration
    // repeatition to go through half the string and compare thelast char with the frist
        mbstowcs(wide_str, p1, length + 1);

        if(i < length){
            // printf("i = %d\n", i);
            // printf("contInv = %d\n", contInv);
            // array verification test
            if (wide_str[i] == wide_str[contInv])
            {
                // if is true
                result = true;
            }
            else
            {
                // if is false, stop repeat and return false
                free(wide_str);
                return false;
                
            } // end if 2
            free(wide_str);
            return verify(p1, i + 1, contInv - 1);
        } // end if 1
    // return result
    return result;
}
*/
/*
    Method to compare if the string is "FIM"
    @param *p1 - pointer to string
    @return - check if the comparison is different from 0
*/
/*
bool ifFim(char *p1)
{   
    // compare p1 with "FIM"
    return strcmp("FIM", p1) != 0;
}
*/
/*
    Method to get string from the keyboard
    @param *p1 - pointer to string
    @return void
*/
/*
void lerLinha(char *p1)
{
    scanf("%[^\r\n]", p1);
    getchar();
}
*/
/*
    Main Method
*/
/*
int main(void)
{
    // data declaration
    char p1[1000];
    int i = 0;

    // frist reading
    lerLinha(p1);
    

    // repeat as long as it is different from "FIM"
    while (ifFim(p1))
    {
        int contInv = strlen(p1) - 1; // inverted counters
        // main verification test
        if (verify(p1, i, contInv))
        {
            printf("SIM\n"); // if is true
        }
        else
        {
            printf("NAO\n"); // if is false
        }

        // internal reading (repeat until p1 is "FIM")
        lerLinha(p1);
    }

    // end program
    return 0;
}
*/

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <stdbool.h>
#include <wchar.h>

/*
    Método para verificar se a string é um palíndromo de forma recursiva
    @param *p1 - ponteiro para a string
    @param start - índice de início da verificação
    @param end - índice de fim da verificação
    @return result - resultado booleano
*/
bool verify_recursive(char *p1, int start, int end) {
    // Se o índice de início for maior ou igual ao índice de fim, significa que a verificação foi concluída com sucesso
    bool result = false;
    if (start >= end) {
        result = true;
    }

    // Verificar se os caracteres nos índices start e end são iguais
    if (p1[start] == p1[end]) {
        // Chamar a função recursivamente para os índices adjacentes
        result = true;
        return verify_recursive(p1, start + 1, end - 1);
    } else {
        return false; // Se os caracteres não forem iguais, a string não é um palíndromo
    }
    return result;
}

/*
    Método para verificar se a string é um palíndromo
    @param *p1 - ponteiro para a string
    @return result - resultado booleano
*/
bool verify(char *p1) {
    int length = strlen(p1);
    // Chamar a função recursiva com os índices de início e fim adequados
    return verify_recursive(p1, 0, length - 1);
}

/*
    Método para comparar se a string é "FIM"
    @param *p1 - ponteiro para a string
    @return - verificar se a comparação é diferente de 0
*/ 
bool ifFim(char *p1) {
    // Comparar p1 com "FIM"
    return strcmp("FIM", p1) != 0;
}

/*
    Método para ler a string do teclado
    @param *p1 - ponteiro para a string
    @return void
*/ 
void lerLinha(char *p1) {
    scanf("%[^\r\n]", p1);
    getchar();
}

/*
    Método principal
*/
int main(void) {
    // Declaração de dados
    char p1[1000];

    // Primeira leitura
    lerLinha(p1);

    // Repetir enquanto for diferente de "FIM"
    while (ifFim(p1)) {
        // Verificação principal
        if (verify(p1)) {
            printf("SIM\n"); // Se for verdadeiro
        } else {
            printf("NAO\n"); // Se for falso
        }

        // Leitura interna (repetir até p1 ser "FIM")
        lerLinha(p1);
    }

    // Fim do programa
    return 0;
}
