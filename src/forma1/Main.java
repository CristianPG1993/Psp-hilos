package forma1;

public class Main {

    public static void main(String[] args) {

        Mihilo h = new Mihilo();
        Mihilo h2 = new Mihilo();

        // Llamar a start porque crea el hilo de ejecución directamente
        h.start();
        h2.start();

    }
}
