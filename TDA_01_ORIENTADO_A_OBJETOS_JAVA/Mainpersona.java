/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author rogel
 */
class Mainpersona {

    /**
     * @param args the command line arguments
     */
    
	//MAIN
	public static void main(String [] args){
        
   String []nombres={"ROGELIO","TATIANA","EMANUEL","PEDRO","JUAN"};
   String []apellidos={"MM","CH","LP","GJ","LP"};
   int []edades={21,21,21,21,21};
   char []generos={'M','F','M','M','M'};
   Persona[] personas=new  Persona[5];
     crear(personas);
     crearlista(personas);
     
     llenarlista(personas,nombres,apellidos,edades,generos);
     System.out.println("Personas->\n"+crearlista(personas));
     System.out.println("Personas->\n"+comer(personas));
     

     //correr(personas,nombres);
     //domir(personas,nombres);
             
	}
        public static String crearlista(Persona[] arreglo){
            String resultado="";
            for(Persona persona:arreglo)
                resultado += persona.toString()+"\n";
            return resultado;
        }
        public static void crear(Persona[] personas){
            for(int i=0;i<personas.length;i++){
               personas[i]=new Persona();
            }
        }
        public static void llenarlista(Persona[] arreglo,String[] nombres,String[] apellidos, int[]edades,char[] generos){
            int i=0;
            for(Persona elemento:arreglo){
                elemento.setNombre(nombres[i]);
                elemento.setApellidos(apellidos[i]);
                elemento.setEdad(edades[i]);
                elemento.setGenero(generos[i]);
            }
        }

        public static String comer(Persona[] arreglo){
            String resultado="";
            for(Persona persona:arreglo)
                resultado += persona.toString()+"";
            return resultado;
        }
        
}
