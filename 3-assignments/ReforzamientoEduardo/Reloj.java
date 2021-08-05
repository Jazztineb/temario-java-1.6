import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Timer;


class Reloj {

    private int     intervalo;
    private boolean sonido;

    public Reloj(int intervalo, boolean sonido){
        this.intervalo  = intervalo;
        this.sonido     =   sonido;
    }

    public void enMarcha(){
        ActionListener oyente = new DameLaHora();
        Timer mitemporizador = new Timer(intervalo, oyente);
        mitemporizador.start();
    }

   //Clase interna, no esta dentro de un método.
    private class DameLaHora implements ActionListener{

       @Override
       public void actionPerformed(ActionEvent evento) {
           Date hora = new Date();
           System.out.println("Te imprimo la hora cada tres segundos: " + hora);
           if (sonido==true){
               Toolkit.getDefaultToolkit().beep();
           }
       }
   }
    //Clase interna, no esta dentro de un método.
}
