package edu.marta.dida.navegabilidad;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author user
 */
public class MenuController extends ControladorConNavegabilidad {

  
    public void mostrarPantallaDepartamentos(){
        this.layout.mostrarComoPantallaActual("departamentos");
    }
    
     public void mostrarPantallaEmpleados(){
        this.layout.mostrarComoPantallaActual("empleados");
    }
     
      public void mostrarPantallaChart(){
        this.layout.mostrarComoPantallaActual("chart");
    }
    
}
