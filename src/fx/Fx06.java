package fx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Fx06 extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		Parent root= (Parent)FXMLLoader.load(getClass().getResource("root04.xml"));
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("app.css").toString());
		
		stage.setTitle("외부스타일 css 적용");
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
