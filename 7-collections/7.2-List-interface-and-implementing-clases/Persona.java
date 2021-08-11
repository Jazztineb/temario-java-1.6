import java.util.ArrayList;
import java.util.Collections;

/*
    El siguiente código ordena una colección de Personas usando la interface Comparable
 */
class Persona implements Comparable{
    private String nombre;
    private String dni;

    public Persona(String dni, String nombre){
        this.nombre =   nombre;
        this.dni    =      dni;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getDni(){
        return dni;
    }

    public void setDni(String dni){
        this.dni = dni;
    }
    /*
    Retorna:
    Collections siempre ordena de mayor a menor.
        Número negativo si el objeto(this) es menor.
        Cero si los objetos son iguales.
        Número positivo si el objeto(this) es mayor.
     */
    @Override
    public int compareTo(Object o) {
        return this.dni.compareTo(((Persona)o).getDni());
    }

    public static void main(String[] args) {
        Persona p1 = new Persona("41236452", "Hugo");
        Persona p2 = new Persona("41236454", "Raúl");
        Persona p3 = new Persona("41236453", "Justine");
        Persona p4 = new Persona("41236451", "Angel");

        ArrayList<Persona> list = new ArrayList<Persona>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);

        System.out.println("Lista sin ordenar:");
        for (Persona persona: list) {
            System.out.println(persona.getDni() + ", ");
            System.out.println(persona.getNombre());
        }

        System.out.println("Lista ordenada:");
        Collections.sort(list);
        for (Persona persona: list) {
            System.out.println(persona.getDni() + ", ");
            System.out.println(persona.getNombre());
        }
    }
}


