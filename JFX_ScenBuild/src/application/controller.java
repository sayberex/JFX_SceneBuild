package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class controller {
	@FXML
	private Button		Button1;
	@FXML
	private TextField	Edit1;
	
	public void OnAction(ActionEvent Event) {
		System.out.println("clicked...");
		Edit1.setText("Clicked ...");
	}
}
