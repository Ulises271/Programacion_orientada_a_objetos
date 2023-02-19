public class Tarea_1 {
    public static void main(String[] args) {
        // length()

        String s = "Hola";
        int x = s.length();
        System.out.println(x);

        System.out.println("___________");
        // isEmpty()

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
        // equals()

        System.out.println("___________");
        String z = "Hola";
        String y = "Hola";
        if (z.equals(y)) {
            System.out.println("SI pasa por aqui!");
        }

        System.out.println("___________");
        // index

        String S = "Hola, como estas?";
        int p1 = S.indexOf('a');
        int p2 = S.lastIndexOf('a');
        System.out.println(p1);
        System.out.println(p2);

        String O = "Hola, como estas? Estas como querias?";
        int p3 = O.indexOf("como");
        int p4 = O.indexOf("estas");
        int p5 = O.lastIndexOf("como");
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);

        System.out.println("___________");
        // upperCase

        String P = "Hola, como estas";
        String may = P.toUpperCase();
        String min = P.toLowerCase();
        System.out.println(P);
        System.out.println(may);
        System.out.println(min);

        System.out.println("___________");
        // subString

        String A = "Hola, como estas?";
        String A1 = A.substring(0, 4);
        String A2 = A.substring(6, 10);
        String A3 = A.substring(11);
        System.out.println(A);
        System.out.println(A1);
        System.out.println(A2);
        System.out.println(A3);

        System.out.println("___________");
        // Integer
        // eneteros

        String B1 = "1234";
        int i = Integer.parseInt(B1);
        String t1 = Integer.toString(i);
        System.out.println(i);
        System.out.println(t1);

        System.out.println("___________");
        // flotantes

        String B2 = "1234.56";
        double d = Double.parseDouble(B2);
        String t2 = Double.toString(d);
        System.out.println(d);
        System.out.println(t2);

        System.out.println("___________");

        String e = "Hola,  ";
        String f = "que tal?";
        String g = s + f;
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);

        System.out.println("___________");

        String h = "hola";
        h = "chau";
        System.out.println(h);

        String j = "Hola";
        j += ", chau";
        System.out.println(j);

        System.out.println("___________");

        StringBuilder sb = new StringBuilder();
        sb.append("Hola, ");
        sb.append("Chau");
        System.out.println(sb);

        System.out.println("___________");
        StringBuilder ab = new StringBuilder("hola");
        ab.setCharAt(2, 'X');
        System.out.println(ab);

        System.out.println("___________");

        StringBuilder v = new StringBuilder("");
        v.append("Fes Aragon ");
        v.append("#1");
        System.out.println(v);

        StringBuilder W = new StringBuilder("Fes aragon #2 ");
        W.setCharAt(12, '1');
        System.out.println(W);

    }

}
