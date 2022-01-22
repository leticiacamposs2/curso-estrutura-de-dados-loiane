package com.leticia.estruturadados.pilha.teste;

import java.util.Stack;

import com.leticia.estruturadados.pilha.Pilha;

public class Aula18 {

	public static void main(String[] args) {
		
		Pilha<Integer> pilha = new Pilha<Integer>();
		
		Stack<Integer> stack = new Stack<Integer>();
		
		System.out.print(stack.isEmpty());
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		
		System.out.print(stack.isEmpty());
		System.out.print(stack.size());
		System.out.print(stack);
		System.out.print(stack.peek());
		System.out.print(stack.pop());
		System.out.print(stack);
	}

}
