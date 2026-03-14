package ejercicio8;

public class Main {

    public static void main(String[] args) {

        Impresora impresora = new Impresora();

        Thread t1 = new Thread(new Usuario(impresora, "Usuario 1"));
        Thread t2 = new Thread(new Usuario(impresora, "Usuario 2"));
        Thread t3 = new Thread(new Usuario(impresora, "Usuario 3"));

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

        t3.start();

        try {
            t3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Tarea finalizada!");

    }
}
