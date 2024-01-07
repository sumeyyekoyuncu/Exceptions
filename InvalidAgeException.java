
public class InvalidAgeException extends ArithmeticException{
    public InvalidAgeException(String message){
        super(message);
    }
    @Override
    public void printStackTrace() {
        System.out.println("this is an invalid age exception...");
    }
    
    
}
