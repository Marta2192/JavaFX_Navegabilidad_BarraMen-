package edu.marta.dida.navegabilidad;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class App extends Application {

    
    
 @Override
 public void start(Stage primaryStage) throws Exception {
         
     LayoutPane layoutPane = new LayoutPane();
     layoutPane.cargarPantalla("a", ControladorPantallaA.class.getResource("PantallaA.fxml"));
     layoutPane.cargarPantalla("b", ControladorPantallaB.class.getResource("PantallaB.fxml"));
     layoutPane.cargarPantalla("menu", MenuController.class.getResource("Menu.fxml"));
     layoutPane.mostrarComoPantallaActual("a");
     layoutPane.cargarBarraDeMenuEnLaPartePosterior("menu");
     Scene escena = new Scene(layoutPane, 900,400);
     primaryStage.setScene(escena);
     primaryStage.show();
     
 }

    public static void main(String[] args) {
        launch();
        
    }

}
  
   