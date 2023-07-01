/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg13.e.pkg03;

import Entidades.DivisionNumero;
import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class GUIA13E03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        DivisionNumero divisionNumero = new DivisionNumero();
        
        String num1;
        String num2;
        
        System.out.println("Inicio de programa");
        System.out.print("Ingrese en formato cadena número 1: ");
        num1 = leer.next();
        System.out.print("Engrese en formato cadena número 2: ");
        num2 = leer.next();
        
        System.out.println("Resultado de la división: "+divisionNumero.dividir(num1, num2));
              
    }
    
}
