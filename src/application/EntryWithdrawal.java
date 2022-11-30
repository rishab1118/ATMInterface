package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class EntryWithdrawal extends FrontPageCode {
@FXML
private TextField t6;

@FXML
public void withdrawTransaction(ActionEvent event) throws Exception
{
	String amount=t6.getText();
	long amount1=Integer.parseInt(amount);
	if (amount1<balance) {
		balance=balance-amount1;
	System.out.println(balance);
	Stage primaryStage=new Stage();
	Parent root=FXMLLoader.load(getClass().getResource("WithdrawalSuccess.fxml"));
	Scene scene = new Scene(root,400,400);
	scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	primaryStage.setScene(scene);
	primaryStage.show();
}
	
	else if (amount1>balance) {
		
	
		Stage primaryStage=new Stage();
		Parent root=FXMLLoader.load(getClass().getResource("NoFunds.fxml"));
		Scene scene = new Scene(root,400,400);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
}

