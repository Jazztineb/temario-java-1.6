public class BucleBreakLabeled {
    /*
    Break etiquetado
        Funcionamiento normal de break seria salir del bucle mas interno (while).
        Sin embargo, el break etiquetado hace que rompa el bucle etiquetado.
     */
    public static void main(String[] args) {
        boolean esVerdadero = true;
        externo: //Etiqueta
        for (int i = 0; i < 5; i++) {
            while (esVerdadero){
                System.out.println("Hola!");
                break externo; //Break con etiqueta. Hace que rompa la sentencia de la etiqueta (for).
            }
            System.out.println("Despues del while!");
        }
        System.out.println("Despues del for!");
    }
}
