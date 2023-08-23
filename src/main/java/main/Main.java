package main;

import agregacion.MicroSd;
import agregacion.Sim;
import telefono.Telefono;

public class Main {
    public static void main(String [] args){
        //Composición
        Telefono miTelefono = new Telefono("Xiaomi","Android","5000","B100ER");

        Sim telcel = new Sim("Telcel","v1.5");
        Sim movistar = new Sim("Movistar", "v0.2");

        MicroSd microSd = new MicroSd();
        microSd.setCapacidad("128Gb");
        microSd.setClase("10");
        //Agregación
        miTelefono.insertarSim(telcel);
        System.out.println(miTelefono.insertarSim(movistar));
        System.out.println(miTelefono.insertMicroSd(microSd));
    }

}
