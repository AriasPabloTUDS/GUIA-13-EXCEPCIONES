/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Pablo
 */
public class DivisionNumero {

    public int convertirANum(String num1) {

        try {
            int aux;
            aux = Integer.parseInt(num1);

        } catch (NumberFormatException e) {
            System.out.println("Error dato: " + num1 + " es incorrecto debería ser un número");
        } 

        return Integer.parseInt(num1);
    }

    public double dividir(String num1, String num2) {
        try {
            double prueba = convertirANum(num1) / convertirANum(num2);
        } catch (ArithmeticException e) {
            System.out.println("Error no se puede dividir " + num1+ " por "+num2);
        }
        return convertirANum(num1) / convertirANum(num2);
    }
}
