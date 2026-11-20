package Ejer1_Hilos;



public class HiloA extends Thread {

    private String letra = "A";

    public HiloA(String letra) {
        this.letra = letra;
    }
    
    public void run() {
        for (int i = 0; i < 500; i++) {
            System.out.print(letra + "");
        }
    }
}
