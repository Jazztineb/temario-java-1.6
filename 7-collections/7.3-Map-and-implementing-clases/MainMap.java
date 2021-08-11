import java.util.HashMap;
import java.util.Map;
/*
    Ejemplo de uso de interface Map, incluyendo clase Dog
        Unsorted y unordered.
        En caso de que el key sea un objeto se basa en hashCode e equals para evaluar
        Permite clave nula y múltiples valores nulos en la colección.
 */
class MainMap {
    public static void main(String[] args) {
        Map<Object, Object> m = new HashMap<Object, Object>();
        m.put("k1", new Dog ("Canelita"));
        m.put("k2", Pets.DOG);

        m.put(Pets.CAT, "CAT key");

        Dog d1 = new Dog("Guera");
        m.put(d1, "Dog key");

        m.put(new Cat(), "Cat key");

        System.out.println(m.get("k1"));
        String k2 = "k2";

        System.out.println(m.get(k2));
        Pets p = Pets.CAT;

        System.out.println(m.get(p));
        System.out.println(m.get(d1));
        System.out.println(m.get(new Cat()));
        System.out.println(m.size());

    }

}
