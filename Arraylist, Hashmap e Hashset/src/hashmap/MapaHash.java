package hashmap;

import java.util.HashMap;
import java.util.Map;

//IMPORTANDO CLASSE PUBLICA DE OUTRO PACOTE
import arraylist.ObjetosLista;

public class MapaHash {

	public static void main(String[] args) {
	
		//INSTANCIANDO OBJETOS
		ObjetosLista p1 = new ObjetosLista("Mateus", 20);
		ObjetosLista p2 = new ObjetosLista("Marcos", 25);
		ObjetosLista p3 = new ObjetosLista("Marcela", 18);
		ObjetosLista p4 = new ObjetosLista("Mariana", 15);
	
		//CRIANDO MAPA
		Map<String, ObjetosLista> mapaPessoas = new HashMap<>();
	
		//ADCIONANDO OS OBJETOS AO MAPA
		mapaPessoas.put(p1.getNome(), p1);
		mapaPessoas.put(p2.getNome(), p2);
		mapaPessoas.put(p3.getNome(), p3);
		mapaPessoas.put(p4.getNome(), p4);
		
		//PERCORRENDO OS OBJETOS DO MAPA
		for(ObjetosLista mapa : mapaPessoas.values()) {
			System.out.println(mapa.getNome() +" possui "+ mapa.getIdade() +" anos!");
		}
	}

}
