public class MaquinaCafe {
    private int agua;

    private int cafe;

    private int crema;

    private int vasos;

    private int Americanos;

    private int Expresos;

    private int Capuchinos;

    public MaquinaCafe() {
        this.agua = 5000;
        this.vasos = 20;
        this.cafe = 1000;
        this.crema = 1500;
        this.Americanos = 0;
        this.Expresos = 0;
        this.Capuchinos = 0;
    }

    public MaquinaCafe(int agua, int cafe, int crema, int vasos, int americanos, int expresos, int capuchinos) {
        this.agua = agua;
        this.cafe = cafe;
        this.crema = crema;
        this.vasos = vasos;
        Americanos = americanos;
        Expresos = expresos;
        Capuchinos = capuchinos;
    }

    public int getAgua() {
        return agua;
    }

    public void setAgua(int agua) {
        this.agua = agua;
    }

    public int getCafe() {
        return cafe;
    }

    public void setCafe(int cafe) {
        this.cafe = cafe;
    }

    public int getCrema() {
        return crema;
    }

    public void setCrema(int crema) {
        this.crema = crema;
    }

    public int getVasos() {
        return vasos;
    }

    public void setVasos(int vasos) {
        this.vasos = vasos;
    }

    public int getAmericanos() {
        return Americanos;
    }

    public void setAmericanos(int americanos) {
        Americanos = americanos;
    }

    public int getExpresos() {
        return Expresos;
    }

    public void setExpresos(int expresos) {
        Expresos = expresos;
    }

    public int getCapuchinos() {
        return Capuchinos;
    }

    public void setCapuchinos(int capuchinos) {
        Capuchinos = capuchinos;
    }

    @Override
    public String toString() {
        return "MaquinaCafe [agua=" + agua + ", cafe=" + cafe + ", crema=" + crema + ", vasos=" + vasos
                + ", Americanos=" + Americanos + ", Expresos=" + Expresos + ", Capuchinos=" + Capuchinos + "]";
    }

    public void Americano() {
        if (this.agua >= 180 && this.cafe >= 15 && this.vasos >= 1) {
            this.agua -= 180;
            this.agua -= 15;
            this.vasos--;
            Americanos++;
            System.out.println("Americano listo");
        } else {
            System.out.println("recursos insuficientes para preparar un café Americano ");
        }
    }

    public void Expreso() {
        if (this.agua >= 120 && this.cafe >= 20 && this.vasos >= 1) {
            this.agua -= 120;
            this.cafe -= 20;
            this.vasos--;
            Expresos++;
            System.out.println("Expresso listo");
        } else {
            System.out.println("recursos insuficientes para preparar un café Expresso");
        }
    }

    public void Capuchino() {
        if (this.agua >= 100 && this.cafe >= 14 && this.crema >= 70 && this.vasos >= 1) {
            this.agua -= 100;
            this.cafe -= 14;
            this.crema -= 70;
            this.vasos--;
            Capuchinos++;
            System.out.println("Capuchino listo ");
        } else {
            System.out.println("recursos insuficientes para preparar un café Capucchino");
        }
    }

    public void MostrarInventario() {
        System.out.println("Quedan " + this.agua + " ml de agua");
        System.out.println("Quedan " + this.cafe + " g de cafe");
        System.out.println("Quedan " + this.crema + " ml de crema");
        System.out.println("Quedan " + this.vasos + " vasos");
    }

    public void TotalCafes() {
        System.out.println("En total se sirvieron: ");
        System.out.println(Americanos + " Americanos");
        System.out.println(Expresos + " Expresos ");
        System.out.println(Capuchinos + " Capuchinos");
    }
}
