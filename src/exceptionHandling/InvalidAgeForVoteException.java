package exceptionHandling;

public class InvalidAgeForVoteException extends RuntimeException {
	
	public InvalidAgeForVoteException(String msg){
		super(msg);
	}

}
