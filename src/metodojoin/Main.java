package metodojoin;

public class Main {

    public static void main(String[] args) {

        /*
        * Método sleep
        * Método run y start
        * Método join espera a que acabe un hilo
        * Método isAlive si el hilo sigue activo
        * Método currentThreat devuelve el hilo actual
        * Método getName y setName
        * Método setPriority (Thread.NORM_PRIORITY) 3 valores 1 5 10 de preferencia
        * Método yield() el hilo cede el procesador a otro hilo
        * Método interrupt() se usa junto con sleep()
        *  */
        MiHilo mihilo1 = new MiHilo("Hilo 1");
        MiHilo mihilo2 = new MiHilo("Hilo 2");

        Thread t1 = new Thread(mihilo1);
        Thread t2 = new Thread(mihilo2);


        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t2.start();

        try {
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Fin del programa");

    }
}
