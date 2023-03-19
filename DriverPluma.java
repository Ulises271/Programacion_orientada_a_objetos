import java.awt.Color;

import javax.swing.text.AttributeSet.ColorAttribute;

public class DriverPluma {
    public static void main(String[] args) {
        pluma plum = new pluma();
        pluma plum1 = new pluma("Bic", "Bm", "Fina", Color.black);

        System.out.println(plum);

        System.out.println(plum1);
        plum1.escribir();
    }

}