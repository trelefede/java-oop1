package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {

	Random r = new Random();

	int codice;
	String nome;
	String descrizione;
	double prezzo;
	double iva;

	public Prodotto(String nome, String descrizione, double prezzo, double iva) {
		super();
		codice = r.nextInt(1000);
		this.nome = nome;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
		this.iva = iva;
	}

	void prezzoBase() {
		System.out.println("Prezzo prodotto: " + prezzo + "€");
	}

	void prezzoIva() {
		double prezzoIvato = ((prezzo * iva) / 100) + prezzo;
		System.out.println("Prezzo Ivato: " + prezzoIvato + "€");
	}

	void nomeCompleto() {
		String nc = codice + "-" + nome;
		System.out.println("Nome prodotto completo: " + nc);
	}
}
