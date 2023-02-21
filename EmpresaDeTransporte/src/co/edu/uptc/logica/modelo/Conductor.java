package co.edu.uptc.logica.modelo;

public class Conductor extends Persona {
private  String NroLicencia;

public String getNroLicencia() {
	return NroLicencia;
}

public Conductor() {
	super();
}

public void setNroLicencia(String nroLicencia) {
	NroLicencia = nroLicencia;
}

}
