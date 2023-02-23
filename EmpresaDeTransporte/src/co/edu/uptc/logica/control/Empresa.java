package co.edu.uptc.logica.control;

import co.edu.uptc.logica.modelo.*;

public class Empresa {
    Carga c= new Carga();
    TipoPasajero tipo1=new TipoPasajero(),tipo2=new TipoPasajero();
    TranspotePasajero tP=new TranspotePasajero();
    Conductor conductor=new Conductor();
    Pasajero p=new Pasajero(),h=new Pasajero();
public void crearObj() {
	//añade uno de carga uno de pasajeros con almenos 2 pasajeros y que muestre

    tipo1.setNombreTipo("VIP");
    tipo1.setDescuento(20);
    tipo1.setIdT("1V");
    tipo2.setNombreTipo("COMMON");
    tipo2.setIdT("1C");
    tipo2.setDescuento(10);

    c.setNroToneladas(12f);
    c.setDesc("cosas de carga como arena");
    c.setKmReco(2_000);
    c.setPlaca("123_MOB");
    conductor.setNroLicencia("112312");
    conductor.setNombre("jacinto");
    conductor.setId("1243124");
    conductor.setTelefono("3213134356");
    p.setTipo(tipo1);
    h.setTipo(tipo2);
    p.setId("12312312312");
    h.setId("4262462426");
    p.setNombre("alexa");
    h.setNombre("siri");
    p.setTelefono("12318797");
    h.setTelefono("12637612");
    tP.setDesc("no se lleva gente");
    tP.setKmReco(1233);
    tP.setPlaca("345_KOI");
    tP.getPasajeros().add(p);
    tP.setEncargado(conductor);
    c.setEncargado(conductor);
    tP.getPasajeros().add(h);

}

    public Carga getC() {
        return c;
    }

    public TipoPasajero getTipo1() {
        return tipo1;
    }

    public TipoPasajero getTipo2() {
        return tipo2;
    }

    public TranspotePasajero gettP() {
        return tP;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public Pasajero getP() {
        return p;
    }

    public Pasajero getH() {
        return h;
    }
}
