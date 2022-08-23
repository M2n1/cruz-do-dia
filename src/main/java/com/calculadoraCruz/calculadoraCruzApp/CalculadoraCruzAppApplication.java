package com.calculadoraCruz.calculadoraCruzApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.calculadoraCruz.calculadoraCruzApp.service.CruzDiaService;

@SpringBootApplication
public class CalculadoraCruzAppApplication implements ApplicationRunner {

	@Autowired
	private CruzDiaService service;

	public static void main(String[] args) {
		SpringApplication.run(CalculadoraCruzAppApplication.class, args);

	}

	@Override
	public void run(ApplicationArguments args) throws Exception {

		service.calcularCruz();
	}

}
