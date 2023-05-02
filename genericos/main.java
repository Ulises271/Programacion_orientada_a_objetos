package genericos;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        Caja<String> miCaja = new Caja<>(new String[10]);

        miCaja.add(0, "hola");
        miCaja.add(1, "adios");
        miCaja.add(2, "hi");
        System.out.println(miCaja);
        String temp = miCaja.get(0);
        System.out.println("_-------");
        CajaSinGenericos CajaSin = new CajaSinGenericos(new Object[10]);
        CajaSin.add(0, "Hola");
        CajaSin.add(1, "Adios");
        CajaSin.add(2, "Hii");
        System.out.println(CajaSin);
        String temp2 = (String) CajaSin.get(0);
        System.out.println("_----------");
        System.out.println("comida");
        Caja<Comida> cajaComida = new Caja<>(new Comida[10]);
        cajaComida.add(0, new Comida("Yogurth", true));
        System.out.println(cajaComida.get(0));
        ArrayList<Comida> comidas = new ArrayList<>();
        comidas.add(new Comida("zanahoria", false));
        comidas.add(new Comida("zanahoria", false));
        comidas.add(new Comida("zanahoria", false));
        comidas.add(new Comida("zanahoria", false));
        comidas.add(new Comida("zanahoria", false));
        comidas.add(new Comida("zanahoria", false));
        comidas.add(new Comida("zanahoria", false));
        comidas.add(new Comida("zanahoria", false));
        comidas.add(new Comida("zanahoria", false));
        comidas.add(new Comida("zanahoria", false));
        comidas.add(new Comida("zanahoria", false));
        comidas.add(new Comida("zanahoria", false));
        comidas.add(new Comida("zanahoria", false));
        comidas.add(new Comida("manzana", false));
        System.out.println(comidas.size());

        System.out.println(comidas.get(13));

        System.out.println("--------");

        ArrayList<Comida> comidas2 = new ArrayList<>();

        comidas2.add(new Comida("zanahoria", false));
        comidas2.add(new Comida("yogurth", true));
        comidas2.add(new Comida("manzana", false));
        comidas2.add(new Comida("Danonino", true));
        comidas2.add(new Comida("Bisteck", false));

        System.out.println(comidas2.get(2));

        comidas2.set(3, new Comida("fresa", false));
        comidas2.add(3, new Comida("naranja", false));

        for (Comida comida : comidas2) {
            System.out.println(comida);

        }

    }
}
