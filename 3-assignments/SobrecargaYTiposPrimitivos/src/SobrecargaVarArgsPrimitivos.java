/*
Sobrecarga de argumentos variables y tipos primitivos.
Si el compilador tiene que elegir entre un método con argumentos variables y un widening (método con un tipo primitivo mayor)
elegirá el widening.
 */

class SobrecargaVarArgsPrimitivos {
    public static void main(String[] args) {
        int intVar = 10;
        System.out.println("\n Método (intVar)\u003B");
        metodo(intVar);
    }
    static void metodo (long v){
        System.out.println("-> Amplia a long y ejecuta método (long v) \n");
    }
    static void metodo (int... v){ //Método con argumentos variables.
        System.out.println("-> Ejecuta método (int v) \n");
    }
}
