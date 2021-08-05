/*
Vamos a definir la clase abstracta Vehículo, que tendrá como atributos:
la marca, el peso, el color, el número de asientos y la velocidad.
Definimos un método abstracto acelerar, que incrementará la velocidad inicial del
vehículo dependiendo de cada clase hija. También definimos un método verDetalles para
escribir los valores del objeto.
 */
public abstract class Vehiculo {

    private String  marca;
    private String  color;
    private int     peso;
    private int     numAsientos;
    private int     velocidad;

    //Constructor protected donde solo se llamaran sus clases
    protected Vehiculo(String marca, int peso, String color, int numAsientos, int velocidad){
        this.marca = marca;
        this.peso = peso;
        this.color = color;
        this.numAsientos = numAsientos;
        this.velocidad = velocidad;
    }

    protected int getPeso()
    {
        return peso;
    }

    protected void setPeso(int peso)
    {
        this.peso = peso;
    }
    protected String getColor() {
        return color;
    }

    protected void setColor(String color) {
        this.color = color;
    }

    protected int getNumAsientos() {
        return numAsientos;
    }

    protected void setNumAsientos(int numAsientos) {
        this.numAsientos = numAsientos;
    }

    protected String getMarca() {
        return marca;
    }

    protected void setMarca(String marca) {
        this.marca = marca;
    }

    protected int getVelocidad() {
        return velocidad;
    }

    protected void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    protected abstract void acelerar(); //método abstracto que se implementará en subclases

    protected void verDetalles(){ //método redefinido en clases coche y bicicleta
        System.out.println("Vehiculo: \n marca:" + getMarca()
                + " peso: " + getPeso()
                + " color : " + getColor()
                + " numAsientos: " + getNumAsientos()
                + " velocidad: " + getVelocidad());
    }
}
