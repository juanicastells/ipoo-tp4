import java.util.ArrayList;

public class DataBag {
    private ArrayList <Object> objetos;

    public DataBag (){
        objetos = new ArrayList <Object> (4);
    }

    public void add (Object objeto) throws FullDataBagException{
        if (objetos.size() == 4){
            throw new FullDataBagException();
        }else{
            objetos.add (objeto);
        }
    }

    public void remove () throws EmptyDataBagException{
        if (objetos.size() == 0){
            throw new EmptyDataBagException();
        }else {
            objetos.remove(0);
        }
    }
}
