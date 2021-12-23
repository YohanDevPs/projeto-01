package entidades;

public abstract class Produto {

	private String nomeProduto;
	
	
	public Produto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	
	public Produto() {
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public abstract Double totalPagamento();
	
	
	
}