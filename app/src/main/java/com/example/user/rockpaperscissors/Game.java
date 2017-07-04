package com.example.user.rockpaperscissors;

import behaviours.Moves;

import static behaviours.Moves.PAPER;
import static behaviours.Moves.ROCK;
import static behaviours.Moves.SCISSORS;

/**
 * Created by user on 22/06/2017.
 */

public class Game {

    private Player player;
    private Computer computer;

    public Game(){
        player = new Player();
        computer = new Computer();
    }

    public void playGame(){
        Moves computerMove = computer.getMove();
        Moves playerMove = player.getMove();
        System.out.println("You played " + playerMove.getType());
        System.out.println("Computer played " + computerMove.getType());
        int winner = compareMoves(playerMove, computerMove);
        displayWinner(winner);

    }

    public int compareMoves(Moves playerMove, Moves computerMove){
        if (playerMove == computerMove){
            return 0;
        }

        switch (playerMove){
            case ROCK :
                return (computerMove == SCISSORS ? 1 : -1);
            case PAPER:
                return (computerMove == ROCK ? 1 : -1);
            case SCISSORS:
                return (computerMove == PAPER ? 1 : -1);
            default:
                return 0;
            //1 = playerwon | -1 = playerlost
        }
    }

    public String displayWinner(int result){
        switch (result){
            case 0:
                return "It's a draw";
            case 1 :
                return "Player wins";
            case -1 :
                return "Computer wins";
            default:
                return "z";
            }
        }
    }


