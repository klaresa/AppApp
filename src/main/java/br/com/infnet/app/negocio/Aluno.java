package br.com.infnet.app.negocio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TAluno")
public class Aluno {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	
	public Aluno() {
	}
	
	public Aluno(String nome) {
		this();
		this.nome = nome;
	}
		
	public Aluno(Integer id, String nome) {
		this();
		this.id = id;
		this.nome = nome;
	}

	@Override
	public String toString() {
		return String.format("%d - %s", 
				this.getId(), 
				this.getNome());
	}

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
	

}
