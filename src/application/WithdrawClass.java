package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class WithdrawClass  {

@FXML
public void withdrawButton(ActionEvent event)throws Exception
{
	Stage primaryStage=new Stage();
	Parent root=FXMLLoader.load(getClass().getResource("withdrawPage.fxml"));
	Scene scene = new Scene(root,400,400);
	scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	primaryStage.setScene(scene);
	primaryStage.show();
}
@FXML
public void depositButton(ActionEvent event)throws Exception
{
	Stage primaryStage=new Stage();
	Parent root=FXMLLoader.load(getClass().getResource("Deposit.fxml"));
	Scene scene = new Scene(root,400,400);
	scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	primaryStage.setScene(scene);
	primaryStage.show();
}
@FXML
public void historyButton(ActionEvent event)throws Exception
{
	Stage primaryStage=new Stage();
	Parent root=FXMLLoader.load(getClass().getResource("history.fxml"));
	Scene scene = new Scene(root,400,400);
	scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	primaryStage.setScene(scene);
	primaryStage.show();
}
@FXML
public void quitButton(ActionEvent event)throws Exception
{
	javafx.application.Platform.exit();
}

@FXML
public void TransferButton(ActionEvent event)throws Exception
{
	Stage primaryStage=new Stage();
	Parent root=FXMLLoader.load(getClass().getResource("TranferPage.fxml"));
	Scene scene = new Scene(root,400,400);
	scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	primaryStage.setScene(scene);
	primaryStage.show();
}


}
