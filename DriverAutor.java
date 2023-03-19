public class DriverAutor {
    public static void main(String[] args) {
        Autor aut = new Autor();
        Autor aut2 = new Autor("Alexander", "Alex", "Mexico");
        aut2.escribir();
        aut2.promocionar();
        aut2.setNombre("Alejandro");
        aut2.setPais("Canada");
        System.out.println(aut2);
    }

}
