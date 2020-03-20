package com.adauto.tatuaria;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.adauto.tatuaria.entidades.Cliente;
import com.adauto.tatuaria.entidades.Tatuador;
import com.adauto.tatuaria.repositories.ClienteRepository;
import com.adauto.tatuaria.repositories.TatuadorRepository;

@SpringBootApplication
public class TatuariaApplication implements CommandLineRunner{
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private TatuadorRepository tatuadorRepository;

	public static void main(String[] args) {
		SpringApplication.run(TatuariaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
//		Cliente cli1 = new Cliente("joao", 12, "Masculino",112632, "joao@gmail.com", "123456", "cabeça", "quero q ela seja grande e bla bla bla");
//		Cliente cli2 = new Cliente("Pedro", 12, "Masculino",1154411, "pedro@gmail.com", "1111", "cabeça", "quero q ela seja grande e bla bla bla");
//		
//		Tatuador ta1 = new Tatuador(123456, "joquias", 18, "Masculino", "joquias@uol.com", "1234598875");

	
		Cliente cli1 = new Cliente(null, 1231564, "joao", 12, "Masculino", "joao@gmail.com", "123456", "cabeça", "quero q ela seja grande e bla bla bla");
		Cliente cli2 = new Cliente(null, 1515, "Pedro", 12, "Masculino", "Pedro@gmail.com", "123456",  "cabeça", "quero q ela seja grande e bla bla bla");
		
		Tatuador ta1 = new Tatuador(null, 2222, "andre", 22, "Masculino", "andre@tattoo,com", "151561");
		
		cli1.getTatuadores().addAll(Arrays.asList(ta1));
		cli2.getTatuadores().addAll(Arrays.asList(ta1));
		
		ta1.getClientes().addAll(Arrays.asList(cli1,cli2));
		
		clienteRepository.saveAll(Arrays.asList(cli1,cli2));
		tatuadorRepository.saveAll(Arrays.asList(ta1));

		
	}

}
