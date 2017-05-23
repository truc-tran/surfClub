package edu.orangecoastcollege.cs272.ic14.view;

import java.net.URL;
import java.util.ResourceBundle;

import edu.orangecoastcollege.cs272.ic14.controller.Controller;
import edu.orangecoastcollege.cs272.ic14.model.SurfClass;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class SurfClassView  implements Initializable{
	
	private static Controller controller = Controller.getInstance();
	ListView<SurfClass> surfClassLV = new ListView<>();
	ObservableList<SurfClass> SurfClassList = controller.getAllSurfClass();
	ObservableList<String> instList;
	ObservableList<String> classList;
	
	
	@FXML
	protected Label recordCountLabel = new Label("0 records displayed");
	@FXML
	private ListView<SurfClass> allClassesLV;
	@FXML 
	private Button delete;
	@FXML 
	private Button add;
	@FXML 
	private Button reset;
	@FXML
	private TextField instructorTF;
	@FXML
	private TextField classTF;
	@FXML
	public Object loadBackToMenu()
	{
		ViewNavigator.loadScene("Menu", ViewNavigator.MENU_SCENE);
		return this;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		allClassesLV.setItems(controller.getAllSurfClass());
		recordCountLabel.setText(SurfClassList.size() + " record(s) displayed");
	}
	
	public void filterResult()
	{
		SurfClassList = controller.filterSurfClass(instructorTF.getText(), classTF.getText());
		allClassesLV.setItems(SurfClassList);
		recordCountLabel.setText(SurfClassList.size() + " record(s) displayed");
	}
	
	
	@FXML
	public Object addSurfClass()
	{
		ViewNavigator.loadScene("Add Class",ViewNavigator.ADD_SURF_CLASS);
		return this;
	}
		
	@FXML
	public Object deleteClass()
	{
		SurfClass selectedClass = allClassesLV.getSelectionModel().getSelectedItem();
		controller.deleteSurfClass(selectedClass);
		allClassesLV.getSelectionModel().select(-1);
		recordCountLabel.setText(SurfClassList.size() + " record(s) displayed");
		
		return this;
		
	}
	
	@FXML 
	public Object resetClass()
	{
		allClassesLV.setItems(controller.getAllSurfClass());
		SurfClassList = controller.getAllSurfClass();
		recordCountLabel.setText(SurfClassList.size() + " record(s) displayed");
		
		return this;
	}
	
	

//	@Override
//	public void start(Stage surfClassStage) throws Exception {
//		ViewNavigator.setStage(surfClassStage);
//		ViewNavigator.loadScene("Surf Classes", ViewNavigator.SURF_CLASS_SCENE);
//	} 
//	
//	public static void main(String[] args) {
//		
//		launch(args);
//
//	}
}
