package Ejer4_HiloRapidoEsperaAlLento;
public class App {

     static void main(String[] args) throws Exception {
       HiloLento hiloLento = new HiloLento(10000);
       HiloRapido hiloRapido = new HiloRapido(0, hiloLento);
       
       System.out.println("Estado hiloLento? = " + hiloLento.isAlive());
       System.out.println("Estado hiloRapido? = " + hiloRapido.isAlive());    
       

       hiloRapido.start();
       hiloLento.start();


    }
}
