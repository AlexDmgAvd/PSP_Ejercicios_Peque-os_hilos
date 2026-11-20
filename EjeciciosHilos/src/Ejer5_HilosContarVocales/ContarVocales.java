package Ejer5_HilosContarVocales;

public class ContarVocales {

    private int contarVocal;

    public ContarVocales(int contarVocal) {
        this.contarVocal = contarVocal;
    }

    public synchronized void incrementarContarVocal(int contarVocal){
        this.contarVocal += contarVocal;
    }

    public synchronized int getContarVocal() {
        return contarVocal;
    }
}
