package reverse;

public class Main {
	public static void main(String[] args) {
		try {
			Answer myAnswer = new Answer();	
			System.out.println(myAnswer.reverse("FIKRI"));
		} catch (NullPointerException error) {
			System.out.println(error);
		}
	}
}
