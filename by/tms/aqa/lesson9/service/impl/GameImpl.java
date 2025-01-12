package by.tms.aqa.lesson9.service.impl;

import by.tms.aqa.lesson9.entity.User;
import by.tms.aqa.lesson9.service.Game;
import by.tms.aqa.lesson9.service.GameException;
import by.tms.aqa.lesson9.service.GameOverException;

import java.util.Random;

public class GameImpl implements Game{

    @Override
    public void validate(int bet, User user) throws GameException{
        if (bet > user.getBalance()){
            throw new GameException("Your balance is low");
        } else if (bet > 100) {
            throw new GameException("Your bet is bigger than 100");
        }
    }

    @Override
    public boolean play(int number) throws GameException, GameOverException {
        Random random = new Random();
        if(number < -1 || number > 5){
            throw new GameException("You entered incorrect number");
        }

        if(number == -1){
            throw new GameOverException("User left the game");
        }

        return number == random.nextInt(0, 6);
    }

    @Override
    public void change(User user, int bet, boolean hasWon) {
        if(hasWon){
            user.setBalance(user.getBalance()+bet*2);
        } else {
            user.setBalance(user.getBalance()-bet);
        }
    }

}
