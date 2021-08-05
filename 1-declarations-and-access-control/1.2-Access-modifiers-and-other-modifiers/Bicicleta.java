public class Bicicleta extends Vehiculo{

    protected Bicicleta(String marca, int peso, String color, int numAsientos, int velocidad) {
        super(marca, peso, color, numAsientos, velocidad);
    }

    @Override
    protected void acelerar() {
        setVelocidad(getVelocidad() + 10);
    }

    public void verDetalles(){
        System.out.println("Bicicleta: \n marca:" + getMarca()
                + " peso: " + getPeso()
                + " color : " + getColor()
                + " numAsientos: " + getNumAsientos()
                + " velocidad: " + getVelocidad());
    }
}
