import java.awt.Color;

public class DriverPerro {
    public static void main(String[] args) {
        Perro perro1 = new Perro("Chihuahua", "Mini", Color.black);
        System.out.println(perro1);
        perro1.dormir();
        System.out.println("El perro durmio " + perro1.dormir() + " minutos");

    }

}
