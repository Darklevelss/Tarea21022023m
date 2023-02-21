package co.edu.uptc.logica.modelo;

public class Persona {
protected String Nombre,Id,Telefono;

public Persona() {
	super();
}

public String getNombre() {
	return Nombre;
}

public void setNombre(String nombre) {
	Nombre = nombre;
}

public String getId() {
	return Id;
}

public void setId(String id) {
	Id = id;
}

public String getTelefono() {
	return Telefono;
}

public void setTelefono(String telefono) {
	Telefono = telefono;
}
}
