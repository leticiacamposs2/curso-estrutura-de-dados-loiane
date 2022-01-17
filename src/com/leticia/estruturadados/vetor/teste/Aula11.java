package com.leticia.estruturadados.vetor.teste;

import com.leticia.estruturadados.vetor.VetorObjetos;

public class Aula11 {

	public static void main(String[] args) {
		
		VetorObjetos vetor = new VetorObjetos(3);
		
		vetor.adiciona(1);
		vetor.adiciona("Elemento do tipo string");
		
		System.out.println(vetor);
	}

}
