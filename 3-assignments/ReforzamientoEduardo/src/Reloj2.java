import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Timer;

public class Reloj2 {

    //Clase dentro de un método.
    public void enMarcha(int intervalo, final boolean sonido){
        class DameLaHora2 implements ActionListener{
            public void actionPerformed(ActionEvent evento){
                Date ahora = new Date();
                System.out.println("Te imprimo la hora cada tres segundos desde la clase dentro de un método: " + ahora);
                if (sonido == true){
                    Toolkit.getDefaultToolkit().beep();
                }
            }
        }
        class DameUnMensaje {
            String mensaje = "Este es mi mensaje.";
        }

        ActionListener oyente = new DameLaHora2();
        DameUnMensaje dm = new DameUnMensaje();
        System.out.println(dm.mensaje);

        Timer mitemporizador = new Timer(intervalo, oyente);
        mitemporizador.start();
    }
}
