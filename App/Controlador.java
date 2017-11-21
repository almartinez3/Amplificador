package App;

import java.io.FilterReader;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;


public class Controlador implements Initializable {
	
	Consola c = new Consola();
	
	
    
    @FXML public void action(ActionEvent event) {
       
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	EventHandler<MouseEvent> handler1 = new EventHandler<MouseEvent>() {

		@Override
		public void handle(MouseEvent event) {
			System.out.println("handler ");
			
		}
    };
}
