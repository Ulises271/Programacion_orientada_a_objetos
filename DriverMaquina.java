public class DriverMaquina {
    public static void main(String[] args) {

        MaquinaCafe Maquina = new MaquinaCafe();

        while (Maquina.getVasos() > 0) {

            Maquina.Americano();

            System.out.println();

            Maquina.Expreso();

            System.out.println();

            Maquina.Capuchino();

            System.out.println();
        }

        Maquina.MostrarInventario();

        System.out.println();

        Maquina.TotalCafes();
    }

}
