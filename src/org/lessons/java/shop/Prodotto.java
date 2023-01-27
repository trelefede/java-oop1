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

	String prezzoBase() {
		String prezzoProdotto = "Prezzo prodotto: " + prezzo + "€";
		return prezzoProdotto;
	}

	String prezzoIva() {
		double prezzoIvato = ((prezzo * iva) / 100) + prezzo;
		String s = ("Prezzo Ivato: " + prezzoIvato + "€");
		return s;
	}

	String nomeCompleto() {
		String nc = codice + "-" + nome;
		String s = ("Nome prodotto completo: " + nc);
		return s;

	}
}
