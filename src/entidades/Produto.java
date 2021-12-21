package entidades;

public class Produto {

	private boolean clienteInformouCpf;
	private String nomeProduto;
	private Double precoProduto;
	private Double pesoProduto;
	
	public Produto() {
	}
	
	public Produto(String nomeProduto, Double precoProduto, Double pesoProduto) {
		this.nomeProduto = nomeProduto;
		this.precoProduto = precoProduto;
		this.pesoProduto = pesoProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public Double getPrecoProduto() {
		return precoProduto;
	}

	public Double getPeso() {
		return pesoProduto;
	}

	public Double precoProduto() {
			return precoProduto*pesoProduto;
	}

	public boolean isClienteInformouCpf() {
		return clienteInformouCpf;
	}
	
	
}
