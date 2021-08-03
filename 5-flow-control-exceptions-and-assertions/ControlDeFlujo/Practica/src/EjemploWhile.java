public class EjemploWhile {
    /*
    La variable i vuelve incrementarse en la última comprobación de la condición del
    bucle, cuando esta ya es falsa.
     */
    public static void main(String[] args) {
        int i = -1;
        boolean encontrado = false;
        int[] medidas = {10,30,40,50,70};

        while (++i <5 && !encontrado){
            if (medidas[i] == 40){
                encontrado = true;
            }
        }
        System.out.println(i);
    }
}
