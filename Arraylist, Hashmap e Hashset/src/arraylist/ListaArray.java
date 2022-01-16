package arraylist;

import java.util.ArrayList;
import java.util.List;

public class ListaArray {

	public static void main(String[] args) {
		
		//INSTANCIANDO OBJETOS
		ObjetosLista p1 = new ObjetosLista("Ana", 21);
		ObjetosLista p2 = new ObjetosLista("Mariana", 20);
		ObjetosLista p3 = new ObjetosLista("Emanuel", 25);
		ObjetosLista p4 = new ObjetosLista("Cursino", 30);
		
		//CRIANDO LISTA
		List<ObjetosLista> listaPessoas = new ArrayList<>();
		
		//ADCIONANDO OS OBJETOS A LISTA
		listaPessoas.add(p1);
		listaPessoas.add(p2);
		listaPessoas.add(p3);
		listaPessoas.add(p4);
		
		//PERCORRENDO A LISTA
		for(ObjetosLista lista : listaPessoas) {
			System.out.println(lista.getNome() +" possui "+ lista.getIdade() +" anos!");
		}
	}

}
