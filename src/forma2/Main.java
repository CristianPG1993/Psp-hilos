package forma2;

public class Main {

    public static void main(String[] args) {

        Mihilo tarea = new Mihilo();

        Thread hilo = new Thread(tarea);
        Thread hilo2 = new Thread(tarea);
        hilo.start();
        hilo2.start();

    }
}
