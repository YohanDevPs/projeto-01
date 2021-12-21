package servicos;

import java.util.ArrayList;
import java.util.List;

import entidades.Cliente;
import entidades.Produto;

public class NotaPagamento extends Cliente{

	static final Double descontoCpfInformado = 0.85;
	private List<Produto> produtos = new ArrayList<>();
	private Produto produto;
	private Cliente cliente;

	public double pagamentoTotal(){
		int soma = 0;
		for(Produto ls : produtos){
			soma += produto.getPeso() * produto.getPrecoProduto();
		}
		
		if(produto.isClienteInformouCpf() == true) {
		return soma * 85;
		
		}else {
			return soma;
		}
	}

	@Override
	public String toString() {
		return "NotaPagamento: " 
	+ produto.getNomeProduto() 
	+ ": " + produto.getPeso() 
	+ "*"
	+ produto.getPrecoProduto()
	+pagamentoTotal();
	}
}
