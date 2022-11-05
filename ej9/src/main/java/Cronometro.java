import java.util.concurrent.TimeUnit;

public class Cronometro {

    public long tiempo;

    public Cronometro (){
        tiempo = System.currentTimeMillis();
    }

    public long getTiempo() {
        return tiempo - tiempo;
    }

    public void setTiempo(long tiempo) {
        this.tiempo = tiempo;
    }
}
