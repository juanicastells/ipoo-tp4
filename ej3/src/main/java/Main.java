public class Main {
    public static void main(String[] args) {
        ColaDeTrabajo ct1 = new ColaDeTrabajo("ct1");
        Presupuesto p1 = new Presupuesto();
        Venta v1 = new Venta();
        ServicioTecnico s1 = new ServicioTecnico();



        //ct1.sacar();

        try {
            ct1.agregarTrabajo(p1);
            ct1.agregarTrabajo(v1);
            ct1.agregarTrabajo(s1);
        }catch (NoListaException e){ //aqui se toma la excepcion que lanzamos en agregarTrabajo
            System.out.println (e.getMessage());
        }

        try {
            ct1.sacar();
            ct1.sacar();
            ct1.sacar();
        }catch (SinTrabajoColaException s){
            System.out.println(s.getMessage());
        }

    }
}
