package Excepciones;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeerArchivo2 {
    public void leer(String ruta) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader(ruta));
        String line = "";
        while ((line = reader.readLine()) != null) {
            System.out.println("Info" + line);

        }
    }

    public void metodouno(String ruta) throws IOException {
        this.metododos(ruta);
    }

    public void metododos(String ruta) throws IOException {
        this.leer(ruta);

    }
}
