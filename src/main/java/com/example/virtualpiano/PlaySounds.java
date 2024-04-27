package com.example.virtualpiano;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.io.File;

public class PlaySounds
{
    File file;
    Media media;
    MediaPlayer player;

    public void playNote(String note)
    {
        //            Media media = new Media("file:///E:/Piano-keys_C3-C6/g3.mp3");
        file = new File("src/main/resources/com/example/virtualpiano/sounds/"+note);
        media = new Media(file.toURI().toString());
        player = new MediaPlayer(media);
        player.play();
        System.out.println(note);
    }
}
