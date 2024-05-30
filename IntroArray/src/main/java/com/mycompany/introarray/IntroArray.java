/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.introarray;

public class IntroArray {

    public static void main(String[] args) {
        int[]numeros;
        numeros= new int[5];
        numeros[0]=10;
        numeros[1]=20;
        numeros[2]=30;
        numeros[3]=40;
        numeros[4]=50;
        System.out.println("El elemnto del indice 0: " +numeros[0]);
        System.out.println("El elemnto del indice 1: " +numeros[1]);
        System.out.println("El elemnto del indice 2: " +numeros[2]);
        System.out.println("El elemnto del indice 3: " +numeros[3]);
        System.out.println("El elemnto del indice 4: " +numeros[4]);
        int suma =numeros[0]+numeros[1]+numeros[2]+numeros[3]+numeros[4];
        System.out.println("La suma array es:"+suma);
        
    }
}
