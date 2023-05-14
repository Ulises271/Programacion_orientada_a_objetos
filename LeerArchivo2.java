package ico.fes.actividadesExtras.Excepciones;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeerArchivo2 {
    public void leer(String ruta){
        try {
            BufferedReader reader = new BufferedReader(new FileReader(ruta));
            String line = "";
            while((line = reader.readLine()) != null){
                System.out.println(line);

            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
