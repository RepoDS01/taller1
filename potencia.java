/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diseñosoftware;

/**
 *
 * @author User
 */
public class potencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(potencia(2,2));
        
    }
    public static String potencia(int base,int exponente){
        double result=0;
        result=Math.pow(base, exponente);
        return "La potencia de la base "+base+" y exponente "+exponente+" es:"+result;
    }
    
}
