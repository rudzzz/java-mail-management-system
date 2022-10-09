
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
	}
}
