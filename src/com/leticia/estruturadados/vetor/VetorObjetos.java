package com.leticia.estruturadados.vetor;

import java.util.Arrays;

public class VetorObjetos {
	
	private Object[] elementos;
	public int tamanho;
	
	public VetorObjetos(int capacidade) {
		this.elementos = new Object[capacidade];
		this.tamanho = 0;
	}
	
	public boolean adiciona(Object elemento) {
		this.aumentaCapacidade();
		if (this.tamanho < this.elementos.length){
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		} 
		return false;
	}
	
	// 0 1 2 3 4 5 6 = tamanho é 5
	// B C E F G + +
	//
	public boolean adiciona(int posicao, Object elemento) {
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
			Object[] elementosNovos = new String[this.elementos.length*2];
			for (int i=0; i<this.elementos.length; i++) {
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;
		}
	}
	
	public Object busca(int posicao) {
		posicaoInvalida(posicao);
		return this.elementos[posicao];
	}
	
	public int busca(Object elemento) {
		for (int i=0; i<this.tamanho; i++) {
			if (this.elementos[i].equals(elemento)) {
				return i;
			}
		}
		return -1;
	}
	
	// B G D E F -> posição a ser removida é 1 (G)
	// 0 1 2 3 4 -> tamanho é 5
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
			throw new IllegalArgumentException("Posição inválida");
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
