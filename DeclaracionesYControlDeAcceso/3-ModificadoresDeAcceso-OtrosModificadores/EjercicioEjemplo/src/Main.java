public class Main {
    public static void main(String[] args) {
        Coche c = new Coche("Toyota", 2000, "Blanco", 4, 0, true, 4);
        c.verDetalles();
        c.acelerar();
        c.verDetalles();

        Bicicleta b = new Bicicleta("Orbea", 3, "Azul", 1, 0);
        b.verDetalles();
        b.acelerar();
        b.verDetalles();
    }
}
