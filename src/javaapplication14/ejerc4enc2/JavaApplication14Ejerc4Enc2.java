/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication14.ejerc4enc2;

import static java.awt.PageAttributes.MediaType.C;
import java.util.Scanner;

/**
 *
 * @author Rodrigo y Ale
 */
public class JavaApplication14Ejerc4Enc2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        

        System.out.println("ingresa tu temperatura ");
        //int temp = entrada.nextInt();
        double temp = entrada.nextDouble();
        Double grados = 32 + (9  *temp / 5); 
       // int mult2 = num1 * 2;
       // int mult3 = num1 * 3;
        //double raiz =  Math.sqrt(num1);
        System.out.println("la temperatura es F :" + grados);
    }
    
}
