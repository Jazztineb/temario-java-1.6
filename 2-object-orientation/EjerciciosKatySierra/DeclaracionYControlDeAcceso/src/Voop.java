class Voop {
    public static void main(String[] args) {
        doStuff(1);
        doStuff(2);
    }

    private static void doStuff(int i) {
    }

    /* Respuesta de cual podria compilar.
        En los métodos varArgs, el argumento variable siempre debe de ir al final.
     */
    //A
    static void doStuff(int...doArgs){

    }

    //B
    static void doStuff(int x, int ... doArgs){

    }

}
