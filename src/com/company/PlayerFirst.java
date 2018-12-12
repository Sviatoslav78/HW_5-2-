package com.company;

public class PlayerFirst extends Players {

    private final double cost;


    public PlayerFirst(double cost) {
        this.cost = cost;
        playlist = new String[]{firstSong};
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
