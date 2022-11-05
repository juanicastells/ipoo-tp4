public class SinTrabajoColaException extends Exception {
    private String nombre;

    public SinTrabajoColaException (String nom) {
        nombre = nom;
    }
    @Override
    public String getMessage() {
        return "La cola " + nombre + " no tiene trabajos para procesar. ";
    }
}
