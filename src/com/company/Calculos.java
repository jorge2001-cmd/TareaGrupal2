package com.company;

import java.util.Scanner;

public class Calculos {

    //Atributos
    private double num1, num2, res;

    //Constructor
    public Calculos(double a, double b){
        this.num1 = a;
        this.num2 = b;
    }

    //Metodos SET y GET

    public double getNum1(){
        return num1;
    }

    public void setNum1(double num1){
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    //Metodo de suma
    public double sumar (){

        this.res = this.num1 + this.num2;
        return this.res;

    }

    //Metodo de resta
    public double restar (){

        this.res = this.num1 - this.num2;
        return this.res;
    }

    //Metodo de multiplicacion
    public double multiplicacion (){

        this.res = this.num1 * this.num2;
        return this.res;
    }

    //Metodo de division
    public double division (){

        this.res = this.num1 / this.num2;
        return this.res;
    }
}
