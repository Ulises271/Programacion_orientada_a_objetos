public class DriverVehiculo {
    public static void main(String[] args) {
        Camion camion = new Camion("diesel", 3);

        System.out.println(camion);

        System.out.println(camion.encender());
        camion.avanzar();
        System.out.println(camion);
        camion.frenar();
        System.out.println(camion);

        System.out.println(camion.apagar());

        System.out.println("Motocicleta");
        Motocicleta moto = new Motocicleta(150, "bmw");
        System.out.println(moto);
        moto.encender();
        moto.avanzar();
        moto.hacerCaballito();
        moto.frenar();
        moto.apagar();

    }

}
