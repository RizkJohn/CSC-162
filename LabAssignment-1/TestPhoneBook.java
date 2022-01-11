package labAssignment_1;

import java.util.ArrayList;
import java.util.Scanner;

public class TestPhoneBook {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String name;
		long phoneNumber;
		
		ArrayList<PhoneBookEntry> contact = new ArrayList<>();
		
		int entries = 5;
		
		
		for(int i = 0; i<entries; i++) {
	
			System.out.print("Enter the person's name: ");
			name = input.next();
		
			System.out.print("Enter the person's phone number: ");
			phoneNumber = input.nextLong();
			contact.add(i, new PhoneBookEntry(name, phoneNumber));
		}
		
		System.out.println("The Phone Book contains the following entries:");
		
		for(PhoneBookEntry entry:contact) {
			System.out.println("Name: " + entry.enterName() + ", Phone Number: " + entry.enterNumber());
		}
		
		

	}

}

