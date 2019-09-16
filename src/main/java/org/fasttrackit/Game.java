package org.fasttrackit;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicBoolean;

public class Game {

    private Vehicle comptetitor1;
    private Vehicle compteritor2;
    private Track[] tracks = new Track[3];
    private List<Vehicle> competitors = new ArrayList<>();


    public void start(){
        initializeTrack();
        displayTracks();
        initializeCompetitors();
    }

    private void initializeCompetitors(){
        int competitorCount = 2;

        System.out.println("Today's competitors are: ");

        for (int i = 0; i < competitorCount; i++){
            Vehicle competitor = new Vehicle();
            competitor.setName("Competitor " + i);
            competitor.setMaxSpeed(300);
            competitor.setMileage(ThreadLocalRandom.current().nextDouble(6,12));
            competitor.setFuelLevel(80);

            System.out.println(competitor);
            competitors.add(competitor);

        }
    }

    private void initializeTrack(){
        Track track1 = new Track();
        track1.setName("Monte Carlo");
        track1.setLength(300);

        tracks[0] = track1;

        Track track2 = new Track();
        track2.setName("Monza");
        track2.setLength(400);

        tracks[1] = track2;
    }

    private void displayTracks(){
        System.out.println("Available tracks: ");

        for (int i = 0; i < tracks.length; i++) {
            if (tracks[i] != null) {
                System.out.println(tracks[i].getName() + "- Length " + tracks[i].getLength() + " km.");
            }
        }
    }
}
