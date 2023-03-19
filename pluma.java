import javax.swing.text.AttributeSet.ColorAttribute;

public class pluma {
    private String marca;
    private String modelo;
    private String punta;
    private ColorAttribute color;

    public pluma() {
    }

    public pluma(String marca, String modelo, String punta, ColorAttribute color) {
        this.marca = marca;
        this.modelo = modelo;
        this.punta = punta;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPunta() {
        return punta;
    }

    public void setPunta(String punta) {
        this.punta = punta;
    }

    public ColorAttribute getColor() {
        return color;
    }

    public void setColor(ColorAttribute color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "pluma [marca=" + marca + ", modelo=" + modelo + ", punta=" + punta + ", color=" + color + "]";
    }

    public void escribir() {
        System.out.println("hola");
    }
}
