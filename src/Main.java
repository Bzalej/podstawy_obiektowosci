public class Main {
    public static void main(String[] args) {

        Rabbit krolik1=new Rabbit(100,"Jędruś", true);
        krolik1.changeName("Ambroży");
        krolik1.changeSoftness(false);
        krolik1.changeLength(500);
        System.out.println(krolik1.vievname());
        System.out.println(krolik1.vievSoft());
        System.out.println(krolik1.vievLength());
        System.out.println(krolik1.changeLengthUnit(krolik1.vievLength()));
        System.out.println(krolik1.vievLength());

    }
}