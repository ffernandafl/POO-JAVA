package com.company;

public class Main {

    public static void main(String[] args) {

        Perro lomito = new Perro();
        lomito.nombre = "Chems";
        lomito.edad = 2;
        lomito.raza = "mestiza";
        lomito.tamanio = "wrande";
        lomito.caracteristicas();
        lomito.comer();

        Perro lomito2 = new Perro();
        lomito2.nombre = "Firulais";
        lomito2.edad = 3;
        lomito2.raza = "electrica";
        lomito2.tamanio = "wrande";
        lomito2.caracteristicas();
        lomito2.jugar();

        Perro lomito3 = new Perro("Milaneso");
        lomito3.caracteristicas();

        Perro lomito4 = new Perro("Paris", "Pitbull", 2, "bebé");
        lomito4.caracteristicas();
    }
}
