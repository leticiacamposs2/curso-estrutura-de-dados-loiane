package com.leticia.estruturadados.pilha.exercicios;

import com.leticia.estruturadados.pilha.Pilha;

/*
 * Escreve um programa que testa se uma sequ�ncia de caracteres
 * fornecida pelo usu�rio � um pal�ndromo, ou seja, � uma palavra
 * cuja primeira metade � sim�trica � segunda metade.
 * Veja alguns exemplos:
 * 
 * - AABCCBAA - sim
 * - ADDFDDA - sim
 * - ABFFBB - n�o
 */
public class Exer05 {

	public static void main(String[] args) {
		imprimeResultado("ADA");
		imprimeResultado("LETICIA");
		imprimeResultado("ABCCBA");
		imprimeResultado("DENISE");
	}
	
	public static void imprimeResultado(String palavra) {
		System.out.println(palavra + "� palindromo? " + testaPalindromo(palavra));
	}
	
	public static boolean testaPalindromo(String palavra) {
		
		Pilha<Character> pilha = new Pilha<Character>();
		
		for (int i=0; i<palavra.length(); i++) {
			
			pilha.empilha(palavra.charAt(i));
			
		}
		
		String palavraInversa = "";
		
		while (!pilha.estaVazia()) {
			
			palavraInversa += pilha.desempilha();
		}
		
		if (palavraInversa.equalsIgnoreCase(palavra)) {
			return true;
		}
		
		return false;
	}

}
