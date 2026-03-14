package ejercicio5;

public class Main {

    public static void main(String[] args) {

        Thread h1 = new Thread(new MiHilo("Descargando"));
        Thread h2 = new Thread(new MiHilo("Procesando"));
        Thread h3 = new Thread(new MiHilo("Guardando"));

        h1.start();
        try {
            h1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        h2.start();
        try {
            h2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        h3.start();
        try {
            h3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Proceso terminado");
    }
}
