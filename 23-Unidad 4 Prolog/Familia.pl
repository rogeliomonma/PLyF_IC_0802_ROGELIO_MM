/*HECHOS*/
masculino(alan).
masculino(carlos) .
masculino(luis) .
masculino(ivan) .
femenino(ana) .
femenino(andrea) .
femenino(eugenia) .
femenino(damaris) .
padre(carlos, alan) .
padre(alan, luis) .
padre(ana, carlos) .
padre(andrea, luis).
padre(eugenia, alan) .
madre(luis,andrea).
/*REGLAS*/
padres(X,Y) :-femenino(Y), madre(X,Y).
padres(X,Y) :- padre(X,Y).
abuelo(X,Y) :- padre(X,Z),padre(Z,Y).
%abuelo(X,Y) :- padre(X,Z),madre(Z,Y).
hermano(X,Y):- masculino(Y),padres(X,P),padres(Y,P),not(X=Y).
hermana(X,Y):-femenino(Y),padres(X,P),padres(Y,P),not(X=Y).
%tio(X,U):- madre(X,P),hermano(P,U).
tio(X,U) :- padre(X,P),hermano(P,U).













