package composicion;

public class Bateria {
    private String capacidad;
    private String modelo;

    public void setCapacidad(String capacidad){
        this.capacidad = capacidad;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public String getModelo() {
        return modelo;
    }

    public String cargar(){
        return "Bateria en proceso de carga";
    }
}
