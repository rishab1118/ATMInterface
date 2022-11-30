package application;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class history {
	private final SimpleStringProperty dateString;
	private final SimpleIntegerProperty txidInteger;
	private final SimpleIntegerProperty amountInteger;
	public history(String dateString, Integer txidInteger, Integer amountInteger) {
		super();
		this.dateString = new SimpleStringProperty(dateString);
		this.txidInteger = new SimpleIntegerProperty(txidInteger);
		this.amountInteger = new SimpleIntegerProperty(amountInteger);
	}
	public Integer getId() {
		return txidInteger.get();
	}
	public String getdate() {
		return dateString.get();
	}
	public Integer getAmount() {
		return amountInteger.get();
	}
}
