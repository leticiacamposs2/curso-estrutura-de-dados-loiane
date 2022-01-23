package com.leticia.estruturadados.pilha.exercicios;

import com.leticia.estruturadados.pilha.Pilha;

/*
 * Escreva um programa para verificar se uma express�o 
 * matem�tica tem os parenteses agrupados de forma correta,
 * isto �:
 * 
 * (1) se o n�mero de par�ntese � esquerda e � direita s�o iguais e:
 * (2) se todo par�nteses aberto � seguido posteriormente por um fechamento
 * fechamento de par�ntese. 
 *
 * Veja alguns exemplos:
 *- As express�es ((A+B) ou A+B (violam a condi��o 1
 *- As express�es ) A+B(-C OU(A+B))-(C+D violam a condi��o 2
 *- A express�o ((A+B)+D) est� ok 
 */
public class Exer06 {

	public static void main(String[] args) {

		imprimeResultado("A + B");
		imprimeResultado("A + B + [D + C]");
		imprimeResultado("A + B )");
		imprimeResultado("{[()]}[](){()}");


	}
	
	public static void imprimeResultado(String expressao) {
		System.out.println(expressao + " est� balanceado? " + 
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
