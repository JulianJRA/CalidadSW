package com.juliancalidadsw.proyectocomunidad;



import java.util.Calendar;


public class Propietario extends Vecino {

	private static final double IMPUESTO_PROPIETARIO = 0.1;
	private static final double IMPUESTO_PROPIETARIO2 = 0.15;
	private static final double PRECIO_BASE_PROPIETARIO = 500;
	private static final int ANYOS_PROPIETARIO = 15;
	
	private int anyo;

	public Propietario(String nombre, String nif, String piso, int anyo) {

		super(nombre, nif, piso);

		this.anyo = anyo;

	}

	public int getAnyo() {
		return anyo;
	}

	public double calcularImpuesto() {

		double recargo;
		double impuesto;

		if ((Calendar.getInstance().get(Calendar.YEAR) - anyo) > ANYOS_PROPIETARIO) {

			recargo = IMPUESTO_PROPIETARIO2;

		} else {

			recargo = IMPUESTO_PROPIETARIO;
		}

		impuesto = PRECIO_BASE_PROPIETARIO + (recargo * PRECIO_BASE_PROPIETARIO);

		return impuesto;

	}
	
	
	@Override
	public String toString() {

		String cadena = "";

		cadena = cadena + " "+nombre+" " + piso+" " + nif+" " + nPeticiones+" " + anyo;

		

		return cadena;

	}

	

}
