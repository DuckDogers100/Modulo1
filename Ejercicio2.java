/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2;

/**
 *
 * @author gerar
 */
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el primer numero: ");
        int num1 = sc.nextInt();
        System.out.print("Introduce el segundo numero: ");
        int num2 = sc.nextInt();

        System.out.println("Suma: " + (num1 + num2));
        System.out.println("Resta: " + (num1 - num2));
        System.out.println("Multiplicacion: " + (num1 * num2));
        System.out.println("Division: " + (num1 / num2));
        System.out.println("Modulo: " + (num1 % num2));
    }
}

