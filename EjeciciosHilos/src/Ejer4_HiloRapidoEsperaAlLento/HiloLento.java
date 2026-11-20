package Ejer4_HiloRapidoEsperaAlLento;

public class HiloLento extends Thread {
    private int duracion = 10000;

    public HiloLento(int duracion){
        this.duracion = duracion;
    }

    public void run() {

        try {
            Thread.sleep(duracion);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
