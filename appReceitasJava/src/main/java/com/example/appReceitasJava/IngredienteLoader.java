package com.example.appReceitasJava;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.example.appReceitasJava.model.domain.Ingrediente;

@Order(2)
@Component
public class IngredienteLoader implements ApplicationRunner {

	private Map<Integer, Ingrediente> mapa = new HashMap<Integer, Ingrediente>();
	
	@Override
	public void run (ApplicationArguments args) throws Exception {

		FileReader file = new FileReader("Files/Ingredientes.txt");
		BufferedReader leitura = new BufferedReader(file);

		String linha = leitura.readLine();

		String[] campos = null;

		while (linha != null) {
			campos = linha.split(";");

			Ingrediente ingrediente = new Ingrediente();
			ingrediente.setNomeReceita(campos[0]);
			ingrediente.setValorTotalReceita(Float.valueOf(campos[1]));
			ingrediente.setCodigo(Integer.valueOf(campos[2]));
			ingrediente.setNomeIngrediente(campos[3]);
			ingrediente.setPrecoIngrediente(Float.valueOf(campos[4]));
			ingrediente.setQuantidadeIngrediente(Float.valueOf(campos[5]));
			ingrediente.setQuantidadeUtilizadaIngrediente(Float.valueOf(campos[6]));
			
			mapa.put(ingrediente.getCodigo(), ingrediente);

			linha = leitura.readLine();
		}

		for (Ingrediente ingrediente : mapa.values()) {
			System.out.println(" [INGREDIENTE] " + ingrediente);
		}

		leitura.close();
	}
}
