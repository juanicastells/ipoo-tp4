public class Main {
    public static void main(String[] args) {
        DataBag db1 = new DataBag();

        try {
            db1.add("Aceite");
            db1.add("Azucar");
            db1.add("Leche");
            db1.add("Sal");
            db1.add("Arroz");
        }catch (FullDataBagException f){
            System.out.println(f.getMessage());
        }

        try {
            db1.remove();
            db1.remove();
            db1.remove();
            db1.remove();
            db1.remove();
        }catch (EmptyDataBagException e){
            System.out.println(e.getMessage());
        }
    }
}
