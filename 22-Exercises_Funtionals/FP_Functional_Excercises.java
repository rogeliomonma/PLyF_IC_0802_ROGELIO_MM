import java.util.List;

public class FP_Functional_Excercises {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);
        List<String> cursos = List.of("Spring","Spring Boot","API","Microservices","AWS","Azure","Docker","Kubernetes");
        System.out.println("\n\t[Impresion de numeros impares]");
        NumerosImpares(numbers);
        System.out.println("\n\t[Impresion de cursos individualmente]");
        Impresion_de_cursos(cursos );
        System.out.println("\n\t[Impresion de cursos que contienen la palabra Spring]");
         Impresion_Spring(cursos );
        System.out.println("\n\t[Impresion de cursos  con mas de 4 letras]");
        Impresion_palabra_4(cursos );
        System.out.println("\n\t[Impresion de valor cubico  de numeros impares]");
        Elevacion_al_cubo(numbers);
        System.out.println("\n\t[Impresion de numero de caracteres por palabra]");
        length_palabras(cursos);
    }

    
    private static void NumerosImpares(List<Integer> numeros){
        numeros.stream().filter(number -> number % 2 != 0).forEach(number -> System.out.print("\t"+"["+number+"]"+" "));
        //.stream().filter() Permite realizar un filtro de datos dentro de una lista buscando que no sea numero par con la aplicacion de un
        //modulo de 2 realizamos el rrecorrido de esa lista fon un forEach.
    }

    private static void Impresion_de_cursos(List<String> cursos){
        cursos.stream().forEach(curso -> System.out.println("\t-"+curso));
        //Realizamos la impresion de una lista por medio de un forEach
    }
    
    private static void Impresion_Spring(List<String> cursos){
        cursos.stream().filter(curso -> curso.contains("Spring")).forEach(curso -> System.out.print("\t-"+curso+"\n"));
        //Realizamos la imprecion de las cadenas que contengan la palabra Spring
    }

    private static void Impresion_palabra_4(List<String> cursos){
        cursos.stream().filter(curso -> curso.length() >= 4).forEach(curso -> System.out.print("\t-"+curso+"\n"));
        //Imprimimos la longitud de una cadena cuya longitud de palabras sea mayor a 4.
    }

    private static void Elevacion_al_cubo(List<Integer> numeros){
      
        numeros.stream().filter(number -> number % 2 != 0).map(number -> number *number * number).forEach(number -> System.out.print("\t-"+number+"\n"));
        //Imprimimos el cubo de numeros que sean impares.
    }

    private static void length_palabras(List<String> cursos){
        cursos.stream().forEach(curso -> System.out.print("\t-"+curso+"->"+curso.length()+"\n"));
        //Imprimimos la longitud de las palabras de las cadenas de cursos.
    }
}
