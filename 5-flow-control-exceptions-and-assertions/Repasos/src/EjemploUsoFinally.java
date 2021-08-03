/*
Si una excepción es lanzada en la cláusula catch los recursos no se cerrarán .
Ahora bien si hemos hecho uso de java finally la situación cambia.
 */
class EjemploUsoFinally {
    public static void main(String[] args) {
        double a =1234567890; //Longitud de 10 digitos
        double b =0;

        try {
            double resultado=a/b;

            System.out.println(resultado);
        } catch (Exception e) {
            // La aplicación falla cacha la excepción y finally se encarga de cerrar los recursos.
            System.out.println("La aplicación fallo");
            throw new NullPointerException();
        }finally {
            System.out.println("Se cierran los recursos");
        }
        System.out.println("La aplicacion ha finalizado");

    }
    }

