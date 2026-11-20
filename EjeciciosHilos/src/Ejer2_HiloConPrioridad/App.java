package Ejer2_HiloConPrioridad;
public class App {

    public static void main(String[] args) throws Exception {
        HiloA hiloA = new HiloA("A");
        HiloB hiloB = new HiloB("B");

        hiloA.setPriority(10);
        hiloA.start();
        hiloB.start();
    }
}
