public class Cita {
    enum Semana {LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO}

    ;

    private String tarea;
    private Semana dia;

    public Cita() {
        tarea = "Predeterminada";
        dia = Semana.LUNES;
    }

    public Cita(String tarea, Semana dia) {
        this.tarea = tarea;
        this.dia = dia;
    }

    public String getTarea() {
        return tarea;
    }

    public Semana getDia() {
        return dia;
    }

    public void setTarea(String tarea) {
        this.tarea = tarea;
    }

    public void setDia(Semana dia) {
        this.dia = dia;
    }

    public String toString() {
        return "Cita: \n Tarea: " + getTarea() + " Dia: " + getDia() + "\n";
    }
}
