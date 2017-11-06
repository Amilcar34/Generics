package com.utn.modelo;

public class Nodo<T> {
	
	private T dato;
	private T nodoAnt;
	private T nodoSig;
	
	public T nodoSig(){
		return nodoSig;
	}
	
	public T nodoAnt(){
		return nodoAnt;
	}

	public T getDato() {
		return dato;
	}

	public void setDato(T dato) {
		this.dato = dato;
	}

	public void setNodoAnt(T nodoAnt) {
		this.nodoAnt = nodoAnt;
	}

	public void setNodoSig(T nodoSig) {
		this.nodoSig = nodoSig;
	}
}
