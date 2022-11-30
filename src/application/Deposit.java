package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Deposit extends FrontPageCode {
	

	@FXML
	private TextField t6;
	@FXML
	private TextField t7;
	
	
	
	@FXML
	public void depositButton(ActionEvent event) throws Exception
	{
		long acountNo=82088892;
		String n1=t6.getText();
		String n2=t7.getText();
		int n3=Integer.parseInt(n1);
		int n4=Integer.parseInt(n2);
		if (acountNo==n3) {
			balance=balance+n4;
			Stage primaryStage=new Stage();
			Parent root=FXMLLoader.load(getClass().getResource("WithdrawalSuccess.fxml"));
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			System.out.println(balance);
		}
		else {
			t6.setText("Enter valid accounNo");
		}
	}
	
}
