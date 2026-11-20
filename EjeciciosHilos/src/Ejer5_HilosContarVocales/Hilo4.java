package Ejer5_HilosContarVocales;

public class Hilo4 extends Thread{

    private String grupo = "HiloA";
    private String referenciaVocal = "Vocal A";
    private String texto;
    private char vocal = 'o';

    public static int totalVocales = 0;

    public Hilo4(String grupo, String referenciaVocal, String texto, char vocal) {
        this.grupo = grupo;
        this.referenciaVocal = referenciaVocal;
        this.texto = texto;
        this.vocal = vocal;
    }

    public void run(ContarVocales contarVocales){

        try{
            int contador = contarVocales.getContarVocal();

            for (int i = 0; i < texto.length(); i++) {

                if (texto.charAt(i) == vocal){
                    contador++;
                }
            }


        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }
}
