public class Carta extends ObjetoJuego{
    private int numero;
    private String palo;

    public Carta (int numero, String palo){
        this.numero = numero;
        this.palo = palo;
    }

    public void mostrate (){
        System.out.println(numero + " de " + palo);
    }
}
