public class Main {
    public static void main(String[] args) {
        RandomSelector rs1 = new RandomSelector();
        Color c1 = new Color();
        Numero n1 = new Numero();
        Color c2 = new Color ();
        c1.setColor("ROJO");
        n1.setNumero(25);
        c2.setColor("VERDE");
        Carta car1 = new Carta (12, "ORO");

        rs1.agregarObjeto(c1);
        rs1.agregarObjeto(n1);
        rs1.agregarObjeto(c2);
        rs1.agregarObjeto(car1);

        try{
            rs1.selectNext().mostrate();
        }catch (IndexOutOfBoundsException i){
            System.out.println (i.getMessage());
        }

    }
}
