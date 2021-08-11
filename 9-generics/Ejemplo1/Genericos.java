/*
    Demostración de clase genérica.
 */
class Genericos {

    public static void main(String[] args) {
        //Se crea una referencia Gen para Integers
        Gen<Integer> iOb;

        //Se crea un objeto Gen<Integer> y se asigna referencia a iOb
        //Autoboxing para encapsular el valor 28 dentro de un objeto Integer.
        iOb = new Gen<Integer>(28);

        //Muestra el tipo de dato utilizado por iOb
        iOb.mostrarTipo();

        //Se obtiene el valor en iOb
        //No se necesita conversión


        int v = iOb.getOb();
        System.out.println("Valor: " + v);
        System.out.println();

        //Se crea un objeto Gen para Strings
        Gen<String> strOb = new Gen<String>("Esta es una prueba de genéricos.");

        //Muestra el tipo de dato utilizado por strOb
        strOb.mostrarTipo();

        //Obtener el valor de strOb
        //no se necesita de conversión
        String str=strOb.getOb();
        System.out.println("Valor: " + str);

    }
}
