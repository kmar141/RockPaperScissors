package com.example.user.rockpaperscissors;

//import com.example.user.rockpaperscissors.behaviours.Moves;

import java.util.Random;

import behaviours.Moves;

/**
 * Created by user on 22/06/2017.
 */

public class Computer {

    public Moves getMove(){
        Moves[] moves = Moves.values();
        Random random = new Random();
        int index = random.nextInt(moves.length);
        return moves[index];
    }

}
