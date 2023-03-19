import java.awt.Color;

public class Perro {
    private String raza;
    private String tamaño;
    private Color color;

    public Perro() {
    }

    public Perro(String raza, String tamaño, Color color) {
        this.raza = raza;
        this.tamaño = tamaño;
        this.color = color;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "raza='" + raza + '\'' +
                ", tamaño='" + tamaño + '\'' +
                ", color=" + color +
                '}';
    }

    public void ladrar() {
        System.out.println("El perro esta ladrando");
    }

    public int dormir() {
        int min = (int) Math.ceil(Math.random() * 60);
        return min;
    }

    public void comer() {
        System.out.println("El perro esta comiendo");
    }

}
