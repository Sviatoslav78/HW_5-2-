package com.company;

public class PlayerThird extends Players {

    private final double cost;


    public PlayerThird(double cost) {
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }

    @Override
    public void playSong() {
        super.playSong();
    }

    @Override
    public void playAllSongs() {
        super.playAllSongs();
    }
}
