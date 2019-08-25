import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class window_5 extends Application{
	
	Stage window;
	Scene scene;
	
	public static void main(String[]args) {
		launch(args);
	}
	
	public void start(Stage primaryStage) {
		
		window = primaryStage;
		window.setTitle("Muchas ventanas");
		
		Button button = new Button("Click para abrir otra ventana");
		button.setOnAction(e -> 
		{
			boolean result = ConfirmationBox.display("Cnfirmar","Está seguro?");
			System.out.println(result);
		});
		
		StackPane layout = new StackPane();
		layout.getChildren().add(button);
		
		scene = new Scene(layout, 200,200);
		
		window.setScene(scene);
		window.show();
	
	}

}
