package edu.orangecoastcollege.cs272.ic14.view;

import java.net.URL;
import java.util.ResourceBundle;


import edu.orangecoastcollege.cs272.ic14.controller.Controller;
import edu.orangecoastcollege.cs272.ic14.model.Member;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class MemberView  implements Initializable {

	private static Controller controller = Controller.getInstance();
	ListView<Member> memberLV = new ListView<>();
	ObservableList<Member> memberList = controller.getAllMembers();
	
	@FXML
	private TextField firstNameTF;
	@FXML
	private TextField lastNameTF;
	@FXML
	protected Label recordCountLabel = new Label("0 records displayed");
	@FXML
	private ListView<Member> allMembersLV;
	@FXML 
	private Button del;
	@FXML 
	private Button reset;
	@FXML 
	private Button add;
	@FXML 
	private Button filterButton;
	@FXML
	public Object loadBackToMenu()
	{
		ViewNavigator.loadScene("Menu", ViewNavigator.MENU_SCENE);
		return this;
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
	allMembersLV.setItems(controller.getAllMembers());
	}  
	
	// Complete
	@FXML
	public Object deleteClick()
	{
		// Find out the selected member to add
		Member selectedMember = allMembersLV.getSelectionModel().getSelectedItem();
		// Use controller to delete the member from Member list
		controller.deleteMember(selectedMember);
		return this;
		
	}
	
	@FXML 
	public Object resetClick()
	{
		
		allMembersLV.setItems(controller.getAllMembers());
		memberList = controller.getAllMembers();
		recordCountLabel.setText(memberList.size() + " record(s) displayed");
		firstNameTF.setText("");
		lastNameTF.setText("");
		return this;
	}
	
	
	// Complete
	@FXML
	public Object addNewMemberClick()
	{
	    ViewNavigator.loadScene("Add New Member", ViewNavigator.ADD_MEMBER_SCENE);
		return this;
	}
    
//	public void start(Stage primaryStage) throws Exception {
//		// Set stage only needs to be called once for the view navigator
//		
//		ViewNavigator.setStage(primaryStage);
//		ViewNavigator.loadScene("Members Information", ViewNavigator.MEMBER_SCENE);
//	}
//
//	public static void main(String[] args) {
//		
//		launch(args);
//
//	}
	
	@FXML
	public Object filterClick()
	{
		memberList = controller.filter(firstNameTF.getText(), lastNameTF.getText());
		allMembersLV.setItems(memberList);
		recordCountLabel.setText(memberList.size() + " record(s) displayed");
		return this;
	}


	


	

    



}
