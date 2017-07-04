package behaviours;

/**
 * Created by user on 22/06/2017.
 */

public enum Moves {
    ROCK("Rock"),
    PAPER("Paper"),
    SCISSORS("Scissors");

    private String type;

    Moves(String type){
        this.type = type;
    }

    public String getType(){
        return this.type;
    }

}
