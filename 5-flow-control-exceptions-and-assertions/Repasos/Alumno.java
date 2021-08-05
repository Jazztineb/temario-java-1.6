public class Alumno {
    public Alumno(String s, int i, int i1) {

    }

    public static void main(String[] args) {
        try {
            Alumno a = new Alumno("Ana", 12,6);
            System.out.println(a);
            a.reverse();

            Alumno c = new Alumno();
            System.out.println(c);
            a.reverse();
        }
        catch (Exception e){
            System.out.println("Capturamos la excepción.");
        }
        finally {
            System.out.println("Siempre se ejecuta se produzca o no la excepción.");
        }
    }

    private void reverse() {
    }
}
