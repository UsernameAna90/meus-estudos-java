package estruturacondicionalcomposta;

import java.util.Scanner;

public class EstruturaCondicionalComposta {

    public static void main(String[] args) {
        int anoAtual = 2021;
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ano de Nascimento: ");
        int anoNas = teclado.nextInt();
        int idade = anoAtual - anoNas;
        
        System.out.printf("Sua idade é de %d anos!\n", idade);
        
        if (idade >= 18) {
            System.out.println("Você é maior de idade!");
        } else {
            System.out.println("Você é menor de idade!");
        }
    }
}
