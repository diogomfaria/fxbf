package exception;

public class IdNotFindException extends Exception{
	
	
	public IdNotFindException() {
		super("Id n�o encontrado");
	}
	
	public IdNotFindException(String msg) {
		super(msg);
	}
}
