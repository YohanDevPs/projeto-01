package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Cliente;
import entidades.Produto;
import entidades.ProdutoPorQuantidade;
import entidades.ProdutoPorQuilo;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Produto> listProduto = new ArrayList<>();
		List<Cliente> listaCliente = new ArrayList<>();
		
		Produto produtoQuilo = new ProdutoPorQuilo();
		Produto produtoUnidade = new ProdutoPorQuantidade();
		
		System.out.println("Há clientes? ");
		char existeCliente = sc.next().charAt(0);
		
		while(existeCliente == 's') {
			System.out.print("Nome Cliente: ");
			sc.nextLine();
			String nomeCliente = sc.nextLine();
			System.out.print("CPF do cliente: ");
			int cpf = sc.nextInt();
			listaCliente.add(new Cliente(nomeCliente, cpf));
		
			System.out.println("quantos produtos?");
			int qt = sc.nextInt();
			
			for(int i = 0; i< qt; i++) {
				
				System.out.print("O produto é por peso ou quantidade:? p/q");
				char ch = sc.next().charAt(0);
				
				if(ch == 'p') {
					System.out.print("Digite o nome do produto: ");
					String nomeProduto = sc.next();
					System.out.print("Defina o preço por quilo do produto: ");
					double precoQuilo = sc.nextDouble();
					System.out.print("Defina peso do Produto: ");
					double pesoProduto = sc.nextDouble();
					produtoQuilo = new ProdutoPorQuilo(nomeProduto, precoQuilo, pesoProduto);
					listProduto.add(produtoQuilo);
				}else {
					System.out.print("Digite o nome do produto: ");
					String nomeProduto = sc.next();
					System.out.print("Digite o preço por unidade: ");
					double precoUnidade = sc.nextDouble();
					System.out.print("Digite a quantidade do produto: ");
					int quantidade = sc.nextInt();
					
					produtoUnidade = new ProdutoPorQuantidade(nomeProduto, quantidade, precoUnidade);
					listProduto.add(produtoUnidade);
				}
			}
			double soma = 0;
			for(Produto ls : listProduto) {
				soma += ls.totalPagamento();
			}
			System.out.print( listaCliente);
			System.out.println(listProduto+"\n Pagamento total: "+soma);
			listProduto.clear();
			
			System.out.println("Há algum outro cliente? s/n");
			existeCliente = sc.next().charAt(0);
		}
	
		
		sc.close();	
	}
}
				
				

			
	
