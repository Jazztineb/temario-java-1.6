/*
    Clase generica con dos parámetros de tipo.
 */
class DosGen<T,V> {
    //Usamos dos parámetros de tipo.
    T ob1;
    V ob2;

    //Pasamos al constructor una referencia a un objeto de tipo T y V
    DosGen(T o1, V o2){
        ob1 = o1;
        ob2 = o2;
    }

    T getOb1(){
        return ob1;
    }

    V getOb2(){
        return ob2;
    }

    //Mostramos el tipo de T y V
    void mostrarTipo(){
        System.out.println("El tipo de T es: " + ob1.getClass().getName());
        System.out.println("El tipo de V es: " + ob2.getClass().getName());
    }
}
