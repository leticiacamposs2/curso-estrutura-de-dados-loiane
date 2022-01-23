package com.leticia.estruturadados.fila.teste;

import com.leticia.estruturadados.fila.Fila;

public class Aula22 {

	public static void main(String[] args) {

		Fila<String> fila = new Fila<>();
		
		fila.enfileira("Leticia");
		fila.enfileira("Keila");
		fila.enfileira("Thomas");
		fila.enfileira("Renata");
		
		System.out.println(fila);
		System.out.println(fila.desenfileira());
		System.out.println(fila);
		System.out.println(fila.desenfileira());
		System.out.println(fila);
	}

}
