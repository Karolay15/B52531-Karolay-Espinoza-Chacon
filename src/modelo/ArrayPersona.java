/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
/**
 *
 * @author toshibapc
 */
public class ArrayPersona {
    private ArrayList<Persona> arregloPersona;
    
    public ArrayPersona() {
        this.arregloPersona = new ArrayList<Persona>();
    }
    
    public void setArregloPersona(ArrayList<Persona> arregloPersona) {
        this.arregloPersona = arregloPersona;
    }
    
    
}
