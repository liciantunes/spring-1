package com.example.Alicie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Alicie.entities.ClienteEntitie;

public interface ClienteRepository  extends JpaRepository<ClienteEntitie,Long>{
	
}
