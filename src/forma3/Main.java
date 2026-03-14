package forma3;

public class Main {

    public static void main(String[] args) {

        Thread hilo = new Thread(() -> {
            System.out.println("hola mundo desde el hilo lambda");
        });

        hilo.start();
    }
}
