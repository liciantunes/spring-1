package com.example.Alicie.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Cliente")
public class ClienteEntitie {
	
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idcCliente;
	
	@Column(name = "nome")
	private String ncliente;
	
	@Column(name = "telefone")
	private String fone;
	
	public ClienteEntitie() {
		
	}

	public ClienteEntitie(Long idcCliente, String ncliente, String fone) {
		super();
		this.idcCliente = idcCliente;
		this.ncliente = ncliente;
		this.fone = fone;
	}
	
	public Long getIdcCliente() {
		return idcCliente;
	}
	
	public void setIdcCliente(Long idcCliente) {
		this.idcCliente = idcCliente;
	}
	
	public String getNcliente() {
		return ncliente;
	}
	
	public void setNcliente(String ncliente) {
		this.ncliente = ncliente;
	}
	
	public String getFone() {
		return fone;
	}
	
	public void setFone(String fone) {
		this.fone = fone;
	}
}







