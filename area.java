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
public class area {
    
    public static void main(String[] args) {
        System.out.println("Ingrese la base de un triangulo");
        Scanner sc1= new Scanner (System.in);
        int i= sc1.nextInt();
        System.out.println("Ingrese la altura del triangulo");
        int b=sc1.nextInt();
        
        System.out.println("el area del triangulo es  "+ (i*b)/2);
        
    }
}
