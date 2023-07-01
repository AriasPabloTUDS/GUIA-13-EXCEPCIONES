/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;

/**
 *
 * @author Pablo
 */
public class Automovil {
    
    private ArrayList<String> marcaYModelo = new ArrayList<>();

    public Automovil() {
    }

    public Automovil(ArrayList<String> marcaYModelo) {
        this.marcaYModelo = marcaYModelo;
    }
    
    public void crearMarcaYModelo(){
            
        marcaYModelo.add("fiat-uno");
        marcaYModelo.add("Peugeot-308");
        marcaYModelo.add("Honda-crv");
        
    }
    
    public void mostrarMarcaYmodelo(){
        
        try {
            for (int i = 0; i < 10; i++) {
            marcaYModelo.get(i);
        }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error consulta fuera de rango");
        }
        
    }
} 

