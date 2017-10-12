/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suma;

import java.util.Scanner;

/**
 *
 * @author steevenrodriguez
 */
public class Suma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese un el primer numero");
        Scanner sc1= new Scanner (System.in);
        int i= sc1.nextInt();
        System.out.println("Ingrese un el primer numero");
        int b=sc1.nextInt();
        
        System.out.println("la suma es "+ (i+b));
        
    }
    
}
