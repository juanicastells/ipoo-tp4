import java.util.ArrayList;

public class ColaDeTrabajo implements Trabajo {

    private ArrayList <Trabajo> trabajos;

    private String nombre;
    private boolean lista;

    public ColaDeTrabajo (String nombre){
        trabajos = new ArrayList<Trabajo>();
        this.nombre = nombre;
        lista = false; //No está lista para retornar trabajos porque está vacía.
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isLista() {
        return lista;
    }

    public void setLista(boolean lista) {
        this.lista = lista;
    }

    public Trabajo sacar () throws SinTrabajoColaException{
        if (trabajos.size() == 0){
            throw new SinTrabajoColaException(this.nombre);
        }else{
            Trabajo trabajo =  trabajos.get(0);
            trabajos.remove(0);
            return trabajo;
        }
    }

    public void agregarTrabajo (Trabajo trabajo) throws NoListaException{
        if (trabajos.size() == 2) {
            throw new NoListaException (this.nombre, 2); //llama al constructor de la execpcion
        }else{
            trabajos.add(trabajo);
            lista = true; //lista para retornar trabajos no para agregar.
        }
    }
}
