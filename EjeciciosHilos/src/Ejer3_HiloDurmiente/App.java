package Ejer3_HiloDurmiente;
public class App {

    public static void main(String[] args) throws Exception {
        Hilo hilo = new Hilo(2000);
        
        hilo.isAlive();

        System.out.println("Esta el hilo despierto? = " + hilo.isAlive());

        hilo.start();

        for (int i = 0; i < 10; i++) {

         System.out.println("Esta el hilo despierto? = " + hilo.isAlive());   

        }
        ;

        hilo.join();

        System.out.println("Esta el hilo despierto? = " + hilo.isAlive());
        
    }
}
