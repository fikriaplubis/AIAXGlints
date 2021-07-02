package reverse;

public class Answer {
	public Answer() {
	}
	
	public String reverse(String input) {
	    if (input.length() == 0) {
	        throw new NullPointerException("Please insert the input");
	    } else {
	    	String output = "";

		    for (int i = input.length() - 1; i >= 0; i--) {
		        output = output + input.charAt(i);
		    }
		    
		    return output;
	    }
	}
}
