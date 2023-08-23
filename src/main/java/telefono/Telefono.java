package telefono;

import agregacion.MicroSd;
import agregacion.Sim;
import composicion.Bateria;

import java.util.Arrays;

public class Telefono {
    private String marca;
    private String sistemaOperativo;
    private Bateria bateria; //Composición
    private int numeroDeSim;
    private Sim [] sims; //Agregación
    private MicroSd microSd; //Agregación

    public Telefono(String marca, String sistemaOperativo, String capacidadBateria,String modeloBateria){
        this.marca = marca;
        this.sistemaOperativo = sistemaOperativo;
        //Composición
        this.bateria = new Bateria();
        this.bateria.setCapacidad(capacidadBateria);
        this.bateria.setModelo(modeloBateria);
        this.numeroDeSim = 0;
        //Agregación
        this.sims = new Sim[2];
        this.microSd = new MicroSd();
    }

    public String insertarSim(Sim sim1){
        if(numeroDeSim < 2){
            sims[numeroDeSim] = sim1;
            numeroDeSim++;
        }
        return "Sim insertada en el telefono" + sims[0] + " "+ sims[1];
    }

    public String insertMicroSd(MicroSd microSd){
        this.microSd = microSd;
        return "Micro sd insertada";
    }


    @Override
    public String toString() {
        return "Telefono{" +
                "marca='" + marca + '\'' +
                ", sistemaOperativo='" + sistemaOperativo + '\'' +
                ", bateria=" + bateria +
                ", numeroDeSim=" + numeroDeSim +
                ", sims=" + Arrays.toString(sims) +
                ", microSd=" + microSd +
                '}';
    }
}
