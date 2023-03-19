public class Dado {
    private int valor;

    public Dado() {
    }

    public Dado(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Dado{" +
                "valor=" + valor +
                '}';
    }

    public void tirar() {
        valor = (int) Math.ceil(Math.random() * 6);
    }

}
