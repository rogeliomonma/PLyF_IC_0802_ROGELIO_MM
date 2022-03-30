public class Persona{
	//Atributos
	public String nombre;
	public String apellidos;
	public int edad;
	public char genero;
   
   Persona(){
    nombre="";
	apellidos="";
	edad=0;
	genero=0; 
   }
   
    public Persona(String nombre, String apellidos, int edad, char genero) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.genero = genero;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }
   
  @Override
    public String toString(){
        String resultado="";
        resultado+="nombre:"+nombre+"\t";
        resultado+="apellidos:"+apellidos+"\t";
        resultado+="edad:"+edad+"\t";
        resultado+="genero:"+genero+"\t";
        return resultado;
    }
}

