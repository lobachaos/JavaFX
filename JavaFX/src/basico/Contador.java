package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Contador extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Label titulo = new Label("Contador");
		Label numero = new Label("0");
		
		Button botaoDecremento = new Button("-");
		Button botaoIncremento = new Button("+");
		
		HBox boxBotoes = new HBox(); 
		boxBotoes.setAlignment(Pos.CENTER);
		boxBotoes.setSpacing(10);
		boxBotoes.getChildren().add(botaoIncremento);
		boxBotoes.getChildren().add(botaoDecremento);
		
		VBox boxPrincipal = new VBox();
		boxPrincipal.setSpacing(10);
		boxPrincipal.setAlignment(Pos.CENTER);
		boxPrincipal.getChildren().add(titulo);
		boxPrincipal.getChildren().add(numero);
		boxPrincipal.getChildren().add(boxBotoes);
		
		Scene cenaPrinciapl = new Scene(boxPrincipal,400,400);
		primaryStage.setScene(cenaPrinciapl);
		
		
		primaryStage.show();
	}
		public static void main(String[] args) {
			launch(args);
		}

}
