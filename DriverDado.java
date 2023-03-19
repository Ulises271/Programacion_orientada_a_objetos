public class DriverDado {
    public static void main(String[] args) {
        Dado dad1 = new Dado();
        System.out.println(dad1);
        dad1.tirar();
        System.out.println(dad1);
        dad1.tirar();
        System.out.println("El dado cayo en: " + dad1.getValor());

    }

}
