import java.util.Scanner;
import java.util.SortedMap;

//Se declara fuera de la clase, conjunto de valores que represente colección de elementos.
enum Colores{
    Rojo, verde, azul;
}

class EjemploSwitch2 {
    public static void main(String[] args) {
        System.out.println("Ejercicio de ejemplo");
        float numero1 = 0, numero2 = 0, resultado;
        int opcion = 0;
        do {
            System.out.println("1. Nivel basico");
            System.out.println("2. Nivel medio");
            System.out.println("3. Nivel avanzado");
            System.out.println("0. Salir");

            Scanner sn = new Scanner(System.in);
            opcion = sn.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Nivel basico.");
                    Colores r = Colores.Rojo;
                    System.out.println(r);
                    break;
                case 2:
                    System.out.println("Nivel medio.");
                    Colores v = Colores.verde;
                    System.out.println(v);
                    break;
                case 3:
                    System.out.println("Nivel avanzado.");
                    Colores a = Colores.azul;
                    System.out.println(a);

                    Scanner read = new Scanner(System.in);
                    System.out.println("Introduzca el primer valor flotante");
                    numero1 = read.nextFloat();
                    System.out.println("Introduzca el segundo valor flotante");
                    numero2 = read.nextFloat();

                    //División
                    resultado = numero1/numero2;
                    if (resultado <= 10){
                        System.out.println("El resultado es menor a diez.");
                    } else {
                        System.out.println("El resultado es mayor a diez.");
                    }
                    break;
                case 0:
                    System.out.println("Gracias por usar nuestro sistema.");
                    break;
                default: //Poner respuesta por default.
                    System.out.println("Nivel no reconocido. Ingrese otra opción.");
            }
        } while (opcion!=0);
    }
}
