package org.generation.italy;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		
		
		
		int limit;
		int velo;
		int tolleranza;
		String retry;

		System.out.println("Insirisci il limite di velocitá: ");
		limit = sc.nextInt();
		sc.nextLine();
		
		
		do {
			System.out.println("Insirisci la velocitá di andatura: ");
			velo = sc.nextInt();
			sc.nextLine();
			if (velo<100) {
				tolleranza = 5;
			}else if(velo>=100) {
				tolleranza = (velo*5)/100;
			}
			int eccesso = velo - tolleranza - limit;
			if (eccesso <= 5) {
				System.out.println("Non é prevista nessuna multa");
			}else if(eccesso > 5 && eccesso < 10) {
				System.out.println("É prevista una sanzione amministrativa compresa tra 42 e 173 euro");
			}else if(eccesso >= 10 && eccesso <= 40) {
				System.out.println("É prevista una sanzione amministrativa compresa tra 173 e "
						+ "694 euro, oltre la perdita di 3 punti della patente");
			}else if(eccesso > 40 && eccesso <= 60) {
				System.out.println("É prevista una sanzione amministrativa compresa tra 543 e "
						+ "2.170 euro, oltre la perdita di 6 punti della patente");
			}else {
				System.out.println("\"É prevista una sanzione amministrativa compresa tra  845 e 3.382 euro,"
						+ " oltre la sospensione della patente di guida da 6 a 12 mesi e la perdita "
						+ "di 10 punti della patente");
			}
			
			System.out.println("Vuoi riprovare mantenendo il limite invariato? Se si scrivi (s) ");
			retry = sc.nextLine();
			
			
		} while (retry.equals("s"));
	}

}
