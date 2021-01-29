package com.company;

import static com.company.Songs.arrayOfSongs;
import static com.company.Songs.haleluya;

public class Main {

    public static void main(String[] args) {

         for (int i = 0; i < 10; i++){
             System.out.println(arrayOfSongs[i]);
         }

        System.out.println(haleluya);

        Songs.resetCount();

        Songs popSong = new Songs("blablabla",1.2f);
        System.out.println(popSong);
    }
}
