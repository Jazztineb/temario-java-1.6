import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/*
Debido a la sobreescritura del método hashCode, hace que la sobreescritura de equals vea
a t1 y t2 como duplicados
 */

class MapEQ {
    public static void main(String[] args) {
        Map<ToDos, String> m = new HashMap<ToDos, String>();
        ToDos t1 = new ToDos("Monday");
        ToDos t2 = new ToDos("Monday");
        ToDos t3 = new ToDos("Tuesday");
        m.put(t1, "doLaundry");
        m.put(t2, "payBills");
        m.put(t3, "cleanAttic");
        System.out.println(m.size());
    }
}

class ToDos{
    String day;
    ToDos(String d){
        day = d;
    }

    @Override
    public boolean equals(Object o) {
        return ((ToDos)o).day == this.day;
    }


    @Override
    public int hashCode() {
        return 9;
    }
}
