package com.calculadoraCruz.calculadoraCruzApp.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CruzDiaService {

	public String calcularCruz() {

		int dia = LocalDate.now().getDayOfMonth();
		int parametro = 3;
		int posicao = dia + parametro;
		int aux = posicao + parametro;

		List<Integer> parametros = new ArrayList();
		parametros.add(posicao);
		parametros.add(aux);

		for (int i = 0; i < 2; i++) {
			aux = aux + parametro;
			parametros.add(aux);

		}

		StringBuilder resposta = new StringBuilder();

		parametros.forEach(num -> {
			String pos = Integer.toString(num);
			resposta.append(pos.substring(pos.length() - 1));
		});

		System.out.println(resposta);
		return resposta.toString();
	}

}
