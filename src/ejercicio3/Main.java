package ejercicio3;

public class Main {

    public static void main(String[] args) {

        Animal tortuga = new Animal("Tortuga");
        Animal conejo = new Animal("Conejo");
        Animal canguro = new Animal("Canguro");

        Thread h1 = new Thread(tortuga, "Hilo de tortuga");
        Thread h2 = new Thread(conejo, "Hilo de Conejo");
        Thread h3 = new Thread(canguro,"Canguro");

        h1.start();
        h2.start();
        h3.start();

        try {
            h1.join();
            h2.join();
            h3.join();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("La carrera ha terminado");
    }
}
