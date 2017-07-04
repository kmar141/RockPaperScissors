package com.example.user.rockpaperscissors;

import java.sql.ResultSet;
import java.util.Scanner;

import javax.security.auth.Subject;

import behaviours.Moves;

/**
 * Created by user on 22/06/2017.
 */

public class Player {

    private Scanner sc;

    public Player(){
        sc = new Scanner(System.in);
    }

    public Moves getMove(){
        System.out.println("Choose R, P or S");
        String input = sc.nextLine().toUpperCase();
//      charAt(0) grabbing first letter of rock
        char choice = input.charAt(0);
        switch(choice){
            case 'R' :
                return Moves.ROCK;
            case 'P' :
                return Moves.PAPER;
            case 'S' :
                return Moves.SCISSORS;
            default:
                System.out.println("Invalid choice");
                return getMove();
        }
    }

}
