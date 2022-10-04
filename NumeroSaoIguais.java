/*Desafio
Nesse desafio, dados dois números, verifique se eles são iguais. Caso sejam, retorne "Sao iguais!”. Caso contrário, retorne "Nao sao iguais!” sem as aspas. 

Entrada
As entradas serão dois valores, um em cada linha, representados por A e B, que sempre serão números inteiros. 

Saída
A saída deverá retornar a frase "Sao iguais!" caso A e B sejam o mesmo valor. Caso contrário,  retorne "Nao sao iguais!", sem as aspas.

EXEMPLO DE ENTRADA 

EXEMPLO DE SAÍDA 

1
2

Nao sao iguais! 

50
50

Sao iguais! 

38
90

Nao sao iguais! 
*/

import java.util.*;

public class NumeroSaoIguais {

    public static void main(String[] args) {

        int n1, n2 = 0;
        try (// TODO: Imprima se os valores numéricos passados são iguais ou não.
                Scanner leitor = new Scanner(System.in)) {
            n1 = leitor.nextInt();
            n2 = leitor.nextInt();
        }
        if (n1 != n2) {
            System.out.println("Nao sao iguais!");
            return;
        } else {
            System.out.println("Sao iguais!");
            return;
        }

    }
}