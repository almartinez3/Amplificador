package App;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Ventana extends Application {
	public static void main (String []args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
	 Parent root= FXMLLoader.load(getClass().getResource("/fxml/fxml.fxml"));
	 Scene scene = new Scene(root,600,400);
	 primaryStage.setScene(scene);
	 primaryStage.setTitle("HOLA");
	 primaryStage.show();
	 
	
		
	}

}
