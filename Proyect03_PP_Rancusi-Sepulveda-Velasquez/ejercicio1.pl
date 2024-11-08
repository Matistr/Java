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

% REGLAS

% Clasificaci�n por edad

% X es un Bebe (<= 2 a�os)
bebe(X) :- edad(X, Y), Y =< 2.

% X es un Ni�o (3-9 a�os)
nino(X) :- edad(X, Y), Y >= 3, Y =< 9.

% X es un Adolescente (10-20 a�os)
adolescente(X) :- edad(X, Y), Y >= 10, Y =< 20.

% X es un Adulto (21-69 a�os)
adulto(X) :- edad(X, Y), Y >= 21, Y =< 69.

% X es un Anciano (>= 70 a�os)
anciano(X) :- edad(X, Y), Y >= 70.
