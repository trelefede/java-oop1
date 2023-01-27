package org.lessons.java.jana60.bank;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Crea un nuovo conto. Inserisci Nome e Cognome: ");
		String nomeTitolare = sc.nextLine();

		Conto nuovoConto = new Conto(nomeTitolare);
		String contoInfo = nuovoConto.infoConto();
		System.out.println(contoInfo);

		String operazione;

		do {
			System.out.println("'Preleva' per prelevare, 'Versa' per versare, 'Fine' per terminare");
			operazione = sc.nextLine();

			if (operazione.equalsIgnoreCase("preleva")) {
				System.out.println("Quanto vuoi prelevare? ");
				double prelievo = sc.nextDouble();
				nuovoConto.prelievo(prelievo);
			} else if (operazione.equalsIgnoreCase("versa")) {
				System.out.println("Quanto vuoi versare? ");
				double versamento = sc.nextDouble();
				nuovoConto.versamento(versamento);
			}

		} while (!operazione.equalsIgnoreCase("fine"));

		sc.close();
	}
}
