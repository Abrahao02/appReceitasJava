package com.example.appReceitasJava;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.example.appReceitasJava.model.domain.Login;

@Order(1)
@Component
public class LoginLoader implements ApplicationRunner {
	
	private Map<String, Login> mapa = new HashMap<String, Login>();
	
	@Override
	public void run (ApplicationArguments args) throws Exception {
		
		FileReader file = new FileReader("Files/Login.txt");
		BufferedReader leitura = new BufferedReader(file);
		
		String linha = leitura.readLine();
		
		String[] campos = null;
		
		while(linha != null) {
			campos = linha.split(";");
			
			Login login = new Login();
			login.setNome(campos[0]);
			login.setCpf(campos[1]);
			login.setEmail(campos[2]);
			
			mapa.put(login.getCpf(), login);
			
			linha = leitura.readLine();
		}
		
		for(Login login : mapa.values()) {
			System.out.println(" [LOGIN] " + login);
		}
		
		
		leitura.close();
	}

}
