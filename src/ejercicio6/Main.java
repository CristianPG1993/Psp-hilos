package ejercicio6;

public class Main {

    public static void main(String[] args) {
        Thread t1 = new Thread(new MiHIlo());

        t1.start();

        while (t1.isAlive()){
            System.out.println("Hilo activo");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("El hilo ha terminado");
    }
}
