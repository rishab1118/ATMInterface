package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class FrontPageCode {
@FXML
private TextField t1;
long balance=50000;
@FXML
private TextField t2;
@FXML
public void userCheck(ActionEvent event) throws Exception
{
	int id=820888;
	int pin=9236;
	
	String id1=t1.getText();
	String atm=t2.getText();
	int mainPin=Integer.parseInt(atm);
	int id2=Integer.parseInt(id1);
	
	if (id2==id && pin==mainPin) {
		Stage primaryStage=new Stage();
		Parent root=FXMLLoader.load(getClass().getResource("MainPage.fxml"));
		Scene scene = new Scene(root,400,400);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	else if (id2!=id) {
		t1.setText("Enter valid id");
	}
	else if (id2==id && mainPin!=pin) {
		t2.setText("Enter valid pin");
	}

}

}
