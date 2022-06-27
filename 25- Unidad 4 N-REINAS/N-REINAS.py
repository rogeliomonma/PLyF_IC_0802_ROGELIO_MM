def Reinas(solucion,etapa,n):
    if etapa>=n:        # si la etapa es mayor que n, entonces devolvemos falso
        return False	#solucion.append(0)
    exito = False       # inicializamos exito a False para terminar el proceso
    while True:
        if (solucion[etapa] < n):    # si el valor de la columna para la fila es mayor o igual que n, entonces no seguimos incrementando, con esto evitamos indices fuera del array.
            solucion[etapa] = solucion[etapa] + 1# incrementamos el valor de columna para la reina i-esima de la fila i-esima.
        if (Valido(solucion,etapa)):# si la reina i-esima de la fila i-esima de la columna j en la etapa k no entra en conflicto con otra reina, proseguimos.
            if etapa != n-1:# si aun no hemos acabado todas las etapas, procedemos a la siguiente etapa.
                exito = Reinas(solucion, etapa+1,n)
                if exito==False:# si del valor devuelto de Reinas tenemos falso, ponemos a 0 el valor de la etapa + 1 para asi descartar los nodos fracaso.
                    solucion[etapa+1] = 0
            else:
                print("*"*40)
                print("Casillas de solución N-Reinas")
                print("*"*40)
                print("\n\t",solucion) # si ya hemos acabado, imprimimos la disposicion de las fichas en el tablero y devolvemos True.
                print("\n") 
                print("*"*40)
                for x in range(n):
                    for i in range(n):
                        if solucion[x] == i+1:
                            print("[R]", end=' ')#Imprimimos un R en la posicion n del tablero para indicar a la reina.
                        else:
                            print("[-]", end=' ')#Imprimimos un -en la posicion n del tablero para indicar una posicion vacia.
                    print("\n")
                exito = True
        if (solucion[etapa]==n or exito==True):# si el valor de la columna j de la etapa k es igual a n o exito es igual a True, salimos del bucle y devolvemos exito.
            break
    return exito
def Valido(solucion,etapa):
    # Comprueba si el vector solucion construido hasta la etapa es
    # prometedor, es decir, si la reina se puede situar en la columna de la etapa
    for i in range(etapa):
        if(solucion[i] == solucion[etapa]) or (ValAbs(solucion[i],solucion[etapa])==ValAbs(i,etapa)):
            return False
    return True
def ValAbs(x,y):
    if x>y:
        return x - y
    else:
        return y - x
###############################
print("*"*40)
print("\tPROBLEMA DE LAS N - REINAS")
print("*"*40)
print("\n")
print("*"*40)
print("INTRODUCE LA DIMENCIÓN DEL TABLERO:\n")
print("*"*40)
n = eval(input())#Ingresamos el numero de reinas  para generar el tablero
solucion = [] #Creamos un arreglo para almacenar el numero de reinas 
for i in range(n): #Generamos el numero de reinas proporcionales al tablero
    solucion.append(0) #Asignamos un 0 a cada una de las posiciones de nuestras reinas 
etapa = 0
#print(solucion)
#print(etapa)
print(Reinas(solucion, etapa, n))
