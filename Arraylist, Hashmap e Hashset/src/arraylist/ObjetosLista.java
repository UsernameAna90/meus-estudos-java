package arraylist;

public class ObjetosLista {

	//ATRIBUTOS
	private String nome;
	private int idade;
	
	//METODOS AUXILIARES
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	//METODO CONSTRUTOR
	public ObjetosLista(String nome, int idade) {
		this.setNome(nome);
		this.setIdade(idade);
	}
	
}
