public class Dividir {

    public int dividir (int a, int b){
        try{
            return a/b;
        }catch (Exception ArithmeticException){
            return 0;
        }
    }
}
