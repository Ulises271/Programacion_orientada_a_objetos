public class Drivereditorial {
    public static void main(String[] args) {
        Editorial edi = new Editorial("alfaomega", "mexico", "cdmx");
        System.out.println(edi);
        edi.publicar();
        edi.setPais("España");
        System.out.println(edi);
    }

}
