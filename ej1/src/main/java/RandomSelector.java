import java.util.ArrayList;
import java.util.Random;

public class RandomSelector {
    private ArrayList <ObjetoJuego> objetos;
    private Random enteroAleatorio = new Random();

    public RandomSelector(){
        objetos = new ArrayList<ObjetoJuego>();
    }
    public void agregarObjeto (ObjetoJuego objeto){
        objetos.add (objeto);
    }

    public ObjetoJuego selectNext() throws IndexOutOfBoundsException{
        if (objetos.size() == 0){
            throw new IndexOutOfBoundsException();
        }else{
        int random = enteroAleatorio.nextInt(objetos.size());
        return objetos.get(random);
        }
    }

}
