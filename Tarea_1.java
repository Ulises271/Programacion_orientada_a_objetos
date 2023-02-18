public class Tarea_1 {
    public static void main(String[] args) {
        String s = "Hola";
        int x = s.length();
        System.out.println(x);

        System.out.println("___________");

        String s1 = "hola";
        boolean b1 = s1.isEmpty();

        String s2 = "";
        boolean b2 = s2.isEmpty();

        System.out.println(b2);
        System.out.println(b1);

        System.out.println("___________");

        String t = "Hola";
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            System.out.println(c);
        }

        System.out.println("___________");
        String z = "Hola";
        String y = "Hola";
        if (z.equals(y)) {
            System.out.println("SI pasa por aqui!");
        }

        System.out.println("___________");

    }

}
