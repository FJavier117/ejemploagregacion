package agregacion;

public class MicroSd {
    private String capacidad;
    private String clase;

    public MicroSd(){
        this.capacidad = "0gb";
        this.clase = "no definido";
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String leerDatos(String dato){
        return dato;
    }

    public String escribirDatos(String dato){
        return  dato;
    }

    public String getClase() {
        return clase;
    }

    public String getCapacidad(){
        return  capacidad;
    }

    @Override
    public String toString(){
        return getCapacidad() + " " + getClase();
    }
}
