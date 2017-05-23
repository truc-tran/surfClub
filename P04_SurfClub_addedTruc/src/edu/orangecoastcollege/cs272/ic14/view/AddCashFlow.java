package edu.orangecoastcollege.cs272.ic14.view;

import edu.orangecoastcollege.cs272.ic14.controller.Controller;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class AddCashFlow {
	
	private static Controller controller = Controller.getInstance();
	
	
	@FXML
	private TextField yearTF;
	@FXML
	private TextField monthTF;
	@FXML
	private TextField rentTF;
	@FXML
	private TextField wageTF;
	@FXML
	private TextField supplyTF;
	@FXML
	private TextField taxTF; 
	@FXML
	private TextField totalTF; 
	@FXML
	private TextField saleTF; 
	@FXML
	private TextField profitTF; 
	@FXML 
	private Button save;
	@FXML
	private Button back;
	@FXML
	private Button cancel;
	
	
	@FXML
	public void backClick(){
		ViewNavigator.loadScene("Cash Flow", ViewNavigator.CASH_FLOW_SCENE);
	}
	

	@FXML
	private void cancelClick() 
	{
		yearTF.setText("");
		monthTF.setText("");
		rentTF.setText("");
		wageTF.setText("");
		supplyTF.setText("");
		taxTF.setText("");
		totalTF.setText("");
		saleTF.setText("");
		profitTF.setText("");
	}

	
	// Done
	@FXML
	private void saveClick() {

		    String year = yearTF.getText();
		    String month = monthTF.getText();
		    
		    double rent = Double.valueOf(rentTF.getText());
		    double wage = Double.valueOf(wageTF.getText());
		    double supply = Double.valueOf(supplyTF.getText());
		    double tax = Double.valueOf(taxTF.getText());
		    double total = Double.valueOf(totalTF.getText());
		    double sale = Double.valueOf(saleTF.getText());
		    double profit = Double.valueOf(profitTF.getText());
		  
		    
		   controller.addCashFlow(year, month, rent, wage, supply, tax, total, sale, profit);
		   ViewNavigator.loadScene("Cach Flow", ViewNavigator.CASH_FLOW_SCENE);
		 

	}
	

}
