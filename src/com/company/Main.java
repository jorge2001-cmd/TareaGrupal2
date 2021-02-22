package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int operacion;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el número de la operación");
        System.out.println("           1- Suma             ");
        System.out.println("           2- Resta            ");
        System.out.println("           3- Multiplicación   ");
        System.out.println("           4- División         ");
        operacion = teclado.nextInt();

        switch (operacion){
            case 1:
                Calculos suma = new Calculos(4,3.1);
                double resultado = suma.sumar();
                System.out.println("La suma es:" +resultado);
                break;
            case 2:
                Calculos resta = new Calculos(3,2);
                double resultado2 = resta.restar();
                System.out.println("La resta es: " +resultado2);
                break;
            case 3:
                Calculos multiplicacion = new Calculos(3,2);
                double resultado3 = multiplicacion.multiplicacion();
                System.out.println("La multiplicación es: " +resultado3);
                break;
            case 4:
                Calculos division = new Calculos(3,2);
                double resultado4 = division.division();
                System.out.println("La división es: " +resultado4);
                break;
            default:
                System.out.println("PORFAVO ESCOJA UN NÚMERO DEL 1 AL 4");
        }
    }

}
