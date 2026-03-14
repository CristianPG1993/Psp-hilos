package ejercicio2;

public class Main {

    public static void main(String[] args) {
        Reloj reloj1 = new Reloj("Reloj 1");
        Reloj reloj2 = new Reloj("Reloj 2");

        Thread t1 = new Thread(reloj1, "Reloj 1");
        Thread t2 = new Thread(reloj2, "Reloj 2");

        t1.start();
        t2.start();
    }
}
