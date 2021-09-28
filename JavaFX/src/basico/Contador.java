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
	
	private int contador = 0;
	private Label numero;
	
	public void start(Stage primaryStage) throws Exception {
		
		Label titulo = new Label("Contador");
		titulo.getStyleClass().add("titulo");
		numero = new Label("0");
		numero.getStyleClass().add("numero");
		
		String arquivoCss = getClass().getResource("/basico/Contador.css").toExternalForm();
		
		
		Button botaoDecremento = new Button("-");
		botaoDecremento.setOnAction(e -> { 
			contador--;
			numero.setText(Integer.toString(contador));
			alterarCor();
			});
		botaoDecremento.getStyleClass().add("botoes");
		Button botaoIncremento = new Button("+");
		botaoIncremento.setOnAction(e -> {
			contador++;
			numero.setText(Integer.toString(contador));
			alterarCor();
		});
		botaoIncremento.getStyleClass().add("botoes");
		
		HBox boxBotoes = new HBox(); 
		boxBotoes.setAlignment(Pos.CENTER);
		boxBotoes.setSpacing(10);
		boxBotoes.getChildren().add(botaoDecremento);
		boxBotoes.getChildren().add(botaoIncremento);
		
		VBox boxPrincipal = new VBox();
		boxPrincipal.getStyleClass().add("conteudo");
		boxPrincipal.setSpacing(10);
		boxPrincipal.setAlignment(Pos.CENTER);
		boxPrincipal.getChildren().add(titulo);
		boxPrincipal.getChildren().add(numero);
		boxPrincipal.getChildren().add(boxBotoes);
		
		Scene cenaPrincipal = new Scene(boxPrincipal,400,400);
		primaryStage.setScene(cenaPrincipal);
		cenaPrincipal.getStylesheets().add(arquivoCss);
		
		
		primaryStage.show();
	}
	private void alterarCor() {
		if(contador == 0) {
			numero.getStyleClass().remove("verde");
			numero.getStyleClass().remove("vermelho");
		}
		else if(contador > 0 ) {
			numero.getStyleClass().add("verde");
		}else {
			numero.getStyleClass().add("vermelho");
		}
	}
		public static void main(String[] args) {
			launch(args);
		}

}
