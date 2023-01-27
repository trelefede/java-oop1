package org.lessons.java.jana60.bank;

import java.util.Random;

public class Conto {

	Random r = new Random();

	int numeroConto;
	String nomeProprietario;
	double saldo;

	public Conto(String nomeProprietario) {
		super();
		this.nomeProprietario = nomeProprietario;
		numeroConto = (r.nextInt(1000)) + 1;
		saldo = 0;
	}

	void versamento(double versato) {
		saldo += versato;
		this.saldo = saldo;
		System.out.println("Operazione riuscita! Nuovo saldo: " + saldo + "€");
	}

	void prelievo(double prelevato) {
		if (saldo >= prelevato) {
			saldo += (-prelevato);
			this.saldo = saldo;
			System.out.println("Operazione riuscita! Nuovo saldo: " + saldo + "€");
		} else {
			System.out.println("Operazione negata! Somma non disponibile.");
		}
	}

	String infoConto() {
		String s = ("Proprietario conto: " + nomeProprietario + "\n" + "Numero conto: " + numeroConto + "\n"
				+ "Saldo conto: " + saldo);
		return s;
	}
}
