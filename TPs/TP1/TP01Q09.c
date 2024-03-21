#include <stdio.h>

void escreveArquivo(int n) {
    FILE *arq;
    double valor;
    arq = fopen("saida.bin", "wb");
    if (arq == NULL) {
        printf("Erro ao abrir o arquivo.\n");
        return;
    }
    for (int i = 0; i < n; i++) {
        scanf("%lf", &valor);
        fwrite(&valor, sizeof(double), 1, arq);
    }
    fclose(arq);
}

void leArquivo(int n) {
    FILE *arq;
    double valor;
    arq = fopen("saida.bin", "rb");
    if (arq == NULL) {
        printf("Erro ao abrir o arquivo.\n");
        return;
    }
    fseek(arq, 0, SEEK_END);
    int tam = ftell(arq);
    for (int i = tam - sizeof(double); i >= 0; i -= sizeof(double)) {
        fseek(arq, i, SEEK_SET);
        fread(&valor, sizeof(double), 1, arq);
        if (valor == (int)valor) {
            printf("%d\n", (int)valor);
        } else {
            printf("%.3lf\n", valor);
        }
    }
    fclose(arq);
}

int main() {
    int num;
    scanf("%d", &num);
    escreveArquivo(num);
    leArquivo(num);
    return 0;
}
