package co.edu.uptc.presentacion;

import co.edu.uptc.logica.control.Empresa;
import co.edu.uptc.logica.modelo.Pasajero;

public class RunEmpresaDeTransporte {
public static void main(String[] args) {
	new Empresa().crearObj();

}

    private static void mostrarPasajero(Pasajero pasajero) {
        System.out.println(pasajero.getNombre()+"\n"
                +pasajero.getId()+"\n"
                +pasajero.getTelefono()+"\n"
                +pasajero.getTipo().getNombreTipo()+"\n"
                +pasajero.getTipo().getIdT()+"\n"
                +pasajero.getTipo().getDescuento());
    }

}
