package lacosderepeticao;

import java.util.Scanner;

public class LacosDeRepeticao {
    
    public static void main(String[] args) {
        int i = 1;
        String res;
        String sim = "s";
        Scanner teclado = new Scanner(System.in);
        
        //Estrutura de repetição com condição no início
        while (i <= 3) {
            System.out.println(i + " braboleta");
            i++;
        }
        
        //Estrutura de repetição com condição no final
        i = 1;
        
        do {
            System.out.println("Você ganhou "+ i +" bala(s)! Deseja outra? (s/n)");
            res = teclado.nextLine();
            i++;
        } while (res.equals(sim));
        
        //Estrutura de repetição com controle de repetições
        for (i = 1; i <= 3; i++){
            System.out.println(i + " macaquinho");
        }
                    
    }
    
}
