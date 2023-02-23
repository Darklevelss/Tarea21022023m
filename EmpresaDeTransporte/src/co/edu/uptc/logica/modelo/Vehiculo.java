package co.edu.uptc.logica.modelo;

public abstract class Vehiculo {
protected String Placa, Desc, marca;
protected float KmReco;
protected Conductor Encargado;
protected abstract float calcularPeaje(int i); 
	public Conductor getEncargado() {
		return Encargado;
	}

	public void setEncargado(Conductor encargado) {
		Encargado = encargado;
	}

	public Vehiculo() {
	
}
public String getPlaca() {
	return Placa;
}
public void setPlaca(String placa) {
	Placa = placa;
}
public String getDesc() {
	return Desc;
}
public void setDesc(String desc) {
	Desc = desc;
}
public String getMarca() {
	return marca;
}
public void setMarca(String marca) {
	this.marca = marca;
}
public float getKmReco() {
	return KmReco;
}
public void setKmReco(float kmReco) {
	KmReco = kmReco;
}

}
