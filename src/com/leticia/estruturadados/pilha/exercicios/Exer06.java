package com.leticia.estruturadados.pilha.exercicios;

import com.leticia.estruturadados.pilha.Pilha;

/*
 * Escreva um programa para verificar se uma expressão 
 * matemática tem os parenteses agrupados de forma correta,
 * isto é:
 * 
 * (1) se o número de parêntese à esquerda e à direita são iguais e:
 * (2) se todo parênteses aberto é seguido posteriormente por um fechamento
 * fechamento de parêntese. 
 *
 * Veja alguns exemplos:
 *- As expressões ((A+B) ou A+B (violam a condição 1
 *- As expressões ) A+B(-C OU(A+B))-(C+D violam a condição 2
 *- A expressão ((A+B)+D) está ok 
 */
public class Exer06 {

	public static void main(String[] args) {

		imprimeResultado("A + B");
		imprimeResultado("A + B + [D + C]");
		imprimeResultado("A + B )");
		imprimeResultado("{[()]}[](){()}");


	}
	
	public static void imprimeResultado(String expressao) {
		System.out.println(expressao + " está balanceado? " + 
				verificaSimbolosBalanceados(expressao));
	}
	
	final static String ABRE = "([}";
	final static String FECHA = ")]}";
	
	public static boolean verificaSimbolosBalanceados(String expressao) {
		
		Pilha<Character> pilha = new Pilha<Character>();
		int index = 0;
		char simbolo, topo;
		
		while (index < expressao.length()) {
			
			simbolo = expressao.charAt(index);
			
			if(ABRE.indexOf(simbolo) > -1) {
				
				pilha.empilha(simbolo);
				
			} else if (FECHA.indexOf(simbolo) > -1) {
				
				if (pilha.estaVazia()) {
					
					return false;
					
				} else {
					
					topo = pilha.desempilha();
					
					if (ABRE.indexOf(topo) != FECHA.indexOf(simbolo)) {
						
						return false;
						
					}
					
				}
				
			}
			
			index++;
		}
		
		return true;
	}

}
