import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class AirlineRes {

	private String firstName;
	private String lastName;
	private int flightNumber;
	private int seatNumber;

	public AirlineRes() {

	}

	public AirlineRes(String firstName, String lastName, int flightNumber, int seatNumber) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.flightNumber = flightNumber;
		this.seatNumber = seatNumber;	
	}

	public void setFirstName(String firstName) {
	
		this.firstName = firstName;
	}

	public String getFirstName() {

		return firstName;
	}
	
	public void setLastName(String lastName) {
	
		this.lastName = lastName;
	}

	public String getLastName() {
		
		return lastName;
	}

	public void setFlightNumber(int flightNumber) {
		
		this.flightNumber = flightNumber;
	} 

	public int getFlightNumber() {
	
		return flightNumber;
	}

	public void setSeatNumber(int seatNumber) {

		this.seatNumber = seatNumber;
	}

	public int getSeatNumber() {
	
		return seatNumber;
	}

	public String getSeatClass(int seatNumber) {
		
		this.seatNumber = seatNumber;
		String seatClass = null;

		switch (seatNumber) {
			case 1:
			case 2:
				seatClass = "First Class";
				break;
			case 3:
			case 4:
				seatClass = "Second Class";
				break;
			case 5:
			case 6:
				seatClass = "Third Class";
				break;
			case 7:
			case 8:
				seatClass = "Fourth Class";
				break;
			default:
				seatClass = "Eco Class";
		}
		return seatClass;
	}

	public int noFlyList() {

		int code = 0;		
		String fullName = firstName.toLowerCase() + " " + lastName.toLowerCase();
		
		String[] noFlyNames = new String[3];
		noFlyNames[0] = "jack blue";
		noFlyNames[1] = "jack green";
		noFlyNames[2] = "jill white";
		List<String> noFlyArrayList = new ArrayList<String>(Arrays.asList(noFlyNames));
		
		
		if (noFlyArrayList.get(0).contains(fullName)) {
			
			code = 9999;
		} else if (noFlyArrayList.get(1).contains(fullName)) {

			code = 9999;
		} else if (noFlyArrayList.get(2).contains(fullName)) {
			
			code = 9999;
		} else {

			System.out.println("INVALID NAME");
		}	

		return code;
	}

	public String getPortionString() {

		String portionOfString = null;
		String completeState = firstName + lastName + flightNumber + seatNumber;

		String seatNumberString = Integer.toString(seatNumber);
		String seatNumberDigit1 = seatNumberString.substring(0, 1);
		String seatNumberDigit2 = seatNumberString.substring(1, 2);
		int seatNumberDigitFinal1 = Integer.parseInt(seatNumberDigit1);
		int seatNumberDigitFinal2 = Integer.parseInt(seatNumberDigit2);

		if (seatNumber > 10) {
			if (seatNumberDigitFinal1 < seatNumberDigitFinal2) {
				if (seatNumberDigitFinal2 < completeState.length()) {
					portionOfString = completeState.substring(seatNumberDigitFinal1, seatNumberDigitFinal2);
				} 
			}
		} else {
			System.out.println("NUMBER GREATER THAN 10 ONLY");
		}	
		return portionOfString;	
	}
}