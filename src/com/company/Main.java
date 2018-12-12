package com.company;

public class Main {

    public static void main(String[] args) {

        Players playerFirst = new PlayerFirst(1);
        Players playerSecond = new PlayerSecond(2);
        Players playerThird = new PlayerThird(3);
        Players playerFourth = new PlayerFourth(4);
        Players playerFifth = new PlayerFifth(5);
        Players playerSixth = new PlayerSixth(6);

        // для примера продемонстрируем работу 4-ого и 6-ого

        System.out.println("Cost of the fourth player = " + ((PlayerFourth) playerFourth).getCost());
        System.out.println("First song: ");
        playerFourth.playSong();
        System.out.println();
        System.out.println("The whole playlist: ");
        playerFourth.playAllSongs();

        System.out.println();

        System.out.println("Cost of the sixth player = " + ((PlayerSixth) playerSixth).getCost());
        System.out.println("Last song: ");
        playerSixth.playSong();
        System.out.println();
        System.out.println("The whole playlist: ");
        playerSixth.playAllSongs();
        ((PlayerSixth) playerSixth).shuffle();
        System.out.println();
        System.out.println("Shuffled playlist: ");
        playerSixth.playAllSongs();


    }
}
