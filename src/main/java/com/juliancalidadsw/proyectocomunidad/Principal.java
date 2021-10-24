package com.juliancalidadsw.proyectocomunidad;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	static Scanner teclado = new Scanner(System.in);
	static final String  NOEXISTE = " no existe";
	static final String  ELVECINO = "El vecino con dni";
	static final String  INTRODUCE = "Introduce un DNI";

	public static void main(String[] args) {

		EmpresaMantenimiento empresa = new EmpresaMantenimiento("Ascensores Don Quijote S.A.", "C/ Camilo Jos� Cela",
				120.0);

		Comunidad c1 = new Comunidad(6, "C/ Juan Ram�n Jim�nez", "Torres Blancas");

		FileManager.leerVecinos(
				"Vecinos.txt",
				c1);

		menu(c1, empresa);

	}

	public static void menu(Comunidad c1, EmpresaMantenimiento empresa) {
		boolean error = true;
		while (error) {
			try {
				int opcion = 0;
				boolean condicion = true;
				System.out.println("Bienvenidos a la aplicaci�n de gesti�n de comunidad");

				do {
					System.out.println(
							"�Qu� desea hacer? \n 1-->Mostrar la informaci�n de los vecinos\n 2-->Realizar una petici�n de mejora"
									+ "\n 3-->Consultar el n�mero de peticiones realizadas por un inquilino/propietario\n 4-->Mostrar informaci�n de peticiones urgentes realizadas por un vecino determinado"
									+ "\n 5-->Consultar la suma de impuestos anuales recaudados por la comunidad\n 6-->Consultar los impuestos que tiene que pagar un vecino determinado"
									+ "\n 7-->Consultar lo que tiene que pagar anualmente la comunidad por el mantenimiento con la empresa contratada\n 8-->Salir del programa");
					opcion = teclado.nextInt();
					switch (opcion) {
					case 1:

						mostrarInformacion(c1);
						// Mostrar la informaci�n de los vecinos
						break;
					case 2:

						realizarPeticion(c1);

						// Realizar una petici�n de mejora
						break;
					case 3:

						peticionesVecino(c1);
						// Consultar el n�mero de peticiones realizadas por un inquilino/propietario
						break;
					case 4:

						peticionesUrgentes(c1);

						// Mostrar informaci�n de peticiones urgentes realizadas por un vecino
						// determinado
						break;
					case 5:

						impuestoComunidad(c1);
						// Consultar la suma de impuestos anuales recaudados por la comunidad
						break;
					case 6:

						impuestoVecino(c1);
						// Consultar los impuestos que tiene que pagar un vecino determinado
						break;
					case 7:
						impuestoMantenimiento(c1, empresa);
						// Consultar lo que tiene que pagar anualmente la comunidad por el mantenimiento
						// con la empresa contratada
						break;
					case 8:
						System.out.println("Gracias por usar nuestro programa");
						condicion = false;
						System.exit(0);
						break;
					default:
						System.out.println("Lo que ha introducido no es correcto");

					}

				} while (condicion);

			} catch (InputMismatchException e) {
				System.out.println("Ha usado un caracter no v�lido");
				System.out.println("Introduzca de nuevo el dato requerido");
			}

			teclado.nextLine();
		}
	}

	public static void mostrarInformacion(Comunidad c) {
		System.out.println(c.toString());
	}

	public static void realizarPeticion(Comunidad c) {
		System.out.println("Introduce el dni");

		String nif = teclado.next();

		System.out.println(nif);

		if (c.existeVecino(nif)) {

			if (c.posiblePeticion(nif)) {
				int x = c.posicionVecino(nif);
				System.out.println("Introduce una descripci�n de la petici�n");
				teclado.nextLine();
				String descripcion = teclado.nextLine();
				System.out.println("Introduce el grado de urgencia de la petici�n (0-2), donde 0 es no urgente, 1 urgente y 2 muy urgente");
				int urgencia=teclado.nextInt();
				if (urgencia<=2&&urgencia>=0) {
				c.addPeticion(descripcion, urgencia, x);
				}else {System.out.println("Ha introducido un n�mero err�neo, introduzca de 0 a 2 "); 
				}
				
				}else {
			
				System.out.println("Ya ha realizado el m�ximo de peticiones (10 peticiones)");
			}
			
		}else if(!c.existeVecino(nif)){
			System.out.println("El vecino con dni "+nif+ NOEXISTE);
	}
	}

	public static void peticionesVecino(Comunidad c) {
		System.out.println(INTRODUCE);
		String nif = teclado.next();
		if(c.existeVecino(nif)) {
		int x = c.numeroPeticiones(nif);
		System.out.println("El vecino con DNI " + nif + " ha realizado " + x + " peticiones de mejora");
		}else if(!c.existeVecino(nif)){
			System.out.println(ELVECINO+nif+NOEXISTE);
	}
	}

	public static void peticionesUrgentes(Comunidad c) {
		System.out.println(INTRODUCE);
		String nif = teclado.next();
		if (c.existeVecino(nif)) {
			int a = c.posicionVecino(nif);
			System.out.println(c.mostrarUrgentes(a));
		}else if(!c.existeVecino(nif)){
			System.out.println(ELVECINO+nif+NOEXISTE);
	}
	}

	public static void impuestoComunidad(Comunidad c) {
		double impuestoAnual = c.calcularImpuestoAnual();
		System.out.println("El impuesto anual es: " + impuestoAnual + " �");
	}

	public static void impuestoVecino(Comunidad c) {
		System.out.println(INTRODUCE);
		String nif = teclado.next();

		if (c.existeVecino(nif)) {
			int z = c.posicionVecino(nif);
			System.out.println(
					"El impuesto del vecino con DNI " + nif + " son " + c.calcularImpuestoVecino(z) + " � al mes");
		}else if(!c.existeVecino(nif)){
			System.out.println(ELVECINO+nif+NOEXISTE);
	}

	}

	public static void impuestoMantenimiento(Comunidad c, EmpresaMantenimiento empresa) {
		System.out.println("El coste de mantenimiento anual es " + c.calcularCosteMantenimiento(empresa, c) + " �");
	}

}