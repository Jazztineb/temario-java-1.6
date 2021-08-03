public class PruebaOutOfBounds {
    /*
    Ejemplo no comprobadas / Unchecked.
    Intentar acceder a una posición invalida en un array.
     */
    public static void main(String[] args) {
        int[] notas = new int[5];
        for (int i = 0; i <=5 ; i++) {
            notas[i] = i * 2;
            System.out.println("notas ["+i+"] = "+ notas[i]);
        }
    }
}

