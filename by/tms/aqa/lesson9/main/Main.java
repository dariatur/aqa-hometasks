package by.tms.aqa.lesson9.main;

import by.tms.aqa.lesson9.entity.User;
import by.tms.aqa.lesson9.service.Game;
import by.tms.aqa.lesson9.service.GameException;
import by.tms.aqa.lesson9.service.GameOverException;
import by.tms.aqa.lesson9.service.impl.GameImpl;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        User user = new User();
        Game game = new GameImpl();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name:");
        user.setName(sc.nextLine());
        System.out.println("Please enter your balance");
        user.setBalance(sc.nextInt());
        sc.nextLine();
        while(user.getBalance() > 0){
            System.out.println("Enter your bet");
            int bet = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter your guess");
            int number = sc.nextInt();
            sc.nextLine();

            try {
                game.validate(bet, user);
            } catch (GameException e){
                System.out.println(e.getMessage());
                System.out.println("Please try again");
                continue;
            }

            try {
                boolean hasWon = game.play(number);
                String result = hasWon ? "Your guess was right" : "The number is not the same";
                System.out.println(result);
                game.change(user, bet, hasWon);
            } catch (GameException e){
                System.out.println(e.getMessage());
                System.out.println("Please try again");
                continue;
            } catch (GameOverException e){
                System.out.println(e.getMessage());
                break;
            }
            if(user.getBalance() > 0){
                System.out.println("You can try again, your balance is: " + user.getBalance());
                continue;
            } else {
                System.out.println("Your balance is 0, game over");
            }
        }

    }

}
