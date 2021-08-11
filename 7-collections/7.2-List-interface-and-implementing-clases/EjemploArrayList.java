import java.util.ArrayList;
/*
    Ejemplo de ArrayList
        Mantiene el orden establecido por indices de elementos (ordered).
        Mantiene el orden natural como A,B,C o 1,2,3 (sorted).
 */
class EjemploArrayList {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("Hugo");
        arrayList.add("Paco");
        arrayList.add("Luis");

        for (Object object : arrayList) {
            System.out.println(object.toString());
        }
    }
}
