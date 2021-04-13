package exceptions;

public class NewsException extends RuntimeException {
	
    public NewsException(String exMessage, Exception exception) {
        super(exMessage, exception);
    }

    public NewsException(String exMessage) {
        super(exMessage);
    }

}
