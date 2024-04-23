package string_StringBuilder;

public class PasswordTester {

	
	public static boolean isGoodPassword(String password) {
		if(password.length() < 8) {
			System.err.println("Passwort muss 8 Zeichen lang sein");
			return false;
		}
		
		if(!password.matches(".*[a-zA-Z0-9]+")) {
			System.err.println("Passwort muss ein Zeichen oder eine Zahl haben");
			return false;
		}
		
		if(!password.matches("[a-z]+")) {
			System.err.println("Passwort muss ein kleines Zeichen haben");
			return false;
		}
		
		if(!password.matches("[A-Z]+")) {
			System.err.println("Passwort muss ein großes Zeichen haben");
			return false;
		}
		
		if(!password.matches("\\d+")) {
			System.err.println("Passwort muss eine Zahl haben");
			return false;
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		String password = "PASSWORDdsds";
		
		System.out.println(isGoodPassword(password));

	}

}
