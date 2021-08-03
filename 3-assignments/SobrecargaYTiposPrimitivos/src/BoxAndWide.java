/* Sobrecarga con widening y boxing a la vez
Boxing y luego amplía
El compilador sí puede hacer estas dos conversiones si despúes de hacer Boxing
se puede ampliar porque estén relacionados por herencia. Un Byte es un Object.
 */

class BoxAndWide {
    public static void main(String[] args) {
        byte byteVar = 5;
        System.out.println("\nmetodo (byteVar)\u003B");
    }
    static void metodo(Object v){
        System.out.println("-> Ejecuta método (Object v)\n");
    }
}
