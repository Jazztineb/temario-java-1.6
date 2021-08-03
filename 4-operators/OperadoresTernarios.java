public class OperadoresTernarios {

    public static void main(String[] args) {
        
        int x = 1;
        int y = 1;

        //Ejemplo 1
        // No compilan por que no son el mismo tipo de dato.
        //Int -> String
        //boolean w = x == 1 ? "true" : "false"; 

        //Ejemplo 2
        //Regresan el mismo tipo de dato obligado por su uso en la asignación.
        boolean z = x ==1 ? true : false;

        //Ejemplo 3
        //Regresa distinto tipo de dato
        System.out.println(x==1 ? x++ : "DATO");

        //Ejemplo 4
        //Incremento o decremento
        int i = x == 1 ? y++ : x--;

        //Ejemplo 5
        //Anidaciones de operadores ternarios
        int j1 = (x > 0) ? (x < 10) ? 5 : 8 : -1 ;
        System.out.println("Resultado de operador ternario: " + j1);

        //Ejemplo 6
        //Solo una de las dos expresiones de un operador ternario es ejecutada.
        int h = 0;
        System.out.println(h > 1 ? 1 : "Hola");
        Object animal = h > 1 ? 1 : "Hola";
    }
    
}
