/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresaritmeticos;

public class OperadoresAritmeticos {

    public static void main(String[] args) {
        int n = 25;
        System.out.println(Math.pow(n, 5)); //Potenciação
        System.out.println(Math.sqrt(n)); //Raíz quadrada
        System.out.println(Math.cbrt(n)); //Raiz cúbica
        
        float n2 = 11.8f;
        System.out.println(Math.round(n2)); //Arrendonda arirmeticamente
        System.out.println(Math.ceil(n2)); //Arredonda pra cima
        System.out.println(Math.floor(n2)); //Arredonda pra baixo
        
        int n3 = -150;
        System.out.println(Math.abs(n3)); //Mostra o valor absoluto, ignora o sinal negativo
        System.out.println(++n); //Incremento
        System.out.println(--n); //Decremento
        
        float n4 = 5;
        System.out.println(n4 /= 2); //Recebe a si mesmo dividido por 2
        System.out.println(n4 *= 3); //Recebe a si mesmo dividido por 2 
        
        System.out.println(Math.random()); //Gera um numero aleatório de 1 a 10
        System.out.println(10 + Math.random() * (25 - 10)); //Gera um numero aleatorio de 1 a 25
    }
    
}
