package com.company;

public class PlayerFifth extends Players {

    private final double cost;

    public PlayerFifth(double cost) {
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
        for (int i = playlist.length; i >= 0; i--) {
            System.out.println("Playing: " + playlist[i]);
        }
    }
}
