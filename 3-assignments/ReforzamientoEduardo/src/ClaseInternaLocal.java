import javax.swing.*;

public class ClaseInternaLocal {

    public static void main(String[] args) {
        Reloj2 mireloj = new Reloj2();
        mireloj.enMarcha(3000, true);
        JOptionPane.showMessageDialog(null,"Pulsa aceptar para terminar.");
        System.exit(0);
    }
}
