package com.leticia.estruturadados.vetor.exercicios;

import com.leticia.estruturadados.vetor.Lista;

/*
 * Melhore a classe Lista e implemente o método remove(T elemento), 
 * onde sera possível remover um elemento da lista 
 * passando o mesmo como parâmetro.
 */
public class Exer03 {

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
			
		lista.remove("T");
		
		System.out.println(lista);
	}

}
