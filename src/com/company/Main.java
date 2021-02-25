package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int operacion;
        int repetir = 1;
        float N1, N2;
        Scanner teclado = new Scanner(System.in);

        do {
        System.out.println("Ingrese el número de la operación");
        System.out.println("           1- Suma             ");
        System.out.println("           2- Resta            ");
        System.out.println("           3- Multiplicación   ");
        System.out.println("           4- División         ");
        operacion = teclado.nextInt();


            switch (operacion) {
                case 1:
                    System.out.print("Introduzca el primer numero\n");
                    N1 = teclado.nextInt();
                    System.out.print("Introduzca el segundo numero\n");
                    N2 = teclado.nextInt();
                    Calculos suma = new Calculos(N1, N2);
                    double resultado = suma.sumar();
                    System.out.println("La suma es:" + resultado);
                    break;
                case 2:
                    System.out.print("Introduzca el primer numero\n");
                    N1 = teclado.nextInt();
                    System.out.print("Introduzca el segundo numero\n");
                    N2 = teclado.nextInt();
                    Calculos resta = new Calculos(N1, N2);
                    double resultado2 = resta.restar();
                    System.out.println("La resta es: " + resultado2);
                    break;
                case 3:
                    System.out.print("Introduzca el primer numero\n");
                    N1 = teclado.nextInt();
                    System.out.print("Introduzca el segundo numero\n");
                    N2 = teclado.nextInt();
                    Calculos multiplicacion = new Calculos(N1, N2);
                    double resultado3 = multiplicacion.multiplicacion();
                    System.out.println("La multiplicación es: " + resultado3);
                    break;
                case 4:
                    System.out.print("Introduzca el primer numero\n");
                    N1 = teclado.nextInt();
                    System.out.print("Introduzca el segundo numero\n");
                    N2 = teclado.nextInt();
                    Calculos division = new Calculos(N1, N2);
                    double resultado4 = division.division();
                    System.out.println("La división es: " + resultado4);
                    break;
                default:
                    System.out.println("PORFAVO ESCOJA UN NÚMERO DEL 1 AL 4");
            }
            System.out.println("¿Desea volver a usar la calculadora?\n1.Si\n2.No");
            repetir = teclado.nextInt();
        }while(repetir == 1);

    }
    }


