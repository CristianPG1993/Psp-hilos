package ejercicio1;

public class Main {
    public static void main(String[] args) {

        MiHilo tarea = new MiHilo();

        Thread hilo1 = new Thread(tarea, "Hilo - a");
        Thread hilo2 = new Thread(tarea, "Hilo - b");
        Thread hilo3 = new Thread(tarea, "Hilo - c");
        Thread hilo4 = new Thread(tarea, "Hilo - d");
        Thread hilo5 = new Thread(tarea, "Hilo - e");


        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
        hilo5.start();
    }
}
