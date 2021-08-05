/*
Sobrecarga y tipos primitvos.
    Escogerá el menor tipo que sea mayor que el argumento en la llamada.
 */
class SobreCargaPrimitivos {
    public static void main(String[] args) {
        byte    byteVar     = 10;
        short   shortVar    = 10;
        char    charVar     = 10;
        long    longVar     = 10;
        float   floatVar    = 10.0f;

        System.out.println("\n Método (byteVar) \u003B");
        metodo  (byteVar); //Llama método con argumento byte.

        System.out.println("\n Método (shortvar) \u003B");
        metodo(shortVar); //Llama método con argumento short

        System.out.println("\n Método (charvar) \u003B");
        metodo(charVar); //Llama a método con argumento char

        System.out.println("\nMétodo (longVar) \u003B");
        metodo(longVar); //Llama método con argumento lon

        System.out.println("\nMétodo (longVar) \u003B");
        metodo(floatVar); //Lláma método con argumento float.
    }
    static void  metodo (int v){
        System.out.println("-> Amplia a int y ejecuta método (int v) \n");
    }

    static void metodo(long v){
        System.out.println("-> Amplia a long y ejecuta método (long v) \n");
    }
    static void metodo(double v){
        System.out.println("-> Amplia a double y ejecuta método (double v) \n");
    }
    }

