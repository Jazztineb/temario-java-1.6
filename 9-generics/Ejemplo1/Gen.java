/*
Clase genérica
    Aquí T es un parámetro de tipo que será reemplazado por un tipo real
    cuando se crea un objecto de tipo Gen
 */

class Gen<T> { //T es el parámetro de tipo genérico

    T ob; //Declara un objeto de tipo T

    Gen(T o){
        ob=o; //Paso al constructor una referencia a un objeto de tipo T
    }

    T getOb(){
        return ob;
    }

    //Muestra el tipo de T
    void mostrarTipo(){
        System.out.println("El tipo de T es: " + ob.getClass().getName());
    }

}
