package com.juliancalidadsw.proyectocomunidad;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LecturaFichero {

	public static void main(String[] args) throws FileNotFoundException {

		leerFichero("D:\\vecinos.txt");

	}

	private static void leerFichero(String fichero) throws FileNotFoundException {

		File vecinos = new File(fichero);
		Scanner scan = new Scanner(vecinos);

		while (scan.hasNext()) {

			char tipo = scan.next().charAt(0);
			String nombre = scan.next();
			String nif = scan.next();
			String piso = scan.next();

			if (tipo == 'p') {

				int anyo = scan.nextInt();

				System.out.println(
						"Tipo: " + tipo + " Nombre: " + nombre + " DNI: " + nif + " Piso: " + piso + " A�o: " + anyo);

			} else {

				double alquiler = Double.parseDouble(scan.next());

				System.out.println("Tipo: " + tipo + " Nombre: " + nombre + " DNI: " + nif + " Piso: " + piso
						+ " Alquiler: " + alquiler);

			}

		}

	}

}
