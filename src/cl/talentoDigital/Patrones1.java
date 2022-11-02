package cl.talentoDigital;

import java.util.Scanner;

public class Patrones1 {

	public static void main(String[] args) {
	
				Scanner scan = new Scanner(System.in);

				System.out.println("Ingrese un numero para presentar Patrones");
				int numero = scan.nextInt();

				// PATRON 1
				System.out.println("======================");
				System.out.println("       Patron 1       ");
				System.out.println("======================");


				for (int i = 0; i < numero; i++) {

					if (i % 2 == 0) {
						System.out.print("*");
					} else {
						System.out.print(".");

					}
				}
				System.out.println("\n");

				// PATRON 2
				System.out.println("======================");
				System.out.println("       Patron 2       ");
				System.out.println("======================");


				for (int i = 1; i <= numero; i++) {
					if (numero < 5) {
						System.out.print(i);
					} else {

						if (i % 4 == 0) {
							System.out.print("4");
						} else {

							System.out.print(i % 4);

						}

					}
				}
				System.out.println("\n");

				// PATRON 3
				System.out.println("======================");
				System.out.println("       Patron 3       ");
				System.out.println("======================");

				for (int i = 1; i <= numero; i++) {

					if (i % 3 == 0) {
						System.out.print("*");
					} else {
						System.out.print("|");
					}

				}

				scan.close();

			}

		


}
