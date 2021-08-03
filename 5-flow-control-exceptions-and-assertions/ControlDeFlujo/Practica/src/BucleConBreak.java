public class BucleConBreak {

    /*
    Ciclo for anidado con break
        Break hace que se salga completamente del bucle mas interno y prosigue
        son la siguiente iteración del bucle externo.
     */
    public static void main(String[] args) {

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 5; j++) {
                if (j==3){
                    break;
                }
                else {
                    System.out.println("iteracion [i,j]: " + i + ", " + j);
                }
            }
        }
    }
}
