import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/*
 * Stage: Ventana en s�, cerrar, maximizar, cerrar, es como un Tk() en python
 * Stage: Lo que va dentro de la ventana, botones, labels, gridpanes, etc...
 * Layout: C�mo quiere que se vea todo acomodado en la ventana.
 */

// Para utilizar los metodos de javafx

public class window extends Application implements EventHandler<ActionEvent>{	// Eventhandler<ActionEvent>
	// Sirve para cuando se prresione un boton ejecute el codigo del m�todo handle

	Button button;
	
	public static void main(String[]args) {
		launch(args);	// Setea el prgrama como una aplicaci�n de javafx
	}
	
	public void start(Stage primaryStage) throws Exception {	// Main window
		// Main javafx code
		primaryStage.setTitle("Main Window");
		
		button = new Button();
		button.setText("Clickeame?");
		
		button.setOnAction(this);	// Busca handle en esta clase y lo ejecuta, por eso el this
		
		StackPane layout = new StackPane();
		layout.getChildren().add(button);
		
		Scene scene = new Scene(layout, 500,500);	// Sintaxis: Scene(layout(contenedor), width, height)
		primaryStage.setScene(scene);
		primaryStage.show();		// Mostrar 
	}
	public void handle(ActionEvent event) {		// c�digo que se encarga de los eventos
		if(event.getSource() == button) {		// Que boton o c�digo hace que se ejecute esta acci�n, sirve para identificar
			// que boton ejecuta qu� c�digo
			System.out.println("Bro");
			
		}
	}
}
