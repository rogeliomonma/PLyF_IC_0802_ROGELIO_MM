import time   
def menu_intrucciones():
  condicion=True
  valor=0
  while condicion==True:
    print("00.-NO_CARROS\n01.-CARROS_ESTE\n10.-CARROS_NORTE\n11.-AMBOS_LADOS\n")
    print("Captura el valor de transición\n")
    valor=int(input())
    if (valor==0 or valor==1 or valor==10 or valor==11):
      condicion=True
      return valor
    else:
      print("\t\tValor erroneo\n")
      condicion=False
def rutas():
  condicional=True
  while condicional==True:
    print("\t\t Nodo Inicial->Go_Norte\n")
    valor=int(menu_intrucciones())
    while valor == 0 or valor == 10:
         time.sleep(3)
         print("\t\t\t Go_Norte\n")
         valor=int(menu_intrucciones())
    if (valor == 1 or valor == 11):
      time.sleep(2)
      print("\t\t\t wait_Norte\n")
    valor=int(menu_intrucciones())
    time.sleep(3)
    print("\t\t\t Go_Este\n")
    valor=int(menu_intrucciones())
    while valor == 0 or valor == 1:
      time.sleep(3)
      print("\t\t\t Go_Este\n")
      valor=int(menu_intrucciones())
    if (valor == 10 or valor == 11):
      time.sleep(2)
      print("\t\t\t wait_Este\n")
    valor=int(menu_intrucciones())
    time.sleep(3)
rutas()      
      
    
    
  
      
      
      
      
    
  
  
    
