class OperadpresDeIgualdad {

    public static void main(String[] args) {
        
        int a = 100;
         char b = 'b';
         boolean res = true;
 
         char[] letras1 = {'a','b','c','d'};
         char[] letras2 = {'a','b','c','d'};
 
         if (a == 100L)
         { System.out.println("100 y 100L, Iguales");}
 
         if (res != (b > a))
         { System.out.println("res distinto a (b>;a)");}
 
         if (letras1 == letras2) //Imprime distinto aunque ambos tengan el mismo contenido.
         { System.out.println("Iguales");} //porque cada referencia apunta a un obj distinto.
         else
         { System.out.println("Distintos");}
 
         letras2 = letras1; //hacemos que letras2 apunte a letras1
 
         if (letras1 == letras2) //Imprimirá iguales porque ahora
         { System.out.println("Iguales");} //apuntan al mismo objeto.
         else
         { System.out.println("Distintos");}
    }
}