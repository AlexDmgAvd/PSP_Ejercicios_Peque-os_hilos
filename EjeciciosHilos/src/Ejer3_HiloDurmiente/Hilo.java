package Ejer3_HiloDurmiente;

public class Hilo extends Thread {

    private int duracion = 2000;

    public Hilo(int duracion){
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
