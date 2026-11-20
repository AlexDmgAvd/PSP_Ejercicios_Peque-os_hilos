package Ejer1_Hilos;
public class App {

    public static void main(String[] args) throws Exception {
        HiloA hiloA = new HiloA("A");
        HiloB hiloB = new HiloB("B");

        hiloA.start();
        hiloB.start();
    }
}
