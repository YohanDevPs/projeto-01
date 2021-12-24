package entidades;

public class ProdutoPorQuilo extends Produto{

	private Double precoPorQuilo;
	private Double pesoProduto;
	
	public ProdutoPorQuilo() {
	}
	
	public ProdutoPorQuilo(String nomeProduto, Double precoPorQuilo, Double pesoProduto) {
		super(nomeProduto);
		this.precoPorQuilo = precoPorQuilo;
		this.pesoProduto = pesoProduto;
	}

	public Double getPrecoPorQuilo() {
		return precoPorQuilo;
	}

	public void setPrecoPorQuilo(Double precoPorQuilo) {
		this.precoPorQuilo = precoPorQuilo;
	}

	public Double getPesoProduto() {
		return pesoProduto;
	}

	public void setPesoProduto(Double pesoProduto) {
		this.pesoProduto = pesoProduto;
	}

	@Override
	public Double totalPagamento() {
		return getPesoProduto()*getPrecoPorQuilo();
		}

	@Override
	public String toString() {
		return "Produto: "
				 + getNomeProduto()
				 +", Preço por quilo: " 
				 + precoPorQuilo 
				 +", Peso do Produto: " 
				 + pesoProduto;
	}


	
}
