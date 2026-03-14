package ejercicio6;

public class MiHIlo implements Runnable{


    @Override
    public void run() {
        for (int i = 1; i<=5; i++ ){
            System.out.println("Contador: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
