package com.example.Alicie.servicies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Alicie.entities.ClienteEntitie;
import com.example.Alicie.repositories.ClienteRepository;

@Service
public class ClienteService {

	
		private final ClienteRepository clienteRepository;
		
		@Autowired
		public ClienteService (ClienteRepository clienteRepository) {
			this.clienteRepository = clienteRepository;
		}
		
		public ClienteEntitie saveCliente(ClienteEntitie cliente) {
			return clienteRepository.save(cliente);
		}
		
		public List<ClienteEntitie> getAllCliente(){
			return clienteRepository.findAll();
		}
		
		public ClienteEntitie getClienteByIdcCliente(Long idcCliente) {
			return clienteRepository.findById(idcCliente).orElse(null);
		}
		
		public void deleteCliente(Long idcCliente) {
			clienteRepository.deleteById(idcCliente);
		}
			

	}


