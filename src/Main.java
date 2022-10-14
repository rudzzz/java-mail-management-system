
public class Main {

	public static void main(String[] args) {
		Mail email = new Mail("Acir", "Rudson");
		
		email.setAlternateEmail("rudson@acir.com");
		email.changePassword("abcDE$123");
		System.out.println("---------------------");
		System.out.println("New email: " + email.getalternateEmail());;
		System.out.println("New password: " + email.getPassword());
	}

}
