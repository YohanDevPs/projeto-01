package entidades;

public class Cliente {

	private String nome;
	private Integer cpf;
	
	public Cliente() {
	}

	public Cliente(String nome) {
		this.nome = nome;
	}

	
	public Cliente(String nome, Integer cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Integer getCpf() {
		return cpf;
	}
	
	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}
	
}
