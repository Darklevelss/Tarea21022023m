package co.edu.uptc.logica.modelo;

public class TipoPasajero {
private String IdT,NombreTipo;
private float Descuento;

public TipoPasajero() {
	super();
}
public String getIdT() {
	return IdT;
}
public void setIdT(String idT) {
	IdT = idT;
}
public String getNombreTipo() {
	return NombreTipo;
}
public void setNombreTipo(String nombreTipo) {
	NombreTipo = nombreTipo;
}
public float getDescuento() {
	return Descuento;
}
public void setDescuento(float descuento) {
	Descuento = descuento;
}

}
