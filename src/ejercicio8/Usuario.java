package ejercicio8;

public class Usuario implements Runnable{

    private Impresora impresora;
    private String nombre;

    public Usuario(Impresora impresora, String nombre) {
        this.nombre = nombre;
        this.impresora = impresora;
    }

    @Override
    public void run() {

        impresora.imprimir(nombre);

    }
}
