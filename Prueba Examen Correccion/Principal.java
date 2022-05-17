/*                                          SEGUNDA PARTE (Principal.java):
   1.- Crear una clase pública y de nombre "Principal".*/

public class Principal {
// 2.- Dentro de esta clase "Principal" crear el punto de entrada "main".
    public static void main(String[]args){
// 3.- Crear una instancia de tipo "PruebaExamen" y de nombre "pe", <<pero sin asignar memoria>>.
      Prueba_Examen PE;
//4.- Asignar una Expresión lambda a la instancia "pe", en la cual se imprima la suma de TRES números Enteros. 
// CUIDADO AQUi
      PE = (a, b, c) -> System.out.println(a+ b+ c);
      PE.Operacion_Prueba(5,5,5);
//5.- Invocar "operacionPrueba" e imprimir el resultado de la suma de DOS números Enteros.
      System.out.println(Prueba_Examen.Operacion_Prueba(10,10));
//6.- Invocar "mensajeHola".
      PE.mensajeHola();
//7.- Invocar "mensajeHola" y enviar cualquier String.
      PE.mensajeHola("Hola");
//8.- Asignar una Expresión lambda a la instancia "pe", en la cual se imprima la suma
//    del primer argumento con la multiplicación del segundo argumento por el tercer argumento.
   PE = (a, b, c) -> System.out.println(a+ (b * c));
//PE.Operacion_Prueba(1,2,3);
//9.- Con "pe" invocar a "operacionPrueba", pasando como primer argumento cualquier número Entero, pasando como segundo argumento 
//el resultado obtenido de invocar "operacionPrueba" que recibe dos Enteros (los que tú desees) y pasando como tercer argumento el 
//resultado obtenido de invocar "operacionPrueba" que recibe dos Enteros (los que tú desees).
   PE.Operacion_Prueba(5,Prueba_Examen.Operacion_Prueba(1,1),Prueba_Examen.Operacion_Prueba(2,2));

//12.- Regresando al punto de entrada "MAIN", invocar al método "miMetodo" pasando como argumento a "pe".
   mi_metodo(PE);
//13.- Invocar al método "miMetodo", pasando como argumento una Expresión lambda, en la cual 
//se imprima la suma del primer argumento con la division del segundo argumento entre el tercer argumento.
     PE = (num1, num2, num3) -> System.out.println(num1+ (num2 / num3));
  //   mi_metodo(PE);
//   16.- Regresando al punto de entrada "MAIN", asignar una Expresión lambda a la instancia "pe", en la cual se imprima la suma del 
//   primer argumento con la división del segundo argumento entre el tercer argumento (DEBE IMPRIMIR LOS DECIMALES). 
//   HACER (DECIMALES)
     PE = (num1, num2, num3) -> System.out.println((double)num1+ ((double)num2 / (double)num3));
//17.- Invocar al método "miMetodo" y enviar como primer argumento a "pe", y tres Enteros cualesquiera.
     mi_metodo(PE,5,1,2);
  
 }
//10.- Dentro la clase "Principal" (NO en el punto de Entrada MAIN), crear un método estático y privado de nombre "miMetodo", 
//el cual no retorna NADA y recibe como argumento un Objeto de tipo "PruebaExamen".
 private static void mi_metodo(Prueba_Examen p){
//11.- Dentro del método "miMetodo" (del paso 10), repetir lo mismo que el punto "9", pero con el objeto que se recibe como argumento.
   p.Operacion_Prueba(5,Prueba_Examen .Operacion_Prueba(2,2),Prueba_Examen.Operacion_Prueba(3,3));
 }
 //14.- Dentro la clase "Principal" (NO en el punto de Entrada MAIN), crear un método estático y privado de nombre "miMetodo", 
 //el cual no retorna NADA y recibe como argumento un Objeto de tipo "PruebaExamen", y tres valores de tipo Entero (separados).
 private static void mi_metodo(Prueba_Examen u,int a, int b,int c){
//15.- Dentro del método "miMetodo" (creado en el punto 14), utilizar el objeto recibido para invocar a "operacionPrueba", 
//pasando como primer argumento el primer valor Entero recibido, pasando como segundo argumento el resultado obtenido de invocar
//"operacionPrueba" que recibe dos Enteros (el segundo valor recibido) y  pasando como tercer argumento el resultado obtenido de 
//invocar "operacionPrueba" que recibe dos Enteros (el tercer valor recibido).
   u.Operacion_Prueba(a,Prueba_Examen.Operacion_Prueba(b, b),Prueba_Examen.Operacion_Prueba(c, c));
 }



}


