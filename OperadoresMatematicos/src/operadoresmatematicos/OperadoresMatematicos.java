package operadoresmatematicos;

public class OperadoresMatematicos {

    public static void main(String[] args) {
        int n = 25;
        float p = (float) Math.pow(n, 5);
        String r = Float.toString(p);
        System.out.format("Resultado %d",n);
    }
    
}
