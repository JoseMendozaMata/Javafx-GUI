import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.*;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.geometry.*;

public class AlertBox_5 {

	public static void display(String title, String message) {
		
		Stage window = new Stage();
		
		window.initModality(Modality.APPLICATION_MODAL);	// Evita ejecutar eventos en otra ventana, solo se podrán realizar
		// acciones en esta ventana, cuando esta esté abierta
		window.setTitle(title);		// Se asigna el titulo
		window.setMinWidth(250);
		
		Label label = new  Label(message);	// Se asigna el mensaje
		Button closeButton = new Button("Close");
		closeButton.setOnAction(e -> window.close());
		
		VBox box = new VBox(10);
		box.getChildren().addAll(label, closeButton);
		box.setAlignment(Pos.CENTER);		// Centra los elementos
		
		Scene scene = new Scene(box);
		
		window.setScene(scene);
		window.showAndWait();		// Espera a que la ventana sea cerrada para poder salir
		
	}
	
}
