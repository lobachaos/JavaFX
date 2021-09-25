package basico;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PrimeiroFX extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Button botao = new Button("A");
		Button botaoB = new Button("B");
		botao.setOnAction(e-> System.out.print("A"));
		
		
		VBox box = new VBox();
		box.getChildren().add(botao);
		box.getChildren().add(botaoB);
		
		Scene cena = new Scene(box,200,200);
		primaryStage.setScene(cena);
		primaryStage.show();
		
		
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
