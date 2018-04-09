package cc.comac.ftdanalyser.ui.login;

import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseDragEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class LoginController {
	
	@FXML
	private AnchorPane loginAPane;
	
	@FXML
	private Label nologinLabel;
	
	@FXML
	private FontAwesomeIconView minDeco;
	
	@FXML
	private FontAwesomeIconView closeDeco;
	
	@FXML
	private TextField usernameField;
	
	@FXML
	private PasswordField passwordField;
	
	@FXML
	private Button confirmBtn;
	
	private Stage stage;

	@FXML
	public void initialize() {
		
	}
	
	@FXML
	private void handleDragPane(){
		stage.addEventHandler(MouseEvent.MOUSE_DRAGGED,new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				
			}
		});
	}
	
	public void setStage(Stage stage){
		this.stage=stage;
	}

}
