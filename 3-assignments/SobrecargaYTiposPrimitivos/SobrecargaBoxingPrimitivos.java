/*
Si el compilador tiene que elegir entre hacer un boxing (método con parámetro envoltorio)
o un widening (método con un tipo primitivo mayor) elegira el widening.
 */
class SobrecargaBoxingPrimitivos {
    public static void main(String[] args) {
        int intVar = 10;
        System.out.println("\n Método (intVar) \u003B");
        metodo(intVar); //¿a que método llama?
    }
    static void metodo (long V){ //Widening
        System.out.println("-> Amplia a long y ejecuta método (long v) \n");
    }

    static void metodo (Integer v) {//Boxing
        System.out.println("-> Boxing a Integer y ejecuta método (Integer v) \n");
    }
}
