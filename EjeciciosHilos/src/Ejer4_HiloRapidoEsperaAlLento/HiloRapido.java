package Ejer4_HiloRapidoEsperaAlLento;

public class HiloRapido extends Thread {
    private int duracion = 10000;
    
    public HiloRapido(int duracion, HiloLento hiloLento){
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
