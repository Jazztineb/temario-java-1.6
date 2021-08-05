class Fork {
    /*
    No se esta usando el operador de corto circuito, ambos operandos son evaluados.
    Dado que args[1] se ha pasado de los limites del arreglo de argumentos, se arroja
    un ArrayIndexOutOfBoundsException
     */
    public static void main(String[] args) {
        if (args.length == 1 | args[1].equals("test")){
            System.out.println("test case");
        }else{
            System.out.println("production" + args[1]);
        }
    }
}
