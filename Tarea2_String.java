import java.util.Scanner;

public class Tarea2_String {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("introduzca su nombre, su profesion y su nacionalidad por favor:  ");

        String sc = s.nextLine();
        String[] apartados = sc.split(" ");

        String nombre = apartados[0].toUpperCase();
        String profesion = apartados[1].toUpperCase();
        String nacionalidad = apartados[2].toUpperCase();

        System.out.println("Nombre: " + nombre);
        System.out.println("Profesión: " + profesion);
        System.out.println("Nacionalidad: " + nacionalidad);
    }

}
