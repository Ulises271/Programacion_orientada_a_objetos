package Excepciones;

import java.io.IOException;

public class maindos {

    public static void main(String[] args) {
        System.out.println("Hello world");
        LeerArchivo2 lectura = new LeerArchivo2();
        try {

            lectura.metodouno("datosdos.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
