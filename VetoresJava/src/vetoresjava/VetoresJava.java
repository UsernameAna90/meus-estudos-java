package vetoresjava;

import java.util.Arrays;
import java.util.Scanner;

public class VetoresJava {

    public static void main(String[] args) {
        //Declarando vetores;
        int num[] = new int[5];
        String nomes[] = {"Ana", "Mari", "Iris", "Cursino", "Thiago", "Pedro", "Emanuel"};
        
        //Declarando for específico para vetores: for each
        for (String nome : nomes) {
            System.out.println(nome);
        }
        
        //Ordenando os objetos do vetor
        Arrays.sort(nomes);
        
        //Mostrando os objetos ordenados, utiilizando o tamanho do vetor
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
        
        //Criando um scanner de entrada de dados
        Scanner entrada = new Scanner(System.in);
        
        //Inserindo numeros no vetor vazio com laço de repetição e leitura de dados
        for (int i = 0; i < num.length; i++) {
            System.out.print("Insira um numero: ");
            num[i] = entrada.nextInt();
        }
        
        for (int n: num) {
            System.out.println(n);
        }
        
        //Encontrando um numero no vetor
        System.out.println("Qual numero deseja obter do vetor?");
        int n1 = entrada.nextInt();
        int n2 = Arrays.binarySearch(num, n1); //Encontra a posição no numero
        System.out.println("Encontrado o numero "+n1+" na posição "+n2+"!");
    }
    
}
