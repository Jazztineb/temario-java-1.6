public class Main {
   public static void main(String[] args) {
    Persona p1 = new Persona();
    Persona p2 = new Empleado();
    Empleado e1 = new Empleado();
    Tecnico t1 = new Tecnico();
    Boolean b;

    b = p1 instanceof Persona;
    b = p1 instanceof Modales;
    b = p1 instanceof Object;
    b = p1 instanceof Empleado;
    b = p1 instanceof Tecnico;
 
    b = p2 instanceof Persona;
    b = p2 instanceof Empleado;
    b = p2 instanceof Modales;
    b = p2 instanceof Tecnico;
 
    b = e1 instanceof Empleado;
    b = e1 instanceof Modales;
    b = e1 instanceof Persona;
    b = e1 instanceof Tecnico;
 
    b = t1 instanceof Persona;
    b = t1 instanceof Modales;
    b = t1 instanceof Empleado;
    b = t1 instanceof Tecnico;
 
    b = null   instanceof Persona;
    b = e1     instanceof String;
   } 
}
