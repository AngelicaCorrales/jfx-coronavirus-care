package model;


public class PreventionCare {
	private int careNumber;
	
	public PreventionCare() {
		
	}
	
	public void setCareNumber(int cn) {
		careNumber=cn;
	}
	
	public String getTextCare() {
		String mesg="";
		switch (careNumber) {
			case 1:
				mesg="Wash your hands with soap frequently";
				break;
			case 2:
				mesg="Sneeze or cough into your flexed elbow";
				break;
			case 3:
				mesg="Keep spaces well ventilated";
				break;
			case 4:
				mesg="Avoid touching your eyes, nose and mouth";
				break;
			case 5:
				mesg="Disinfect frequently used objects";
				break;
			default:
				mesg="Please enter a number from 1 to 5";
		
		}
	
		return mesg;
	}
	
	

	
}
