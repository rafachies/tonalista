package br.net.tonalista.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "balada")
@XmlAccessorType(XmlAccessType.FIELD)
public class Balada {

	@XmlElement(name = "id")
	private Integer id;
	
	@XmlElement(name = "nome")
	private String nome;
	
	@XmlElement(name = "endereco")
	private String endereco;
	
	@XmlElement(name = "telefone")
	private String telefone;
	
	@XmlElement(name = "email")
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
