package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class HistoryController implements Initializable {
	@FXML private TableView<history> table;
	@FXML private TableColumn<history, String> dateString;
	@FXML private TableColumn<history, Integer> txidInteger;
	@FXML private TableColumn<history, Integer> amountInteger;
	
	public ObservableList<history> list= FXCollections.observableArrayList(
			new history("29-11-2022", 89746, 2000),
			new history("14-11-2022", 54664, 1000),
			new history("13-11-2022", 11654, 2000),
			new history("02-10-2022", 64648, 6500),
			new history("10-09-2022", 21305, 1300),
			new history("01-08-2022", 74096, 1500)
			);
	@Override
	public void initialize(URL location,ResourceBundle resources)
	{
		
		txidInteger.setCellValueFactory(new PropertyValueFactory<history, Integer>("txidInteger"));
amountInteger.setCellValueFactory(new PropertyValueFactory<history, Integer>("amountInteger"));
		dateString.setCellValueFactory(new PropertyValueFactory<history, String>("dateString"));
		table.setItems(list);
	}

}
