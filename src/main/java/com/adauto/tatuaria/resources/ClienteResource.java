package com.adauto.tatuaria.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.adauto.tatuaria.entidades.Cliente;
import com.adauto.tatuaria.services.ClienteService;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteResource {
	
	@Autowired
	private ClienteService service;
	
	
	@RequestMapping(value="/{id}" , method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Long id) {
		
		Cliente obj = service.buscar(id);
		return ResponseEntity.ok().body(obj);
		
//		
//		Cliente cli1 = new Cliente("joao", 12, "Masculino", (long) 112632, "joao@gmail.com", "123456", "cabeça", "quero q ela seja grande e bla bla bla");
//		Cliente cli2 = new Cliente("Pedro", 12, "Masculino", (long) 1154411, "pedro@gmail.com", "1111", "cabeça", "quero q ela seja grande e bla bla bla");
//		
//		List<Cliente> lista = new ArrayList<>();
//		lista.add(cli1);
//		lista.add(cli2);
//		
//		
		
	}
}
