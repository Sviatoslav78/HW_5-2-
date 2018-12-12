package com.company;

public class PlayerFourth extends Players {

    private final double cost;

    public PlayerFourth(double cost) {
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }

    @Override
    public void playSong() {
        System.out.println("Playing: " + thirdSong);
    }

    @Override
    public void playAllSongs() {
        super.playAllSongs();
    }
}
