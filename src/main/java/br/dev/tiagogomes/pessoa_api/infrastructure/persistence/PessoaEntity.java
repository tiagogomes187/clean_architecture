package br.dev.tiagogomes.pessoa_api.infrastructure.persistence;

import br.dev.tiagogomes.pessoa_api.core.enums.EnumTipoPessoa;
import jakarta.persistence.*;


@Entity
@Table (name = "TB_PESSOA")
public class PessoaEntity {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String email;
	private String cpfCnpj;
	@Enumerated (EnumType.STRING)
	private EnumTipoPessoa tipo;
	
	public PessoaEntity () {
	}
	
	public PessoaEntity (Long id, String nome, String email, String cpfCnpj, EnumTipoPessoa tipo) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.cpfCnpj = cpfCnpj;
		this.tipo = tipo;
	}
	
	public Long getId () {
		return id;
	}
	
	public void setId (Long id) {
		this.id = id;
	}
	
	public String getNome () {
		return nome;
	}
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public String getEmail () {
		return email;
	}
	
	public void setEmail (String email) {
		this.email = email;
	}
	
	public String getCpfCnpj () {
		return cpfCnpj;
	}
	
	public void setCpfCnpj (String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}
	
	public EnumTipoPessoa getTipo () {
		return tipo;
	}
	
	public void setTipo (EnumTipoPessoa tipo) {
		this.tipo = tipo;
	}
}
