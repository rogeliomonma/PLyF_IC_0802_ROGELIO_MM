%Generacion de estados de transicion de cada evento.
trans(gonorte,gonorte,00).
trans(gonorte,waitnorte,01).
trans(gonorte,gonorte,10).
trans(gonorte,waitnorte,11).

trans(waitnorte,goeste,00).
trans(waitnorte,goeste,01).
trans(waitnorte,goeste,10).
trans(waitnorte,goeste,11).

trans(goeste,goeste,00).
trans(goeste,goeste,01).
trans(goeste,waiteste,10).
trans(goeste,waiteste,11).

trans(waiteste,gonorte,00).
trans(waiteste,gonorte,01).
trans(waiteste,gonorte,10).
trans(waiteste,gonorte,11).

transicion(Inicio,T):-trans(Inicio,Final,T),write(Final).
