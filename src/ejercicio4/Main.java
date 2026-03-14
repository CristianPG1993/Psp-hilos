package ejercicio4;

public class Main {

    public static void main(String[] args) {


        Descarga descarga1 = new Descarga("Archivo.zip");
        Descarga descarga2 = new Descarga("Videoc.mp4");
        Descarga descarga3 = new Descarga("Chrome.exe");

        Thread h1 = new Thread(descarga1, "Descarga de archivo");
        Thread h2 = new Thread(descarga2, "Descarga de video");
        Thread h3 = new Thread(descarga3, "Descarga de chrome");

        h1.start();
        h2.start();
        h3.start();


    }
}
