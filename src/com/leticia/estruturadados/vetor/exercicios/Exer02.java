package com.leticia.estruturadados.vetor.exercicios;

import com.leticia.estruturadados.vetor.Lista;

/*
 * Melhore a classe Lista e implemente o método ultimoIndice, 
 * semelhante ao método lastIndexOf da classe ArrayList.
 */
public class Exer02 {

	public static void main(String[] args) {
		
		Lista<String> lista = new Lista<String>(5);
		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("A");
		
		System.out.println(lista.ultimoIndice("A"));
	}
}
