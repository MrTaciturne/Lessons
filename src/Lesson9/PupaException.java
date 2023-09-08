package Lesson9;

public class PupaException extends RuntimeException{

    public PupaException() {
    }
    public PupaException(Exception e){
        e.printStackTrace();
    }

    public PupaException(String message) {
        super(message);
    }

    public PupaException(Throwable cause) {
        super(cause);
    }
}
