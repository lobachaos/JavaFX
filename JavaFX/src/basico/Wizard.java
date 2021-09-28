package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Wizard extends Application {
	
	private Stage window;
	private Scene step01;
	private Scene step02;
	private Scene step03;

	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		makeStep01();
		makeStep02();
		makeStep03();
		window.setScene(step01);
		window.setTitle("Wizard");
		window.show();
	}
	
	private void makeStep01() {
		Button nextStepButton = new Button("Step 02");
		HBox box = new HBox();
		box.getChildren().add(nextStepButton);
		box.setAlignment(Pos.BOTTOM_RIGHT);
		nextStepButton.setOnAction(e -> {
			window.setScene(step02);
		});
		step01 = new Scene(box,400,400);
		
	}
	private void makeStep02() {
		Button backStepButton = new Button("Step 01");
		Button nextStepButton = new Button("Step 03");
		HBox box = new HBox();
		box.getChildren().add(backStepButton);
		box.getChildren().add(nextStepButton);
		box.setAlignment(Pos.BOTTOM_RIGHT);
		backStepButton.setOnAction(e -> {
			window.setScene(step01);
		});
		nextStepButton.setOnAction(e -> {
			window.setScene(step03);
		});
		step02 = new Scene(box,400,400);
		
	}
	private void makeStep03() {
		Button backStepButton = new Button("Step 02");
		Button nextStepButton = new Button("Close the App");
		HBox box = new HBox();
		box.getChildren().add(backStepButton);
		box.getChildren().add(nextStepButton);
		box.setAlignment(Pos.BOTTOM_RIGHT);
		backStepButton.setOnAction(e -> {
			window.setScene(step02);
		});
		nextStepButton.setOnAction(e -> {
			System.exit(0);
		});
		step03 = new Scene(box,400,400);
		
	}
	public static void main(String[] args) {
		launch(args);
	}

}
