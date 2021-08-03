class Twisty {
    {index = 1;} //El código usa una inicialización de bloque.
    int index;

    public static void main(String[] args) {
        /*
        Arreglos multidimensionales pueden ser inconsistentes.
         */
        new Twisty().go();
    }
    void go(){
        int [][] dd = {{9,8,7}, {6,5,4}, {3,2,1,0}};
        System.out.println(dd [index++] [index++]); //Ambos operadores de incremento son post-incremento.
    }
}
