#include <stdio.h>

typedef struct{
	char nombre[15];
	char apellido[25];
	int  edad;
	char genero;
}Persona;

void DORMIR(Persona persona);
void BEBER(Persona persona);

int main(){
	Persona persona;
	printf(" Ingresa tu nombre:\t");
	fgets(persona.nombre, 15, stdin);
	printf(" Ingresa tu apellido:\t");
	fgets(persona.apellido, 25, stdin);
	printf(" Ingresa tu género:\t");
	scanf("%c",&persona.genero);
	printf(" Ingrese la edad:\t");
	scanf("%d",&persona.edad);
	
	 
    DORMIR(persona);
	fflush(stdin);
	BEBER(persona);
	fflush(stdin);

	
}

void DORMIR(Persona persona){

		printf("%s %s ->duerme en promedio 8 hrs",persona.nombre,persona.apellido);

}

void BEBER(Persona persona){
	printf("\n %s %s ->Bebe 2 lts de agua al dia\n",persona.nombre,persona.apellido);
}


