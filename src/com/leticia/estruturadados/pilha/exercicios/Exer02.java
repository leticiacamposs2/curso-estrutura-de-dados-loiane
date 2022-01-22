package com.leticia.estruturadados.pilha.exercicios;

import java.util.Scanner;

import com.leticia.estruturadados.pilha.Pilha;

/*
 * Escreva um programa que leia 10 n�meros.
 * Para cada n�mero lido, verifique e codifique de acordo com as regras a seguir:
 * - Se o n�mero for par, empilhe na chamada par;
 * - Se o n�mero for �mpar, empilhe na chamada impar;
 * - Se o n�mero for zero (0), desempilhe um elemento de cada pilha.
 * Caso alguma pilha esteja vazia, mostre uma mensagem de erro na tela.
 * Ao final do programa desempilhe todos os elementos das duas pilhas,
 * imprimindo-os na tela
 */
public class Exer02 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Pilha<Integer> pilhaPar = new Pilha<Integer>();
		Pilha<Integer> pilhaImpar = new Pilha<Integer>();

		Scanner scan = new Scanner(System.in);
		
		for (int i=1; i<=10; i++) {
			
			System.out.println("\nEntre com um n�mero: ");
			
			int num = scan.nextInt();
			
			boolean numZero = num == 0;		
			
			if (numZero) {
				
				if (pilhaPar.estaVazia()) {
					
					System.out.println("\nERRO: Pilha par Vazia!");
					
				} else {
					
					System.out.println("\nDesempilhando um elemento da pilha par " + pilhaPar.desempilha());
				
				}
				
				if (pilhaImpar.estaVazia()) {
					
					System.out.println("\nERRO: Pilha impar Vazia!");
					
				} else {
					
					System.out.println("\nDesempilhando um elemento da pilha impar " + pilhaImpar.desempilha());
				
				}
			
			}
			else if (num % 2 == 0) {
				
				System.out.println("\nEmpilhando o n�mero " + num + " na pilha par");
				pilhaPar.empilha(num);
			
			} else {
				
				System.out.println("\nEmpilhando o n�mero " + num + " na pilha impar");
				pilhaImpar.empilha(num);
				
			}
			
		}
		
		System.out.println("\nPilha par: " + pilhaPar);
		System.out.println("\nPilha impar: " + pilhaImpar);
				
		while (!pilhaPar.estaVazia()) {
			
			System.out.println("\nDesempilhando Pilha par " + pilhaPar.desempilha() + pilhaPar);
		
		}
		
		while (!pilhaImpar.estaVazia()) {
			
			System.out.println("\nDesempilhando Pilha impar " + pilhaImpar.desempilha() + pilhaImpar);

		}

	}

}
