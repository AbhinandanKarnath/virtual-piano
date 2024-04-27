package com.example.virtualpiano;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.util.Random;


public class MainController {

    static PlaySounds play;

    public static void load()throws Exception
    {
        play = new PlaySounds();

    }
    @FXML
    protected void playDaMusic() {
        try
        {
            play = new PlaySounds();

        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}