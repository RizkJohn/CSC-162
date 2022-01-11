package labAssignment_1;
import java.util.*;
public class PhoneBookEntry {
	

	String name;
	long number;
	
	public PhoneBookEntry (String n, long phoneNumber) {
		name = n;
		number = phoneNumber;
	}
	
	public String enterName() {
		return name;
		
	}
	
	public long enterNumber() {
		return number;	
		
	}
	
	public String getName(String n) {
		return name = n;
		
	}
	
	public long getNumber(long phoneNumber) {
		return number = phoneNumber;
		
	}

}
