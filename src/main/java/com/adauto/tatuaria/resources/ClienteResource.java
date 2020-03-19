package com.adauto.tatuaria.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.adauto.tatuaria.entidades.Cliente;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteResource {
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Cliente> listar() {
		
		Cliente cli1 = new Cliente("joao", 12, "Masculino", "11263245", "joao@gmail.com", "123456", "cabeça", "quero q ela seja grande e bla bla bla");
		Cliente cli2 = new Cliente("Pedro", 12, "Masculino", "115489648", "pedro@gmail.com", "1111", "cabeça", "quero q ela seja grande e bla bla bla");
		
		List<Cliente> lista = new ArrayList<>();
		lista.add(cli1);
		lista.add(cli2);
		
		
		return lista;
	}
}
