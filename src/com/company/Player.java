package com.company;

/**
 * Created by monstradamus on 11.12.16.
 */
public class Player {

    private String name;
    private int score;

    public Player(String playerName){
        this.name = playerName;
    }

    public void addScore(int score){
        this.score += score;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Player)
            return ((this.name == ((Player) obj).getName()) && this.score == ((Player) obj).getScore());
        return false;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

}
