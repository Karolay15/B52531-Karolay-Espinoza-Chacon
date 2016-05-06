/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author toshibapc
 */
public class Pais {
    private int capacidad, cuotaRefugiados;

    public Pais() {
        this.setCapacidad(capacidad);
        this.setCuotaRefugiados(cuotaRefugiados);
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void setCuotaRefugiados(int cuotaRefugiados) {
        this.cuotaRefugiados = cuotaRefugiados;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public int getCuotaRefugiados() {
        return cuotaRefugiados;
    }
}
