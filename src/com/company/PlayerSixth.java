package com.company;

public class PlayerSixth extends Players {

    private final double cost;

    public PlayerSixth(double cost) {
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

    public void shuffle() {

        String temp = playlist[0];

        playlist[0] = playlist[2];
        playlist[2] = playlist[1];
        playlist[1] = temp;

    }
}
