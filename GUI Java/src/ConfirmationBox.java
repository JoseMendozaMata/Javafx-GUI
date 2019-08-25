import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ConfirmationBox {
	
	static boolean answer;
	
	public static boolean display(String title, String message) {
		
		Stage stage = new Stage();
		stage.setTitle(title);
		
		Label msg = new Label(message);
		
		VBox box = new VBox(15);
		
		Button buttonY = new Button();
		buttonY.setText("Yes");
		buttonY.setOnAction(e -> {
			
			answer = true;
			stage.close();
			
		}
		);
		
		Button buttonN = new Button();
		buttonN.setText("NO");
		buttonN.setOnAction(e -> {
			
			answer = false;
			stage.close();
		}
		);
		
		box.getChildren().addAll(msg, buttonY, buttonN);
		box.setAlignment(Pos.CENTER);
		
		Scene scene = new Scene(box);
		stage.setScene(scene);
		stage.showAndWait();
		
		return answer;
		
	}
}
