/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saludos.java;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class Saludos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String nombre;
        System.out.print("Ingrese su nombre: ");
        Scanner sc = new Scanner(System.in);
        nombre = sc.nextLine();
        System.out.println("Hola, " + nombre);
        
        
    }
    
}
