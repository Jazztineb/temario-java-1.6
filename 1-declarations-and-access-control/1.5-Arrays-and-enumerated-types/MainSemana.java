public class MainSemana {
    public static void main(String[] args) {
        Cita citaDentista = new Cita("Revision Dentista a las 18.30.", Cita.Semana.LUNES); //Necesitamos anteponer la clase Cita
        Cita citaMaqueta = new Cita("Quedar para grabar primera canción.", Cita.Semana.JUEVES); //pq si no lo hacemos no encuentra el enum Semana.

        System.out.println(citaDentista);
        System.out.println(citaMaqueta);
    }
}
