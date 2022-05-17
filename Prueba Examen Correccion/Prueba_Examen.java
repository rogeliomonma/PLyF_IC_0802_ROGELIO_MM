/*                                   Examen Práctico:
                             PRIMERA PARTE (PruebaExamen.java):
  1.- Crear una Interfaz pública de nombre "PruebaExamen"*/
public interface Prueba_Examen{
//2.- En esta Interfaz crear un método por defecto y público de nombre "mensajeHola" (no retorna nada y no recibe nada).
    default public void mensajeHola(){
//3.- En ese método "mensajeHola" vas a imprimir un mensaje como el siguiente --> "Hola mi nombre es: Rogelio Monroy"       
        System.out.println("Hola mi nombre es: Rogelio Monroy");
    }
//4.- En esta misma Interfaz crear un método por defecto y público de nombre "mensajeHola", 
//recibe como parámetro un String y vamos a imprimir ese String de la siguiente manera ---> La cadena es: " + cadena, (no retorna nada el método).
    default public void mensajeHola(String cadena){
       
        System.out.println(" La cadena es: "+cadena);
    }
//5.- En esta misma Interfaz crear un método público y estático de nombre "operacionPrueba", 
//va a retornar un tipo de dato Entero y va a recibir dos parámetros de tipo Entero.
public static int Operacion_Prueba(int a,int b){
//6.- En este método "operacionPrueba" (del paso 5) retornar la suma de los dos argumentos (2 ENTEROS) recibidos.
        return (a+b);
}
//7.- En esta misma Interfaz "PruebaExamen", crear un método público y abstracto de nombre "operacionPrueba", 
//no va a retornar NADA y va a recibir tres parámetros de tipo Entero.
public void Operacion_Prueba(int a,int b,int c);
}