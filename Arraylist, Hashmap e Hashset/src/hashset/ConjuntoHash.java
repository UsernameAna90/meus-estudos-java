package hashset;

import java.util.HashSet;
import java.util.Set;

//IMPORTANDO CLASSE PUBLICA DE OUTRO PACOTE
import arraylist.ObjetosLista;

public class ConjuntoHash {

	public static void main(String[] args) {
		
		//INSTANCIANDO OBJETOS
		ObjetosLista p1 = new ObjetosLista("Thiago", 29);
		ObjetosLista p2 = new ObjetosLista("Pedro", 33);
		ObjetosLista p3 = new ObjetosLista("Rodrigo", 19);
		ObjetosLista p4 = new ObjetosLista("Sabrina", 19);
		
		//CRIANDO UM CONJUNTO
		Set<ObjetosLista> conjuntoPessoas = new HashSet<>();
		
		//ADCIONANDO OS OBJETOS AO CONJUNTO
		conjuntoPessoas.add(p1);
		conjuntoPessoas.add(p2);
		conjuntoPessoas.add(p3);
		conjuntoPessoas.add(p4);
		
		//PERCORRENDO OS OBJETOS DO CONJUNTO
		for(ObjetosLista conjunto : conjuntoPessoas) {
			System.out.println(conjunto.getNome() +" possui "+ conjunto.getIdade() +" anos!");
		}

	}

}
