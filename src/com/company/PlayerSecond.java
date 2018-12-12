package com.company;

public class PlayerSecond extends Players{

    private final double cost;


    public PlayerSecond(double cost) {
        this.cost = cost;
        playlist = new String[]{firstSong};
    }

    public double getCost() {
        return cost;
    }

    @Override
    public void playSong() {
        System.out.println("error");
    }

    @Override
    public void playAllSongs() {
        System.out.println("error");
    }
}
