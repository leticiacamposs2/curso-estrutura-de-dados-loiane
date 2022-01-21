package com.leticia.estruturadados.vetor.exercicios;

import com.leticia.estruturadados.vetor.Lista;

/*
 * Melhore a classe Lista e implemente o método obtem(int posicao), 
 * onde sera possível obter o elemento dado uma posição do vetor. 
 * Esse método é semelhante ao método get(int posicao) da classe ArrayList.
 */
public class Exer04 {

	public static void main(String[] args) {
		
		Lista<String> lista = new Lista<String>(7);
		lista.adiciona("L");
		lista.adiciona("E");
		lista.adiciona("T");
		lista.adiciona("I");
		lista.adiciona("C");
		lista.adiciona("I");
		lista.adiciona("A");
				
		System.out.println(lista);
		System.out.println(lista.obtem(2));
	}

}
