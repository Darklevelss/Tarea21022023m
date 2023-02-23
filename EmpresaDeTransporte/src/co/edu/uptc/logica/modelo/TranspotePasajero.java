package co.edu.uptc.logica.modelo;

import java.util.ArrayList;

public class TranspotePasajero extends Vehiculo {
private ArrayList<Pasajero> Pasajeros;

public ArrayList<Pasajero> getPasajeros() {
	return Pasajeros;
}

public TranspotePasajero() {
	super();
	this.marca="Mercedes Benz";
}

}
