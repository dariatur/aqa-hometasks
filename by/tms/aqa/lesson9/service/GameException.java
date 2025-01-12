package by.tms.aqa.lesson9.service;

public class GameException extends Exception{

    public GameException() {
        super();
    }

    public GameException(Exception e) {
        super(e);
    }

    public GameException(String message) {
        super(message);
    }

}
