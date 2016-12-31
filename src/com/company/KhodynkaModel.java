package com.company;


import java.util.List;
import java.util.Queue;

/**
 * Created by monstradamus on 11.12.16.
 */
public class KhodynkaModel {

    private int numButtons;
    private int numWinners;

    private Queue<Player> playerPool;
    private List<Player> currentPlayers;
    private List<Player> winners;

    public void init(){
        for (int i = 0; i < this.numButtons; i++)
            this.currentPlayers.add(this.playerPool.poll());
    }

    public void fireAll(){
        for (int i = 0; i < this.numButtons; i++)
            this.playerPool.offer(this.currentPlayers.get(i));
        this.init();
    }

    public void refresh(){
        for (int i = 0; i < this.numButtons; i++) {
            if (this.currentPlayers.get(i).getScore() > 1){
                this.winners.add(this.currentPlayers.get(i));
                this.currentPlayers.add(i, this.playerPool.poll());
            }
        }
    }

    public List<Player> getWinners() {
        return winners;
    }

    public List<Player> getCurrentPlayers() {
        return currentPlayers;
    }

    public Queue<Player> getPlayerPool() {
        return playerPool;
    }
}
