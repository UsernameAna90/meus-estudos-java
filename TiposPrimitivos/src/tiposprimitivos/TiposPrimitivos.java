package tiposprimitivos;

import java.util.Scanner;

public class TiposPrimitivos {

    public static void main(String[] args) {
        //Declaração de variáveis da forma comum
        String nome = "Ana";
        String nome2 = "Clara";
        String nome3;
        float nota = 9.5f;
        float nota2 = 9.67f;
        float nota3;
        
        //Modo de saida de dados 1 (saltando linha):
        System.out.println("Nota: " + nota);
        
        //Modo de saida de dados 2 (formatando):
        System.out.printf("A nota da %s é igual à %.2f!\n", nome, nota);
        
        //Modo de saida de dados 3 (formatando):
        System.out.format("A nota da %s é igual à %.3f!\n", nome2, nota2);
        
        //Entrada de dados 
        //Declaração do objeto responsável por ler os valores de entrada:
        Scanner teclado = new Scanner(System.in);
        
        //Lendo valores:
        System.out.println("Digite seu nome: ");
        nome3 = teclado.nextLine();
        
        System.out.println("Digite sua nota: ");
        nota3 = teclado.nextFloat();
        
        //Exibindo valores lidos:
        System.out.format("A nota do(a) %s é igual à %.2f!\n", nome3, nota3);
    }
    
}
