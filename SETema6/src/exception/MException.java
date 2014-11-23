package mvc.exception;

public class MException extends Exception{

	  
	    public MException(String input, String errorMessage) {
	    
	    	super("Input Format exception on \"" + input + "\" : " + errorMessage);
	    }
}
