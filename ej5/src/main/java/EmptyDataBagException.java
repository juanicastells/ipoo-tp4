public class EmptyDataBagException extends Exception{

    public EmptyDataBagException(){}

    @Override
    public String getMessage() {
        return "La Bolsa Está Vacía ...";
    }
}
