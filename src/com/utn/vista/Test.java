package com.utn.vista;

import com.utn.modelo.*;

public class Test {

	public static void main(String[] args) {

		Nodo<Ciudad> nodo1 = new Nodo<Ciudad>();

		nodo1.setNodoAnt(new Ciudad("Argentina"));
		nodo1.setDato(new Ciudad("Buenos Aires"));
		nodo1.setNodoSig(new Ciudad("CABA"));

		System.out.println(nodo1.nodoAnt().getTipo());
		System.out.println(nodo1.getDato().getTipo());
		System.out.println(nodo1.nodoSig().getTipo());

		System.out.println();
		
		Nodo<Mamiferos> nodo2 = new Nodo<Mamiferos>();
		nodo2.setNodoAnt(new Mamiferos("Mamiferos"));
		nodo2.setDato(new Mamiferos("Terrestres"));
		nodo2.setNodoSig(new Mamiferos("Carnivoros"));

		System.out.println(nodo2.nodoAnt().getTipo());
		System.out.println(nodo2.getDato().getTipo());
		System.out.println(nodo2.nodoSig().getTipo());

	}

}