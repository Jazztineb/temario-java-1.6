public class Coche extends Vehiculo {

    private boolean itv;
    private int     cilindros;

    protected Coche(String marca, int peso, String color, int asientos, int numAsientos, boolean b, int velocidad) {
        super(marca, peso, color, numAsientos, velocidad);
        this.itv =      itv;
        this.cilindros = cilindros;
    }
    public boolean isItv() {
        return itv;
    }

    public void setItv(boolean itv) {
        this.itv = itv;
    }

    public int getCilindros() {
        return cilindros;
    }

    public void setCilindros(int cilindros) {
        this.cilindros = cilindros;
    }

    @Override
    protected void acelerar() {
        setVelocidad(getVelocidad() + 100);
    }

    public void verDetalles(){
        System.out.println("Coche: \n marca:" + getMarca()
                + " peso: " + getPeso()
                + " color : " + getColor()
                + " numAsientos: " + getNumAsientos()
                + " velocidad: " + getVelocidad()
                + " itv: " + isItv()
                + " cilindros: " + getCilindros());
    }
}
