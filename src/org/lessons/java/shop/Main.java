package org.lessons.java.shop;

public class Main {
	public static void main(String[] args) {

		Prodotto tostaPane = new Prodotto("tostapane", "tosta il pane", 29.9, 22);

		String nome = tostaPane.nomeCompleto();
		String prezzo = tostaPane.prezzoBase();
		String prezzoIvato = tostaPane.prezzoIva();

		System.out.println(nome);
		System.out.println(prezzo);
		System.out.println(prezzoIvato);
	}

}
