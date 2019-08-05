import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/*
 * Stage: Ventana en sí, cerrar, maximizar, cerrar, es como un Tk() en python
 * Stage: Lo que va dentro de la ventana, botones, labels, gridpanes, etc...
 * Layout: Cómo quiere que se vea todo acomodado en la ventana.
 */

// Para utilizar los metodos de javafx

public class window_4 extends Application{	// Eventhandler<ActionEvent>
	// Sirve para cuando se prresione un boton ejecute el codigo del método handle

	Stage window;
	Scene scene1,scene2;
	
	public static void main(String[]args) {
		launch(args);	// Setea el prgrama como una aplicación de javafx
	}
	
	public void start(Stage primaryStage) throws Exception {	
		window = primaryStage;
		
		Label label1 = new Label("Click para pasar a la segunda escena");
		
		// Boton 1
		Button button1 = new Button("Ir a escena 2");
		button1.setOnAction(e -> window.setScene(scene2));	// cambia de escena
		
		// Layout 1
		VBox layout1 = new VBox(15);	// Stackea todos los elementos uno encima de otro, dejando 15 pixels de espacio
		layout1.getChildren().addAll(label1,button1);
		
		scene1 = new Scene(layout1,200,200);
	
		// Boton 2
		Button button2 = new Button("Ir a escena 1");
		button2.setOnAction(e -> window.setScene(scene1));	// cambia de escena
		
		// Layout 2
		StackPane layout2 = new StackPane();
		layout2.getChildren().add(button2);
		scene2 = new Scene(layout2, 600,300);
		
		window.setScene(scene1);		// Para que el programa ponga la escena 1 como default
		window.setTitle("Cambio de escenas");
		window.show();
	}
}


