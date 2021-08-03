public class OperadoresCondicionales {
    
    public static void main(String[] args) {
    
    //1er ejemplo
    int     x1 = 1;
    short   y1 = 2;

    boolean w1 = x1 > y1 &  x1  < 10;   //AND
    boolean w2 = x1 > y1 |  x1  < 10;   //OR
    boolean w3 = x1 > y1 ^  x1  < 10;   //XOR

    //2do ejemplo
        //OPERADORES DE CORTOCIRCUITO
    boolean w4 = true   ||  y1  < 4;
    boolean w5 = false  &&  y1  < 4;

    Integer o = new Integer(1);
    if (o != null && o.intValue() == 1){
        //Evalua la seguna expresión solo cuando la primera es true.
    }

    if (o != null & o.intValue() == 1) {
        //Evalua  ambas expresiones sin importar el resultado de la
        //primera expresión
    }
    
    
    //3er ejemplo
     int a = 6;
     boolean y = (a >= 6) || (++a <= 7); //La expresión de la derecha ya no se ejecuta.
 
     System.out.println(a);


    }
    
}

