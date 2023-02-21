package co.edu.uptc.logica.modelo;

public class Pasajero extends Persona {
 private TipoPasajero Tipo;

public Pasajero() {
	super();
}

public TipoPasajero getTipo() {
	return Tipo;
}

public void setTipo(TipoPasajero tipo) {
	Tipo = tipo;
}
 
}
