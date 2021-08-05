public class Batman implements Heroe{

    enum Arma {BATARANG, BATGYRO, MINIBOMBAS};
    private String nombre;
    private Posicion posInicial;
    private Arma armaActual;
    private int salud;

    public Batman(){
        nombre = "Bruce Wayne";
        posInicial = new Posicion();
        armaActual = Arma.BATARANG;
        salud = saludInicial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Posicion getPosInicial() {
        return posInicial;
    }

    public void setPosInicial(Posicion posInicial) {
        this.posInicial = posInicial;
    }

    public Arma getArmaActual() {
        return armaActual;
    }

    public void setArmaActual(Arma armaActual) {
        this.armaActual = armaActual;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    @Override
    public void luchar() {
        System.out.println("PAW!!");
        salud = salud - 1;
        if (salud < 10) {
            correr();
        }
    }

    @Override
    public void correr() {
        System.out.println("Corro");
        posInicial.setX(posInicial.getX() + 50);
        salud = salud - 1;
        if (salud <= 0)
        {
            System.out.println ("Me muerooo!");
        }
    }

    @Override
    public void salvar() {
        System.out.println("Salvando a mi amada");
    }

    @Override
    public void disparar() {
        System.out.println("Lanzando: " + getArmaActual());
    }

    public String toString(){
        return ("Batman: \n Nombre: " + getNombre()
                + " Posicion: " + getPosInicial()
                + "Arma:  "+ getArmaActual()
                + "Salud: " + getSalud() + "\n");
    }
    }


