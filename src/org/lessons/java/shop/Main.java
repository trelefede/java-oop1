package org.lessons.java.shop;

public class Main {
	public static void main(String[] args) {

		Prodotto tostaPane = new Prodotto("tostapane", "tosta il pane", 29.9, 22);

		tostaPane.nomeCompleto();
		tostaPane.prezzoBase();
		tostaPane.prezzoIva();
	}
}
