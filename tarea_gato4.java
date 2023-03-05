import java.util.Scanner;

public class tarea_gato4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(
                "ingrese los caracteres desados, recuerde que solo se admiten los siguientes caracteres [X,O, _ ] dejando un espacio entre cada uno ");
        System.out.println("ingrese solamente 9 caracteres ");
        String caracteres = s.nextLine();
        String Letras = caracteres.toUpperCase();

        if (Letras.length() != 9) {
            System.out.println("la cadena debeb tener 9 caracters ");
        }
        for (int i = 0; i < 9; i++) {
            char simbolos = Letras.charAt(i);
            if (simbolos != 'X' && simbolos != 'O' && simbolos != '_') {
                System.out.println("el programa solo acepta los siguientes simbolos: 'x, o _' ");
                return;

            }

        }
        String[] apartados = Letras.split("");
        String val1 = apartados[0];
        String val2 = apartados[1];
        String val3 = apartados[2];
        String val4 = apartados[3];
        String val5 = apartados[4];
        String val6 = apartados[5];
        String val7 = apartados[6];
        String val8 = apartados[7];
        String val9 = apartados[8];

        System.out.println("- - -");
        System.out.println("|" + val1 + val2 + val3 + "|");
        System.out.println("|" + val4 + val5 + val6 + "|");
        System.out.println("|" + val7 + val8 + val9 + "|");
        System.out.println("- - - ");

    }

}
