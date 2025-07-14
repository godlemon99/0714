package your_throw;

public class CreateException {
    public static void main(String[] args) throws IOTException{
        //throw new ArithmeticException();
        //int a= 4/0;

        throw new IOTException();

    }
}

class IOTException extends Exception{
    IOTException(){
        super("iot 예외 발생");
    }
}