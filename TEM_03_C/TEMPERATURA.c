#include <stdio.h>
#include <math.h>
int main(){
    
    unsigned char entero,puntodecimal;
    
    int a,b,i,j,residuo,residuo2;
    
    float a1,a2,a3,a4,decimal2;
    printf("Ingresa un numero binario a 8 bits:");
    scanf("%d",&a);
    printf("Ingresa un numero binario a 8 bits:");
    scanf("%d",&b);
    i=0;
    entero=0;
    while(a!=0){
        residuo=a%10;
        a=a/10;
        entero=entero+residuo*(pow(2,i));
        i++;
        
    }
    
    
    j=-4,puntodecimal=0;
      while(b!=0){
        residuo2=b%10;
        b=b/10;
        j++;
         // printf("\nEntero:%d",residuo2);
          if(j==1){
         // printf("\nx:%f",residuo2*0.0625);  
          a1=residuo2*0.0625;
          }
          else if(j==2){
         // printf("\nx:%f",residuo2*0.125);  
          a2=residuo2*0.125;
          }
          else if(j==3){
         // printf("\nx:%f",residuo2*0.25);  
          a3=residuo2*0.25;
          }
          else if(j==4){
         // printf("\nx:%f",residuo2*0.5);  
          a4=residuo2*0.5;
          }
    }
    decimal2=a1+a2+a3+a4;
    printf("\nEntero:%u",entero);
    printf("\nDecimal:%f", decimal2);
    return 0;
}