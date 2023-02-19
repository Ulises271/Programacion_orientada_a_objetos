import java.util.Scanner;

public class bases_tarea_2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("introduzca su nombre: ");
        String nombre = teclado.nextLine();
        System.out.print("Introduzca su profesión: ");
        String profesion = teclado.nextLine();
        System.out.print("introduzca su nacionalidad: ");
        String nacionalidad = teclado.nextLine();
        System.out.println("Su nmombre es : " + nombre);
        System.out.println("Su profesión es: " + profesion);
        System.out.println("Su nacionalidad es: " + nacionalidad);

    }

}
