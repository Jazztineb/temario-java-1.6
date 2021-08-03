/*
Sobrecarga boxing y argumentos variables
Cuando el compilador tiene que elegir entre hacer boxing y un método con argumentos variables, se queda con el boxing.
 */

class SobrecargaBoxingVarArgs {
    public static void main(String[] args) {
        int intVar = 10;
        System.out.println("\nmetodo (intVar)\u003B");
        metodo(intVar);
    }
    static void metodo (Integer v){
        System.out.println("-> Boxing a Integer y ejecuta método (Integer v) \n");
    }

    static void metodo (int ... v){
        System.out.println("-> Ejecuta metodo (int ... v) \n");
    }
}
