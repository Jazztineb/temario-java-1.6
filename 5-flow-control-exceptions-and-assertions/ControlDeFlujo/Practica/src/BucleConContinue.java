public class BucleConContinue {
    /*
    Ciclo for anidado con continue.
        Hace que pasemos a la siguiente iteración del bucle mas interno.
     */
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 3) {
                    continue;
                }
                else {
                    System.out.println("iteracion [i,j]: " + i + ", " + j);
                }
            }
        }
    }
}
