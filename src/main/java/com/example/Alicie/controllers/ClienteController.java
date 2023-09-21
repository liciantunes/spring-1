package com.example.Alicie.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Alicie.entities.ClienteEntitie;
import com.example.Alicie.servicies.ClienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

	private final ClienteService clienteService;
	
	@Autowired
	public ClienteController (ClienteService clienteService) {
		this.clienteService = clienteService;
	}
	
	@PostMapping
	public ClienteEntitie creatCliente(@RequestBody ClienteEntitie cliententitie) {
		return clienteService.saveCliente(cliententitie);
	}
	
	@GetMapping("/{idcCliente}")
	public ClienteEntitie getCliente(@PathVariable Long idcCliente) {
		return clienteService.getClienteByIdcCliente(idcCliente);
	}
	
	@GetMapping
	public List<ClienteEntitie> getAllCliente(){
		return clienteService.getAllCliente();
	}
	
	@DeleteMapping("/{idcCliente}")
	public void deleteCliente(@PathVariable Long idcCliente) {
		clienteService.deleteCliente(idcCliente);
	}
	
}






