package edu.orangecoastcollege.cs272.ic14.view;

import java.net.URL;
import java.util.ResourceBundle;

import edu.orangecoastcollege.cs272.ic14.controller.Controller;
import edu.orangecoastcollege.cs272.ic14.model.CashFlow;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;


public class CashFlowView  implements Initializable {

	private static Controller controller = Controller.getInstance();
	ListView<CashFlow> cashFlowLV = new ListView<>();
	ObservableList<CashFlow> CashFlowList = controller.getAllCashFlow();
	
	
	@FXML
	protected Label recordCountLabel = new Label("0 records displayed");
	@FXML
	private ListView<CashFlow> allCashFlowLV;
	@FXML 
	private Button delete;
	@FXML 
	private Button add;
	@FXML 
	private Button reset;
	@FXML
	private TextField monthTF;
	@FXML
	private TextField yearTF;
	@FXML
	public Object loadBackToMenu()
	{
		ViewNavigator.loadScene("Menu", ViewNavigator.MENU_SCENE);
		return this;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		allCashFlowLV.setItems(controller.getAllCashFlow());
		recordCountLabel.setText(CashFlowList.size() + " record(s) displayed");
	}
	
	
	@FXML
	public void filterCash()
	{
		CashFlowList = controller.filterCashFlow(monthTF.getText(), yearTF.getText());
		allCashFlowLV.setItems(CashFlowList);
		recordCountLabel.setText(CashFlowList.size() + " record(s) displayed");		
	}
	
	@FXML
	public Object addRecordClick()
	{
		ViewNavigator.loadScene("Add Class",ViewNavigator.ADD_CASH_FLOW);
		return this;
	}
		
	@FXML
	public Object deleteClick()
	{
		CashFlow selectedClass = allCashFlowLV.getSelectionModel().getSelectedItem();
		controller.deleteCashFlow(selectedClass);
		allCashFlowLV.getSelectionModel().select(-1);
		recordCountLabel.setText(CashFlowList.size() + " record(s) displayed");
		return this;
		
	}
	
	@FXML 
	public Object resetClick()
	{
		allCashFlowLV.setItems(controller.getAllCashFlow());
		CashFlowList = controller.getAllCashFlow();
		recordCountLabel.setText(CashFlowList.size() + " record(s) displayed");
		
		return this;
	}
	
	
	

//	@Override
//	public void start(Stage cashStage) throws Exception {
//		ViewNavigator.setStage(cashStage);
//		ViewNavigator.loadScene("Cash Flow", ViewNavigator.CASH_FLOW_SCENE);
//	} 
//	
//	public static void main(String[] args) {
//		
//		launch(args);
//
//	}

}
