import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/*
 * Stage: Ventana en sí, cerrar, maximizar, cerrar, es como un Tk() en python
 * Stage: Lo que va dentro de la ventana, botones, labels, gridpanes, etc...
 * Layout: Cómo quiere que se vea todo acomodado en la ventana.
 */

// Para utilizar los metodos de javafx

public class window_3 extends Application{	// Eventhandler<ActionEvent>
	// Sirve para cuando se prresione un boton ejecute el codigo del método handle

	Button button;
	
	public static void main(String[]args) {
		launch(args);	// Setea el prgrama como una aplicación de javafx
	}
	
	public void start(Stage primaryStage) throws Exception {	// Main window
		// Main javafx code
		primaryStage.setTitle("Main Window");
		
		button = new Button();
		button.setText("Clickeame?");
		
		button.setOnAction(e -> {		
			System.out.println("Bro");	// Expresiones lambda, si hay mas de una linea de código se 
			//encierra en un boque de código {}
			System.out.println("Porque así?");
		});
		StackPane layout = new StackPane();
		layout.getChildren().add(button);
		
		Scene scene = new Scene(layout, 500,500);	// Sintaxis: Scene(layout(contenedor), width, height)
		primaryStage.setScene(scene);
		primaryStage.show();		// Mostrar 
	}
}
