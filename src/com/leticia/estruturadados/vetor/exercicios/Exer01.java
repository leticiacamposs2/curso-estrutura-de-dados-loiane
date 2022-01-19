package com.leticia.estruturadados.vetor.exercicios;

import com.leticia.estruturadados.vetor.Lista;

/*
 * Melhore a classe Lista e implemente o método contém, 
 * semelhando ao método contains da classe ArrayList.
 */
public class Exer01 {

	public static void main(String[] args) {
		Lista<String> vetor = new Lista<String>(1);
		
		vetor.adiciona("Elemento");
		vetor.adiciona("1");
		
		System.out.println(vetor.contem("Elemento"));
		System.out.println(vetor.contem("x"));
	}
}
