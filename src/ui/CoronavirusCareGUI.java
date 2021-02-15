package ui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import model.PreventionCare;

public class CoronavirusCareGUI {
	
	PreventionCare prevC;

    @FXML
    private TextField txtCareNumber;

    @FXML
    private Label labCareText;
    
    @FXML
    private ImageView imgView;
    
    
    
    public CoronavirusCareGUI() {
    	prevC= new PreventionCare();
    	
    }

    @FXML
    public void showCareRecommendation(ActionEvent event) {
    	String strCareNum=txtCareNumber.getText();
    	try {
    		int careNumb=Integer.parseInt(strCareNum);
    		
    		prevC.setCareNumber(careNumb);
    		
    		String message= prevC.getTextCare();
    		labCareText.setText(message);
    		
    		
    		imgView.setImage(getImg(careNumb));
    		
    		
    	
    		
    	}catch(NumberFormatException nfe){
    		labCareText.setText("Please enter a NUMBER from 1 to 5");
    	}
    }
    
    public Image getImg(int cn) {
    	Image image= null;
    	switch (cn) {
		case 1:
			image= new Image("ui/coronacareimages/WashHands.PNG");
			break;
		case 2:
			image= new Image("ui/coronacareimages/SneezeElbow.PNG");
			break;
		case 3:
			image= new Image("ui/coronacareimages/AvoidTouching.PNG");
			break;
		case 4:
			image= new Image("ui/coronacareimages/KeepVentilated.PNG");
			break;
		case 5:
			image= new Image("ui/coronacareimages/DesinfectObjects.PNG");
			break;
    	}
		
    	return image;
    	
    }
    
    

}

