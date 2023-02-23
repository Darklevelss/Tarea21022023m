package co.edu.uptc.logica.modelo;

public class Carga extends Vehiculo {
private float NroToneladas;

public Carga() {
	super();
	this.marca="Hyundai";
}

	public float getNroToneladas() {
		return NroToneladas;
	}

	public void setNroToneladas(float nroToneladas) {
		NroToneladas = nroToneladas;
	}
}
