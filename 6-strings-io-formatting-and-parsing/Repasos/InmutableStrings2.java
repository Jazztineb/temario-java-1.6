/*
String pool
 */
class InmutableStrings2 {
    public static void main(String[] args) {
        /*
        En este caso la referencia de los dos literales de string aun estan
        en la tabla constante (string literal pool), pero cuando se utiliza new, la jvm se
        ve obligada a crear un nuevo String object en tiempo de ejecución, en ves de usar
        la tabla constante.

        En tal caso, aunque las dos referencias de String se refieren a objetos String
        que contienen los mismos datos, "SomeString", no se refieren al mismo objeto
         */
        String one = "SomeString";
        String two = new String("SomeString");

        System.out.println(one.equals(two));    //true
        System.out.println(one==two);           //false
    }
}
