
public class Main {

	public static void main(String[] args) {
		Mail email = new Mail("Acir", "Rudson");
		
		email.setAlternateEmail("rudson@acir.com");
		System.out.println(email.showInformation());
	}

}
