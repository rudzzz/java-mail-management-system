import java.util.Scanner;

public class Mail {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String alternateEmail;
	private int passwordLength = 8;
	private String email;
	private String company = "mycompany.com";
	
	public Mail(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("\nNew employee: " + this.firstName + "." + this.lastName + "\n");
		
		// method to ask the employees department
		this.department = Department(); 
		
		//method to get a random password
		this.password = getRandomPassword(passwordLength);
		
		// generate email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + company;
		//System.out.println("\nYor email is: \n\n" + email);
		//System.out.println("The password is: \n" + this.password);
	}
	
	private String Department() {
		System.out.println("What is the deparament?");
		System.out.println("1 - Development\n2 - Sales\n3 - Accounting");
		Scanner scanner = new Scanner(System.in);
		String choice = scanner.next();
		
		switch(choice) {
			case "1":
				department = "development"; 
				break;
			case "2":
				department = "sales"; 
				break;
			case "3":
				department = "accounting"; 
				break;
			default:
				System.out.println("Invalid Command!"); 
				break;
		}
		scanner.close();
		return department;
	}

	// method to generate a random password 
	private String getRandomPassword(int length) {
		String possibilities = "ABCDEFJHIJKLMNOPQRSTUVXWYZ!@#$%&*+-/*0123456789";
		char[] password = new char[length];
		for(int i = 0; i < length; i++) {
			int random = (int) (Math.random() * possibilities.length());
			password[i] = possibilities.charAt(random);
		}
		return new String(password);
	}
	
	// method to set a alternate email
	public void setAlternateEmail(String alternateEmail) {
		this.alternateEmail = alternateEmail;
	}
	
	// method to get the generated email
	public String getalternateEmail() {
		return alternateEmail;
	}
	
	//method to change password
	public void changePassword(String password) {
		this.password = password;
	}

	// method to get the password
	public String getPassword() {
		return password;
	}
	
	// method to display the email and password
	public String showInformation() {
		if(department != null) {
			return "\nName: " + firstName + " " + lastName + "\nEmail: " + email + "\nYour password: " + password;
		}
		else {
			return "";
		}
	}
}
