package Produto.Modelo;

public class Produto {

	public int marca;
	public float preço;
	public String nome;
	public String colecao;
	public int estoque;
	
	public Produto(int marca, double preço, String nome, String colecao, int estoque) {
		
		this.marca = marca;
		this.preço = (float) preço;
		this.nome = nome;
		this.colecao = colecao;
		this.estoque = estoque;
	
	
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	

	public int getMarca() {
		return marca;
	}

	public void setMarca(int marca) {
		this.marca = marca;
	}

	public float getPreço() {
		return preço;
	}

	public void setPreço(float preço) {
		this.preço = preço;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getColecao() {
		return colecao;
	}

	public void setcolecao(String colecao) {
		this.colecao = colecao;
	}
public  boolean retirar (int quantidade) {
		if(this.getEstoque() < quantidade) {
			System.out.println("Não há produto disponível em estoque.");
			return false;
		}
		this.setEstoque(this.getEstoque() - quantidade);
		return true;
}
public void adicionar (int quantidade) {
	this.setEstoque(this.getEstoque() + quantidade);
	
}
public void visualizar() {

	String nomedaMarca = "";
	
	switch(this.marca) {
	case 1:
		nomedaMarca = "Mattel";
	break;
	case 2:
		nomedaMarca = "Candide";
	break;
	case 3:
		nomedaMarca = "Outros";
	}
	
	System.out.println("\n\n***********************************************************");
	System.out.println("Dados da Boneca:");
	System.out.println("***********************************************************");
	System.out.println("Nome da boneca :" + this.nome);
	System.out.println("Marca produtora da boneca :  " + nomedaMarca);
	System.out.println("A boneca é da coleção : " + this.colecao);
	System.out.println("Preço da boneca: " + this.preço);
	System.out.println("Estoque : " + this.estoque);
}
}

