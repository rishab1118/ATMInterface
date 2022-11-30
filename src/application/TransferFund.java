package application;

import java.security.PublicKey;
import java.util.Random;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class TransferFund extends FrontPageCode {
@FXML
private TextField t9;
@FXML
private TextField t10;
@FXML
private TextField t11;
String accountNo;
long aC;

@FXML
public void Transfer(ActionEvent event) throws Exception
{
	Random rand=new Random();
	
	 accountNo=t9.getText();
	String amount=t10.getText();
	aC=Integer.parseInt(accountNo);
	long am=Integer.parseInt(amount);
	if (balance>=am) {
		balance=balance-am;
		long tid=rand.nextInt(80000,150000);
	
		Stage primaryStage=new Stage();
		Parent root=FXMLLoader.load(getClass().getResource("WithdrawalSuccess.fxml"));
		Scene scene = new Scene(root,400,400);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.show();
	}


	
}
}
