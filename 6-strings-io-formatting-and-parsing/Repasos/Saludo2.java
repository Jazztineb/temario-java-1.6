/*
    CLASE STRING
        java.lang.String
 */
class Saludo2 {
    /*
    Si no se reasigna la referencia no estamos apuntando a una nueva cadena.
    Las cadenas que se crean se quedan sin referencia alguna.
     */
    public static void main(String[] args) {
        String saludo = "Hola";
        saludo.concat("Maria");
        saludo.toUpperCase();
        System.out.println(saludo);
    }
}
