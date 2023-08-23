package agregacion;

public class Sim {
    private String operadora;
    private String version;

    public Sim(String operadora, String version){
        this.operadora = operadora;
        this.version = version;
    }

    public void setOperadora(String operadora) {
        this.operadora = operadora;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String activarSim(){
        return "Sim activa";
    }

    public String activarPlanDeDatos(){
        return "Plan de datos activo";
    }


    @Override
    public String toString(){
        return operadora +" "+ version;
    }

}
