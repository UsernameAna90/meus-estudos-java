package procedimentosfuncoes;

public class ProcedimentosFuncoes {

    //Criando um método
    public static void soma(int a, int b) {
        int r = a + b;
        System.out.printf("A soma de %d mais %d é igual à %d!\n", a, b, r);
    }
    
    //Criando um método com retorno de resultado
    public static int multiplicacao(int n1, int n2) {
        int n = n1 * n2;
        return n;
    }
    
    public static void main(String[] args) {
        int v1 = 20;
        int v2 = 3;
        
        //Chamando o método
        soma(v1, v2);
        
        //Chamando o método com retorno de resultado
        int m = multiplicacao(v1, v2);
        System.out.printf("A multiplicacao de %d vezes %d é igual à %d!\n", v1, v2, m);
        
        //Chamando o método externo
        float d = MetodoExterno.divisao(v1, v2);
        System.out.printf("A divisao de %d dividido por %d é igual à %.2f!\n", v1, v2, d);
    }
    
}
