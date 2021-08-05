import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Regex2 {
    public static void main(String[] args) {
        /*
        El método group () devuelve cadenas vacías hasta que se encuentran dígitos consecutivos, por lo que la unica vez que devuelve
        un valor es cuando devuelve 34 cuando el comparador encuentra dígitos que comienzan en la posición 2.
        El método start () devuelve la posición inicial de la coincidencia anterior porque, de nuevo,
        dijimos encontrar 0 a muchas apariciones.
         */
        Pattern p = Pattern.compile(args[0]);
        Matcher m = p.matcher(args[1]);
        boolean b = false;
        while (b = m.find()){
            System.out.println(m.start() + m.group());
        }
        //command line
        //C:\Users\yus07\accenture\temario-java-1.6\6-strings-io-formatting-and-parsing\EjerciciosSCJP6\src>java Regex2.java "\d*" ab34ef
        // \d busca digitos, el * es cuantificador que busca de 0 a muchos ocurrencias del patrón que lo precede.
    }
}
