import java.util.Random;

public class Numero extends ObjetoJuego{
    private int numero;

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public void mostrate() {
        System.out.println(this.numero);
    }
}
