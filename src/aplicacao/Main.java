package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Cliente;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

	System.out.print("Há algum cliente? s/n ");
	char existeCliente = sc.next().charAt(0);
	List<Cliente> listaCliente = new ArrayList<>();

	while(existeCliente == 's') {
	System.out.print("Nome Cliente: ");
	String nomeCliente = sc.nextLine();
	System.out.print("Cliente deseja informar CPF? s/n");
	char desejaInformarCpf = sc.next().charAt(0);
	if(desejaInformarCpf == 's') {
		System.out.print("CPF do cliente: ");
		int cpf = sc.nextInt();
		listaCliente.add(new Cliente(nomeCliente, cpf));
		
	}else {
		listaCliente.add(new Cliente(nomeCliente));
	}
	
	System.out.print("Quantidade de produtos: ");
	int quantidadeProdutos = sc.nextInt();
	
	for(int i = 0; i < quantidadeProdutos; i++ ){
		System.out.print("Nome do produto "+(i+1)+": ");
		String nomeProduto = sc.next();
		System.out.print("Nome do produto "+(i+1)+": ");
		System.out.print("Nome do produto "+(i+1)+": ");

	}
		
		existeCliente = sc.next().charAt(0);
	}
	System.out.print("Terminou o programa ");
			
		sc.close();	
	}
}
