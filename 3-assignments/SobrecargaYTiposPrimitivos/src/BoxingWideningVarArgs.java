/*
Combinando Boxing y Widening con VarArgs:
El compilador no tiene problema cuando un método tiene argumentos variables y
haga falta hacer widening o boxing
 */
class BoxingWideningVarArgs {
    public static void main(String[] args) {
        int entero = 10;
        metodo1(entero,entero);
        metodo2(entero,entero);

    }
    static void metodo1(long...v){ //widening
        System.out.println("Método(long...)");
    }
    static void metodo2(Integer...v){//boxing
        System.out.println("Método(Integer)");
    }
}
