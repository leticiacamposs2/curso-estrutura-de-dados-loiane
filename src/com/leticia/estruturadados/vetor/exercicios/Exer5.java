package com.leticia.estruturadados.vetor.exercicios;

import com.leticia.estruturadados.vetor.Lista;

/*
 * Melhore a classe Lista e implemente o m�todo limpar, 
 * onde todos os elementos da lista s�o removidos. 
 * Esse m�todo � semelhante ao m�todo clear da classe ArrayList.
 */
public class Exer5 {

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
		
		lista.limpar();

		System.out.println(lista);
	}

}
