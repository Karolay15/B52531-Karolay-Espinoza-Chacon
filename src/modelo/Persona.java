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
public class Persona {
    private String cedula, procedencia, carnet;
    private int diasPermanencia;

    public Persona() {
        this.setCedula(cedula);
        this.setCarnet(carnet);
        this.setProcedencia(procedencia);
        this.setDiasPermanencia(diasPermanencia);
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public void setDiasPermanencia(int diasPermanencia) {
        this.diasPermanencia = diasPermanencia;
    }

    public String getCedula() {
        return cedula;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public String getCarnet() {
        return carnet;
    }

    public int getDiasPermanencia() {
        return diasPermanencia;
    }
}
