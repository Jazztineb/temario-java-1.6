import java.util.TreeSet;
/*
    Ejemplo de navegación en clase TreeSet
 */
class EjemploTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> times = new TreeSet<Integer>();
        times.add(1205); //añado salidas
        times.add(1505);
        times.add(1545);
        times.add(1830);
        times.add(2010);
        times.add(2100);

        //Versión Java 5
        TreeSet<Integer> subset = new TreeSet<Integer>();
        subset = (TreeSet) times.headSet(1600);
        System.out.println("J5 - ultimo antes de las 4pm es: " + subset.last());

        TreeSet<Integer> sub2 = new TreeSet<Integer>();
        sub2 = (TreeSet) times.tailSet(2000);
        System.out.println("J5 - Primero despues de las 8pm es: " + sub2.first());

        //Version Java 6
        System.out.println("J6 - ultimo antes de las 4pm es: " + times.lower(1600));
        System.out.println("J6 - Primero despues de las 8pm es: " + times.higher(2000));
    }
}
