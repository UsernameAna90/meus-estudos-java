package estruturamultiplaescolha;

import java.util.Scanner;

/**
 *
 * @author Fenrir
 */
public class EstruturaMultiplaEscolha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int tipo;
        
        System.out.print("Digite o número de pernas: ");
        int num = teclado.nextInt();
        
        switch (num) {
            case 1:
                System.out.println("Isso é um Saci!");
                break;
            case 2:
                System.out.println("Isso é um bípede!");
                break;
            case 3:
                System.out.println("Isso é um tripé!");
                break;
            case 4:
                System.out.println("Isso é um quadrupede!");
                break;
            case 6:
                System.out.println("Isso é uma aranha!");
                break;
            default:
                System.out.println("Isso é um ET!");
                break;
        }
    }
    
}
