package entidades;

public class ProdutoPorQuantidade extends Produto{
	
	private Integer quantidade;
	private Double precoPorUnidade;


	public ProdutoPorQuantidade(String nomeProduto, Integer quantidade, Double precoPorUnidade) {
		super(nomeProduto);
		this.quantidade = quantidade;
		this.precoPorUnidade = precoPorUnidade;
	}

	public ProdutoPorQuantidade() {
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPrecoPorUnidade() {
		return precoPorUnidade;
	}

	public void setPrecoPorUnidade(Double precoPorUnidade) {
		this.precoPorUnidade = precoPorUnidade;
	}

	@Override
	public Double totalPagamento() {
		return precoPorUnidade * quantidade;
	}

	@Override
	public String toString() {
		return  "Produto: " 
				+ getNomeProduto()
				+ ", Preço por unidade: "
				+ precoPorUnidade
				+ " ,Quantidade: "
				+ quantidade;
	}
}
				
	
	

