package automovil;

public class Automovil {
    private String marca;
    private int anio;
    private String modelo;
    private Llanta[] llanta;
    private Puerta[] puerta;
    private Motor motor;
    
    public Automovil(Llanta[] llanta, Motor motor, Puerta[] puerta, int anio, String marca, String modelo){
        this.motor = motor;
        this.puerta = new Puerta[2];
        this.llanta = new Llanta[4];
        this.marca = marca;
        this.anio = anio;
        this.modelo = modelo;
    }

    public void setLlanta(Llanta[] llanta) {
        this.llanta = llanta;
    }

    public void setPuerta(Puerta[] puerta) {
        this.puerta = puerta;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Llanta[] getLlanta() {
        return llanta;
    }

    public Puerta[] getPuerta() {
        return puerta;
    }

    public Motor getMotor() {
        return motor;
    }
    
    
    public String getMarca() {
        return marca;
    }
    
    public int getAnio() {
        return anio;
    }
    
    public String getModelo() {
        return modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
