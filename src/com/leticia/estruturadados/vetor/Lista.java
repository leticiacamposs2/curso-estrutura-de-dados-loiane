package com.leticia.estruturadados.vetor;

import java.lang.reflect.Array;

public class Lista<T> {

	private T[] elementos;
	public int tamanho;
	
	public Lista(int capacidade) {
		this.elementos = (T[]) new Object[capacidade]; //solu��o do livro effective java
		this.tamanho = 0;
	}
	
	public Lista(int capacidade, Class<T> tipoClasse) {
		this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade);
		this.tamanho = 0;
	}
		
	public boolean adiciona(T elemento) {
		this.aumentaCapacidade();
		if (this.tamanho < this.elementos.length){
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		} 
		return false;
	}
	
	// 0 1 2 3 4 5 6 = tamanho � 5
	// B C E F G + +
	//
	public boolean adiciona(int posicao, T elemento) {
		posicaoInvalida(posicao);
		this.aumentaCapacidade();
		
		for (int i=this.tamanho-1; i>=posicao; i--) {
			this.elementos[i+1] = this.elementos[i];
		}
		
		this.elementos[posicao] = elemento;
		this.tamanho++;
		
		return false;
	}
	
	private void aumentaCapacidade() {
		if (this.tamanho == this.elementos.length) {
			T[] elementosNovos = (T[]) new Object[this.elementos.length*2];
			for (int i=0; i<this.elementos.length; i++) {
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;
		}
	}
	
	public T busca(int posicao) {
		posicaoInvalida(posicao);
		return this.elementos[posicao];
	}
	
	public int busca(T elemento) {
		for (int i=0; i<this.tamanho; i++) {
			if (this.elementos[i].equals(elemento)) {
				return i;
			}
		}
		return -1;
	}
	
	// B G D E F -> posi��o a ser removida � 1 (G)
	// 0 1 2 3 4 -> tamanho � 5
	// vetor[1] = vetor[2]
	// vetor[2] = vetor[3]
	// vetor[3] = vetor[4]
	public void remove(int posicao) {
		posicaoInvalida(posicao);
		
		for (int i=posicao; i<this.tamanho-1; i++) {
			this.elementos[i] = this.elementos[i+1];
		}
	}
	
	private void posicaoInvalida(int posicao) {
		if (!(posicao >= 0 && posicao < tamanho)) {	
			throw new IllegalArgumentException("Posi��o inv�lida");
		}
	}
	
	
	public int busca(String elemento) {
		for (int i=0; i<this.tamanho; i++) {
			if (this.elementos[i].equals(elemento)) {
				return i;
			}
		}
		return -1;
	}
	
	public int tamanho() {
		return this.tamanho;
	}
		
	@Override
	public String toString() {
		
		StringBuilder s = new StringBuilder();
		s.append("[");
		
		for (int i=0; i<this.tamanho-1; i++){
			s.append(this.elementos[i]);
			s.append(", ");
		}
		
		if (this.tamanho>0){
			s.append(this.elementos[this.tamanho-1]);
		}
		
		s.append("]");
		
		return s.toString();
	}
}
