package comparacoes;

public class Comparacoes {

	public static void main(String[] args) {
		
		//INTANCIANDO OBJETOS
		Pessoa p1 = new Pessoa("Ana", 1426459963);
		Pessoa p2 = new Pessoa("Sebastian", 1426459699);
		Pessoa p3 = new Pessoa("Sebastian", 1426459699);
		
		//COMPARANDO OBJETOS COM OPERADOR RELACIONAL
		if (p1 == p2) {
			System.out.println("Objetos iguais!");
		} else {
			System.out.println("Objetos diferentes!");
		}
		
		if (p2 == p3) {
			System.out.println("Objetos iguais!");
		} else {
			System.out.println("Objetos diferentes!");
		} //Os objetos são considerados diferentes, porque ocupam diferentes espaços na memória.
		
		//COMPARANDO OBJETOS COM METODO EQUALS
		if (p1.equals(p2)) {
			System.out.println("Objetos iguais!");
		} else {
			System.out.println("Objetos diferentes!");
		}
		
		if (p2.equals(p3)) {
			System.out.println("Objetos iguais!");
		} else {
			System.out.println("Objetos diferentes!");
		}

	}

}
