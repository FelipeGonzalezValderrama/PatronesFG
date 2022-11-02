package cl.talentoDigital;

import java.util.Scanner;

public class Patrones2 {
	
public static void main(String[] args) {

			System.out.println("Ingrese un numero para presentar Patrones");
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			sc.close();
			System.out.println("\n");
			System.out.println("======================");
			System.out.println("      Patron 1        ");
			System.out.println("======================");

			for (int fila = 1; fila <= n; fila++) {
				for (int columna = 1; columna <= n; columna++) {

					if (fila == 1 || fila == n || columna == 1 || columna == n) {
						System.out.print("*");
					} else {

						System.out.print(" ");

					}

				}
				System.out.println("");
			}
			System.out.println("\n");
			System.out.println("======================");
			System.out.println("      Patron 2        ");
			System.out.println("======================");

			for (int fila = 1; fila <= n; fila++) {
				if (fila == 1 || fila == n) {
					for (int columna = 1; columna <= n; columna++) {
						System.out.print("*");
					}

				} else {
					for (int j = 1; j < n; j++) {
						if (j == n - fila + 1) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
				}
				System.out.println("");
			}
			System.out.println("\n");
			System.out.println("======================");
			System.out.println("       Patron 3       ");
			System.out.println("======================");

			for (int fila = 1; fila <= n; fila++) {
				for (int columna = 1; columna <= n; columna++) {

					if (fila == columna || columna == n - fila + 1) {
						System.out.print("X");
					} else {

						System.out.print(" ");

					}

				}
				System.out.println("");
			}
			System.out.println("\n");
			System.out.println("======================");
			System.out.println("       Patron 4       ");
			System.out.println("======================");

			for (int fila = 1; fila <= n; fila++) {

				for (int columna = 1; columna <= n; columna++) {

					if (columna == fila) {
						System.out.print("*");
					} else if (columna == 1 || columna == n) {

						System.out.print(" ");

					} else {
						System.out.print("*");
					}

				}
				System.out.println("");
			}

		}

	}


