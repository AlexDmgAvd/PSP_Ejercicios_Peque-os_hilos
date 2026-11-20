package Ejer2_HiloConPrioridad;
public class HiloB extends Thread {

    private String letra = "B";

    public HiloB(String letra) {
        this.letra = letra;
    }
    
    public void run() {


        for (int i = 0; i < 500; i++) {
            System.out.print(letra + "-");
        }
    }
    
}
