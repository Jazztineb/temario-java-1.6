import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
/*
    Ejemplo de como recorrer un hash.
        No existe concepto de primero, segundo, tercero (Unordered).
        Elementos se colocan en un orden basado en hashCode de la key.
        No hay regla de como ordenar (Unsorted).
 */

class EjemploHashTable {
    public static void main(String[] args) {
        Hashtable h = new Hashtable();
        h.put("1", "Hugo");
        h.put("2", "Paco");
        h.put("3", "Luis");

        Set keySet = h.keySet();
        Iterator i = keySet.iterator();
        String key = null;
        while (i.hasNext()==true && (key = (String) i.next())!=null){
            System.out.println(h.get(key));
        }
    }
}
