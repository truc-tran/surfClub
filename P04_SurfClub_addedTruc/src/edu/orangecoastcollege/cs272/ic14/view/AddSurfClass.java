package edu.orangecoastcollege.cs272.ic14.view;

import edu.orangecoastcollege.cs272.ic14.controller.Controller;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class AddSurfClass {
	
	private static Controller controller = Controller.getInstance();
	
	
	
	@FXML
	private TextField addClass;
	@FXML
	private TextField addInstructor;
	@FXML
	private TextField addDay;
	@FXML
	private TextField addStartTime;
	@FXML
	private TextField addDuration;
	@FXML
	private TextField addCost; 
	@FXML 
	private Button save;
	@FXML
	private Button back;
	
	
	@FXML
	public void backClick(){
		ViewNavigator.loadScene("Add New Class", ViewNavigator.SURF_CLASS_SCENE);
	}
	

	
	// Done
	@FXML
	private void saveClick() {

		    String className = addClass.getText();
		    String instructor = addInstructor.getText();
		    String day = addDay.getText();
		    String startTime = addStartTime.getText();
		    String duration = addDuration.getText();
		    String cost = addCost.getText();
		    double trueCost = Double.valueOf(cost);
		  
		    
		    controller.addSurfClass(className, instructor, day, startTime, duration,trueCost);
		    ViewNavigator.loadScene("Add New Class", ViewNavigator.SURF_CLASS_SCENE);
		 

	}
	

}
