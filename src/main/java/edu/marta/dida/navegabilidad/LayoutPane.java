/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.marta.dida.navegabilidad;

import javafx.scene.layout.BorderPane;
import java.util.HashMap;
import java.util.Map;
import javafx.scene.Node;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import java.io.IOException;
import java.net.URL;
/**
 *
 * @author user
 */
public class LayoutPane extends BorderPane{
    
    private Map<String, Node> pantallasDeLaAplicacion;
    
    public LayoutPane(){
        this.pantallasDeLaAplicacion = new HashMap<>();
    
    
}

public void cargarPantalla(String nombreDeLaPantalla, URL urlArchivoFxml)throws IOException{
FXMLLoader cargadorPantallas = new FXMLLoader(urlArchivoFxml);
Parent pantalla =cargadorPantallas.load();

ControladorConNavegabilidad controladorConNavegabilidad = cargadorPantallas.getController();
controladorConNavegabilidad.setLayout(this);

pantallasDeLaAplicacion.put(nombreDeLaPantalla, pantalla);

    }
public void mostrarComoPantallaActual(String nombreDeLaPantalla){
    this.setCenter(pantallasDeLaAplicacion.get(nombreDeLaPantalla));
}

public void cargarBarraDeMenuEnLaPartePosterior(String nombreDeLaPantalla){
    this.setTop(pantallasDeLaAplicacion.get("menu"));
}
}