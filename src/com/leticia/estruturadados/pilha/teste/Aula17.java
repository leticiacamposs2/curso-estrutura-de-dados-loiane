package com.leticia.estruturadados.pilha.teste;

import com.leticia.estruturadados.pilha.Pilha;

public class Aula17 {

	public static void main(String[] args) {
		
		Pilha<Integer> pilha = new Pilha<Integer>();
		
		pilha.empilha(1);
		pilha.empilha(2);
		pilha.empilha(3);
		
		System.out.println(pilha);
		
		System.out.println(pilha.desempilha());
		
		System.out.println(pilha);
	}

}
