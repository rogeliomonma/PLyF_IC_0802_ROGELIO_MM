public interface prueba_examen{
   default public void mensaje_hola(){
        System.out.println("Hola mi nombre es->Rogelio Monroy Maldonado");
    }
    default public void mensaje_hola(String cadena){
        System.out.println("La cadena es ->"+cadena);
    }
    public static int operacion_prueba(int a,int b){
        return (a+b);
    }
    abstract public int operacion_prueba(int a,int b, int c);
}
//Examen practico 3 Evaluación