package autoconstructor;

public class MainCarro {
    public static void main(String[] args) {
        Carro c1 = new  Carro(2.5, 150);
        Carro c2 = new Carro();

        System.out.println("La potencia es: "+c1.getPotencia());
        System.out.println("La velocidad es: "+c1.getVelocidad());
        System.out.println("\nLa potencia del carro 2 es: "+c2.getPotencia());
        System.out.println("La velocidad del carro 2 es: "+c2.getVelocidad());
    }
}
