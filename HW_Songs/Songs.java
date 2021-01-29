package com.company;

import lombok.ToString;

import java.util.Date;

@ToString
public class Songs {
    public final Date releaseDate = new Date();
    public final String songName;
    public float rating;
    public static int songCounter = 0;
    public final int songNumber;
    public static final int goldStandard = 1000;
    public boolean afterGold;

    public Songs(String songName, float rating) {
        this.songName = songName;
        this.rating = rating;
        songNumber = ++songCounter;
        if (songNumber > goldStandard) {
            afterGold = true;
        } else {
            afterGold = false;
        }
    }

    public static void resetCount(){
        songCounter = 0;
    }
    public float getPosition(){
        return songNumber/songCounter;
    }

    public static Songs [] arrayOfSongs = new Songs[]{
            new Songs ("If I Could Fly", 8.7f),
            new Songs("Halloween", 9.1f),
            new Songs("Forever And One", 9.3f),
            new Songs("Future World", 7.5f),
            new Songs("Rain", 6.8f),
            new Songs("We Got The Right", 8.8f),
            new Songs("You Always Walk Alone", 9.9f),
            new Songs("Number One", 9.6f),
            new Songs("I Want Out", 9.4f),
            new Songs("Never Be A Star", 8.9f),
    };

    static Songs haleluya = new Songs("Haleluya", 9.5f);

}
