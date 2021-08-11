/*
    Demostración de clase genérica de dos tipos.
 */
class Genericos {
    public static void main(String[] args) {

        DosGen<Integer, String> dosGen = new DosGen<Integer, String>(28,"Genericos");

        dosGen.mostrarTipo();

        int v= dosGen.getOb1();
        System.out.println("Valor: " + v);

        String str=dosGen.getOb2();
        System.out.println("Valor: " +str);
    }
}
