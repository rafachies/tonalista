package br.net.tonalista.model;

public class Balada {

	private Integer id;
	
	private String nome;
	
	private String endereco;
	
	private String telefone;
	
	private String emailDaLista;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmailDaLista() {
		return emailDaLista;
	}

	public void setEmailDaLista(String emailDaLista) {
		this.emailDaLista = emailDaLista;
	}
	
}
