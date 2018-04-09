package cc.comac.ftdanalyser;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class MainLoader extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		FXMLLoader loader=new FXMLLoader();
		loader.setLocation(getClass().getResource("ui/login/Login.fxml"));
		AnchorPane rootLayout=(AnchorPane) loader.load();
		Scene scene=new Scene(rootLayout);
		stage.setScene(scene);
		stage.initStyle(StageStyle.UNDECORATED);
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
