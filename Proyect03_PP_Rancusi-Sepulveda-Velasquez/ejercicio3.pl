%Paradigmas de la Programacion, NRC 8150
%Integrantes:
    %Catalina Esperanza Rancusi Bustamante; 21..533.463-5
    %Matias Ambrosio Sepulveda Toro; 21.323.113-8
    %Christian Alonso Velasquez Matus; 21.351.669-8

% HECHOS

% Edades de las personas
edad(roberto, 95).
edad(isabel, 87).
edad(ana, 57).
edad(marcelo, 61).
edad(martin, 37).
edad(sara, 32).
edad(matias, 5).
edad(elias, 2).
edad(amalia, 48).
edad(oscar, 37).
edad(andrea, 34).
edad(esteban, 17).
edad(tiziana, 5).

% Relaciones de parentesco (padres e hijos)
padre(martin, matias).
padre(martin, elias).
padre(marcelo, martin).
padre(roberto, ana).
padre(roberto, amalia).
padre(roberto, oscar).
padre(oscar, esteban).
padre(oscar, tiziana).

madre(isabel, ana).
madre(isabel, amalia).
madre(isabel, oscar).
madre(ana, martin).
madre(sara, matias).
madre(sara, elias).
madre(andrea, esteban).
madre(andrea, tiziana).

% Relaciones matrimoniales
esposa(isabel, roberto).
esposa(ana, marcelo).
esposa(sara, martin).
esposa(andrea, oscar).
esposo(oscar, andrea).
esposo(martin, sara).
esposo(marcelo, ana).
esposo(roberto, isabel).

% REGLAS

% Clasificación por edad

% X es un Bebe (<= 2 años)
bebe(X) :- edad(X, Y), Y =< 2.

% X es un Niño (3-9 años)
nino(X) :- edad(X, Y), Y >= 3, Y =< 9.

% X es un Adolescente (10-20 años)
adolescente(X) :- edad(X, Y), Y >= 10, Y =< 20.

% X es un Adulto (21-69 años)
adulto(X) :- edad(X, Y), Y >= 21, Y =< 69.

% X es un Anciano (>= 70 años)
anciano(X) :- edad(X, Y), Y >= 70.

% Comparaciones de edad

% X es mayor que Y
mayor(X, Y) :- edad(X, EdadX), edad(Y, EdadY), EdadX > EdadY.

% X es menor que Y
menor(X, Y) :- edad(X, EdadX), edad(Y, EdadY), EdadX < EdadY.

% X e Y tienen la misma edad
igual_edad(X, Y) :- edad(X, EdadX), edad(Y, EdadY), EdadX = EdadY.

% Relaciones familiares

% Hermano: X y Y tienen los mismos padres y son diferentes
hermano(X, Y) :- padre(Z, X), padre(Z, Y), madre(W, X), madre(W, Y), X \= Y.

% Hijo: X es hijo de Y (padre o madre)
hijo(X, Y) :- padre(Y, X); madre(Y, X).

% Tío: X es hermano de uno de los padres de Y
tio(X, Y) :- hermano(X, Z), padre(Z, Y); hermano(X, Z), madre(Z, Y).

% Sobrino: X es hijo del hermano de Y
sobrino(X, Y) :- tio(Y, X).

% Primo: X y Y son hijos de hermanos
primo(X, Y) :-
    (padre(Z, X), hermano(Z, W), padre(W, Y), X \= Y);
    (padre(Z, X), hermano(Z, W), madre(W, Y), X \= Y);
    (madre(Z, X), hermano(Z, W), padre(W, Y), X \= Y);
    (madre(Z, X), hermano(Z, W), madre(W, Y), X \= Y).

% Abuelo: X es padre/madre de uno de los padres/madres de Y
abuelo(X, Y) :-
    padre(X, Z), padre(Z, Y);
    padre(X, Z), madre(Z, Y);
    madre(X, Z), madre(Z, Y);
    madre(X, Z), padre(Z, Y).

% Nieto: X es hijo de uno de los hijos de Y
nieto(X, Y) :- abuelo(Y, X).

% Bisabuelo: X es abuelo de uno de los padres/madres de Y
bisabuelo(X, Y) :-
    abuelo(X, Z), padre(Z, Y);
    abuelo(X, Z), madre(Z, Y).

% Bisnieto: X es hijo de uno de los nietos de Y
bisnieto(X, Y) :- bisabuelo(Y, X).

% Cuñado: X es el esposo/esposa del hermano/hermana de Y o el hermano/hermana del esposo/esposa de Y
cunado(X, Y) :-
    (esposo(X, Z), hermano(Z, Y));
    (esposa(X, Z), hermano(Z, Y));
    (esposo(Y, Z), hermano(Z, X));
    (esposa(Y, Z), hermano(Z, X)).
