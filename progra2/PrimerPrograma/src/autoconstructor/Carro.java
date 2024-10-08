package autoconstructor;

public class Carro {
    private double potencia;
    private double velocidad;

    public Carro(){

    }


    public Carro(double pontencia, double velocidad){
        this.potencia = pontencia;
        this.velocidad = velocidad;
    }

    public void setPotencia(double potencia){
        this.potencia = potencia;
    }
    public void  setVelocidad(double velocidad){
        this.velocidad = velocidad;
    }
    public double getPotencia(){
        return potencia;
    }
    public double getVelocidad() {
        return velocidad;
    }

    public void acelerar(){
        velocidad += potencia;
    }

    public void frenar(){
        velocidad *= 0.5;
    }
}
