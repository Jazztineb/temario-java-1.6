public class EjemploSwitch3 {

    /*
    Para cada valor de niveles se ejecutan todos los case y default conforme avanza.
     */
    public static void main(String[] args) {
        int[] niveles = {1, 2, 3, 0};

        System.out.println("\nEjecucion Switch sin Breaks (entra en todos los case cada vez): ");

        for (int i = 0; i < niveles.length; i++) {
            System.out.println("Nivel: " + niveles[i]);
            switch (niveles[i]) {
                case 1:
                    System.out.println("\tNivel Basico.");

                case 2:
                    System.out.println("\tNivel Intermedio.");

                case 3:
                    System.out.println("\tNivel Avanzado.");

                default:
                    System.out.println("\tNivel no informado.");
            }
        }
    }
}