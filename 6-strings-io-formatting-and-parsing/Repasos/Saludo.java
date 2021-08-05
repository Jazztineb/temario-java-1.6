/*
    CLASE STRING
        java.lang.String
 */
class Saludo {
    /*
    Con el siguiente ejemplo, puede parecer que el String saludo cambia, pero en realidad
    la referencia se asigna a una nueva cadena creada.
     */
    public static void main(String[] args) {
        String saludo = "Hola ";
        saludo = saludo + "Rosa";
        System.out.println(saludo);
    }
}
