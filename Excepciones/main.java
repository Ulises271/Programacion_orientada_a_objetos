package Excepciones;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("hola mundo");
        Scanner scanner = new Scanner(System.in);
        try {
            int a = 10;
            int b = Integer.parseInt(scanner.nextLine());

            System.out.println("divsion: " + (a / b));
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("no se puede imprimr entre cero");
        } catch (NumberFormatException nfe) {
            System.out.println("dato ingresado no valido ");
        } finally {
            System.out.println("siempre se ejecuta...");
        }
        System.out.println("fin del programa!!!!");
    }

}
