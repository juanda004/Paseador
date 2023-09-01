/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfaces;

/**
 *
 * @author Juan David Leon
 */
import java.util.Scanner;

public class PaseadorDePerros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                System.out.print("Ingrese el número de horas de paseo: ");
        int horas = sc.nextInt();
                System.out.print("Ingrese la cantidad de perros: ");
        int perros = sc.nextInt();
                double costoTotal = 0;
                for (int i = 1; i <= perros; i++) {
            System.out.print("Ingrese el tamaño del perro " + i + " (1: grande, 2: mediano, 3: pequeño): ");
            int tamano = sc.nextInt();
            double costoPorPerro = 0;
            
            switch (tamano) {
                case 1:
                    costoPorPerro = 10000;
                    break;
                case 2:
                    costoPorPerro = 5000;
                    break;
                case 3:
                    costoPorPerro = 3000;
                    break;
                default:
                    System.out.println("Tamaño de perro inválido");
                    return;
            }
            costoTotal += costoPorPerro;
        }
        if (perros > 2) {
            costoTotal *= 0.10; // Aplicar descuento del 10% si hay más de 2 perros
        }
        costoTotal *= horas;
        
        System.out.println("El costo total del paseo es: $" + costoTotal);
    }
}
