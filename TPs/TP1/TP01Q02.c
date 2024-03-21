#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <stdbool.h>

/*
    Method to verify if the string is a palindrome
    @param *p1 - pointer to string
    @return result - boolean result
*/
bool verify(char *p1)
{

    // data declaration
    int contInv = strlen(p1) - 1; // inverted counter
    bool result = false; // result

    // repeatition to go through half the string and compare thelast char with the frist
    for (int i = 0; i < (strlen(p1))/ 2; i = i + 1)
    {
        // test to avoid comparing the same char
        if(i != contInv){

            // array verification test
            if (p1[i] == p1[contInv])
            {
                // if is true
                result = true;
            }
            else
            {
                // if is false, stop repeat and return false
                result = false;
                i = strlen(p1)/2; // "break"
            } // end if 2
        } // end if 1

        //inverted movment
        contInv = contInv - 1;

    } // end for

    // return result
    return result;
}

/*
    Method to compare if the string is "FIM"
    @param *p1 - pointer to string
    @return - check if the comparison is different from 0
*/ 
bool ifFim(char *p1)
{   
    // compare p1 with "FIM"
    return strcmp("FIM", p1) != 0;
}

/*
    Method to get string from the keyboard
    @param *p1 - pointer to string
    @return void
*/ 
void lerLinha(char *p1)
{
    scanf("%[^\r\n]", p1);
    getchar();
}

/*
    Main Method
*/
int main(void)
{

    // data declaration
    char p1[1000];

    // frist reading
    lerLinha(p1);


    // repeat as long as it is different from "FIM"
    while (ifFim(p1))
    {
        // main verification test
        if (verify(p1))
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
