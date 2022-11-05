public class PruebaExcepcion {
    public static void main(String st[]){
        PruebaExcepcion t1 = new PruebaExcepcion();
        t1.metodo(5,0);
    } public void metodo(int a, int b){
        try {
            int c = a/b;
            System.out.println("Después de la división");
        } catch (ArithmeticException ae) {
            System.out.println("Excepción Aritmética");
        } catch (Exception e) {
            System.out.println("Otra Excepción");
        } finally {
            System.out.println("Bloque Finally");
        }
        System.out.println("Después del bloque finally");
    }
}

//el código al dividir por cero trata la excepcion ArithmeticException lanzada por el compilador e imprime
//Excepción Aritmética. Luego:

//La cláusula finally crea un bloque de código que se ejecutará después de que se haya completado el un
// bloque try / catch y antes de que se ejecute el código que sigue a este bloque. El bloque finally se ejecutará
// tanto si se tira la excepción como sino. Esto puede ser útil para cerrar archivos o liberar cualquier recurso
// que se hubiera asignado al principio de un método. Los archivos, las conexiones de bases de datos y las
// conexiones de red que no se cierren apropiadamente podrían no estar disponibles para su uso en otros programas.