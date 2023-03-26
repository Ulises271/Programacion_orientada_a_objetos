import java.awt.Color;

import javax.swing.text.AttributeSet.ColorAttribute;

public class DriverPluma {
    public static void main(String[] args) {
        pluma boligrafo = new pluma();
        pluma boligrafo2 = new pluma("bic","xh600","fina", Color.DARK_GRAY);
        System.out.println(boligrafo2);
        System.out.println(boligrafo);
        boligrafo.escribir();
    }

}