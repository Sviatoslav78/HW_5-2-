package com.company;

public class Players {


    String firstSong = "The best song";
    String secSong = "Good song";
    String thirdSong = "Super Song";
    String[] playlist = new String[]{"The best song", "Good song", "Super Song"};

    public Players() {
    }

    public void playSong() {

        System.out.println("Playing: " + playlist[0]);
    }

    public void playAllSongs() {

        for (int i = 0; i < playlist.length; i++) {

            System.out.println("Playing: " + playlist[i]);
        }
    }

}
