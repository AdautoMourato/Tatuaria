package com.adauto.tatuaria;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.adauto.tatuaria.entidades.Cliente;
import com.adauto.tatuaria.repositories.ClienteRepository;

@SpringBootApplication
public class TatuariaApplication implements CommandLineRunner{
	
	@Autowired
	private ClienteRepository repo;

	public static void main(String[] args) {
		SpringApplication.run(TatuariaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Cliente cli1 = new Cliente("joao", 12, "Masculino", (long) 112632, "joao@gmail.com", "123456", "cabeça", "quero q ela seja grande e bla bla bla");
		Cliente cli2 = new Cliente("Pedro", 12, "Masculino", (long) 1154411, "pedro@gmail.com", "1111", "cabeça", "quero q ela seja grande e bla bla bla");
		
		repo.saveAll(Arrays.asList(cli1,cli2));
		
	}

}
