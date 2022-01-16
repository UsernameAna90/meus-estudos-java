package conversaotiposdados;

import java.io.PrintStream;

public class ConversaoTiposDados {
    
    public static void main(String[] args) {
        String altura = "10";
        int idade = 21;
        float nota = 9.5f;
        
        //Convertendo string para int:
        int x = Integer.parseInt(altura);
        System.out.printf("Inteiro: %d\n", x);
        
        //Convertendo int para string:
        String y = Integer.toString(idade);
        System.out.printf("String: %s\n", y);
        
        //Convettendo string para float:
        float z = Float.parseFloat(altura);
        System.out.printf("Float: %.2f\n", z);
        
        //Convertendo float para string:
        String w = Float.toString(nota);
        System.out.printf("String: %s\n", w);
    }
    
}
