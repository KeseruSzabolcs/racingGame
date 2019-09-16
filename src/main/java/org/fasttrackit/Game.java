package org.fasttrackit;

public class Game {

    private Vehicle comptetitor1;
    private Vehicle compteritor2;
    private Track[] tracks = new Track[3];

    public void start(){
        initializeTrack();
        displayTracks();

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
