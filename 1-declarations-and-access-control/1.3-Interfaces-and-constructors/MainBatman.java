public class MainBatman {
    public static void main(String[] args) {
        Batman b = new Batman();
        System.out.println(b.toString());
        b.luchar();
        b.luchar();
        b.correr();
        b.disparar();
        b.setArmaActual(Batman.Arma.MINIBOMBAS);
        b.disparar();
        b.salvar();

        System.out.println("\n" + b.toString());
    }
}
