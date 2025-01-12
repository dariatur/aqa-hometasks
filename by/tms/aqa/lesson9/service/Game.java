package by.tms.aqa.lesson9.service;

import by.tms.aqa.lesson9.entity.User;

public interface Game {

    void validate(int bet, User user) throws GameException;
    boolean play(int number) throws GameException, GameOverException;
    void change(User user, int bet, boolean hasWon);

}
