package com.leticia.estruturadados.fila.teste;

import com.leticia.estruturadados.fila.Fila;

public class Aula21 {

	public static void main(String[] args) {

		Fila<String> fila = new Fila<>();
		
		fila.enfileira("L");
		fila.enfileira("E");
		fila.enfileira("T");
		fila.enfileira("I");
		fila.enfileira("C");
		fila.enfileira("I");
		fila.enfileira("A");
		
		System.out.println(fila.espiar());
		System.out.println(fila.toString());	
	}

}