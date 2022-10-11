import java.util.Scanner;

public class Mail {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String alternateEmail;
	
	public Mail(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("Email created: " + this.firstName + "." + this.lastName);
		
		//method to ask the employees department
		this.department = Department(); 
	}
	
	
	
	private String Department() {
		System.out.println("What is the deparament?");
		System.out.println("1 - Development\n2 - Sales\n3 - Accounting");
		Scanner scanner = new Scanner(System.in);
		String choice = scanner.next();
		
		switch(choice) {
			case "1":
				System.out.println("Development"); 
				break;
			case "2":
				System.out.println("Sales"); 
				break;
			case "3":
			System.out.println("Accounting"); 
				break;
			default:
				System.out.println("Invalid Command!"); 
				break;
		}
		scanner.close();
		return choice;
	}


}
