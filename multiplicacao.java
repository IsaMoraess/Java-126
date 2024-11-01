/*Os computadores estão desempenhando um crescente papel na educação. 
Escreva um programa que ajudará um estudante do ensino fundamental a aprender 
multiplicação. Utilize algum gerador de números aleatórios para produzir 
dois números inteiros positivos. O Programa deve então fazer ao usuário o 
seguinte tipo de pergunta: Quanto é 6 vezes 7? Depois o programa deve ler a 
resposta e informar se o usuário acertou ou não. */

import java.util.Random;
import java.util.Scanner;
public class multiplicacao {
    public static void main(String[] args) {
        //GERAR NUM ALEATORIO
        Random ran = new Random();
        int numero1 = ran.nextInt(10); // GERAR NUM DE 0 A 9
        int numero2 = ran.nextInt(10); // GERAR NUM DE 0 A 9

        // CALCULA RESULTADO CORRETO
        int resultadoCorreto = numero1 * numero2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Quanto é " + numero1 + " vezes " + numero2 + "?");
        int respostaUsuario = sc.nextInt();
        
        if (respostaUsuario == resultadoCorreto) {
            System.out.println("Parabéns! Você acertou.");
        } else {
            System.out.println("Resposta incorreta. O resultado correto é: " + resultadoCorreto);
        }
    }
}


