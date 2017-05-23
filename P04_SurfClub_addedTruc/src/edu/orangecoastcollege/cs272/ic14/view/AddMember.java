package edu.orangecoastcollege.cs272.ic14.view;



import edu.orangecoastcollege.cs272.ic14.controller.Controller;
import javafx.fxml.FXML;

import javafx.scene.control.Button;
import javafx.scene.control.Label;

import javafx.scene.control.TextField;


public class AddMember{

		private static Controller controller = Controller.getInstance();
		
		
		
		@FXML
		private Label error;
		@FXML
		private TextField addFirstName;
		@FXML
		private TextField addLastName;
		@FXML
		private TextField addBirthday;
		@FXML
		private TextField addPhone;
		@FXML
		private TextField addAddress;
		@FXML
		private TextField addCity;
		@FXML
		private TextField addState;
		@FXML
		private TextField addZipCode;
		@FXML 
		private Button save;
		@FXML
		private Button cancelButton;
		@FXML
		private Button back;
		
		
		@FXML
		public Object backClick(){
			ViewNavigator.loadScene("Add New Member", ViewNavigator.MEMBER_SCENE);
			return this;
		}
		
		
		@FXML
		private void cancelClick() 
		{
			addFirstName.setText("");
			addLastName.setText("");
			addBirthday.setText("");
			addPhone.setText("");
			addAddress.setText("");
			addCity.setText("");
			addState.setText("");
			addZipCode.setText("");
		}

		
		// Done
		@FXML
		private void saveClick() {
	
		    
		    if ( addFirstName.getText().isEmpty() || addLastName.getText().isEmpty() ||
		    		addBirthday.getText().isEmpty() || addPhone.getText().isEmpty() ||
		    		addAddress.getText().isEmpty() || addCity.getText().isEmpty() ||
		    		addState.getText().isEmpty() || addZipCode.getText().isEmpty() )
		    {
		    	error.setText("*All field must be complete"); 
		    }
		    
		    String firstName = addFirstName.getText();
		    String lastName = addLastName.getText();
		    String birthday = addBirthday.getText();
		    String phone = addPhone.getText();
		    String address = addAddress.getText();
		    String city = addCity.getText();
		    String state = addState.getText();
		    String zipCode = addZipCode.getText();
		  

		     controller.addMember(firstName, lastName, birthday, phone, address, city, state, zipCode);
		     ViewNavigator.loadScene("Membership", ViewNavigator.MEMBER_SCENE);

		}
		
		
	
}
