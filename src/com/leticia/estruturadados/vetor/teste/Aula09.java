package com.leticia.estruturadados.vetor.teste;

import com.leticia.estruturadados.vetor.Vetor;

public class Aula09 {

	public static void main(String[] args) {
		
		Vetor vetor = new Vetor(3);
		
		vetor.adiciona("B");
		vetor.adiciona("G");
		vetor.adiciona("D");
		vetor.adiciona("E");
		vetor.adiciona("F");

		System.out.println(vetor);
		
		vetor.remove(1);
		
		System.out.println(vetor);
		
		System.out.println("Remover o elemento E");
		
		int pos = vetor.busca("E");
		if (pos > -1) {
			vetor.remove(pos);
		} else {
			System.out.println("Elemento n�o existe no vetor");
		}
		
		System.out.println(vetor);
	}

}
