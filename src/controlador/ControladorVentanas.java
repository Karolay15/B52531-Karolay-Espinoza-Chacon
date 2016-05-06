/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

/**
 *
 * @author toshibapc
 */
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.FrameCiudadano;
import vista.FrameIndigena;
import vista.FrameMigrante;
import vista.FrameRefugiado;
import vista.FramePlantillaPaises;
import vista.FramePlantillaPersonas;

public class ControladorVentanas implements ActionListener{
  private FrameCiudadano ciudadano;
  private FrameIndigena indigena;
  private FrameMigrante migrante;
  private FrameRefugiado refugiado;
  private FramePlantillaPersonas plantiPersonas;
  private FramePlantillaPaises plantiPaises;
  
  public ControladorVentanas(){
      ciudadano = new FrameCiudadano();
      indigena = new FrameIndigena();
      migrante = new FrameMigrante();
      refugiado = new FrameRefugiado();
      plantiPersonas = new FramePlantillaPersonas();
      plantiPaises = new FramePlantillaPaises();
  }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equalsIgnoreCase("Ciudadano")){
            this.ciudadano = new FrameCiudadano();//ArrayPersona
            ciudadano.show();
        }else
            
        if(e.getActionCommand().equalsIgnoreCase("Indigena")){
            this.indigena = new FrameIndigena();//ArrayPersona
            indigena.show();
        }else
            
        if(e.getActionCommand().equalsIgnoreCase("Migrante")){
            this.migrante = new FrameMigrante();//ArrayPersona
            migrante.show();
        }else
            
        if(e.getActionCommand().equalsIgnoreCase("Refugiado")){
            this.refugiado = new FrameRefugiado();//ArrayPersona
            refugiado.show();
        }else
            
        //if(e.getActionCommand().equalsIgnoreCase("Plantilla")){}
    
    }
  
}
