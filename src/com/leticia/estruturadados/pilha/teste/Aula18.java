package com.leticia.estruturadados.pilha.teste;

import java.util.Stack;

public class Aula18 {

	public static void main(String[] args) {
				
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
