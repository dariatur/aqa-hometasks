package by.tms.aqa.lesson9.service;

public class GameOverException extends Exception{

    public GameOverException() {
        super();
    }

    public GameOverException(Exception e) {
        super(e);
    }

    public GameOverException(String message) {
        super(message);
    }

}
