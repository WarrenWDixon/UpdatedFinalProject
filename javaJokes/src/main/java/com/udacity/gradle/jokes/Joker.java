package com.udacity.gradle.jokes;

import java.util.ArrayList;
import java.util.Random;

public class Joker {
    private ArrayList<String> JokeList;

    public Joker() {
        JokeList = new ArrayList<String>();
        JokeList.add("What's the best thing about Switzerland?" + " I don't know but the flag is a big plus!");
        JokeList.add(" I invented a new word!" + " Plagirism!");
        JokeList.add("Did you hear about the mathematician who's afraid of negative numbers?" + "he'll stop at nothing to avoid them");
        JokeList.add("Helvetica and Times New Roman walk into a bar." + "The bartender told them get out here we don't serve your type! ");
        JokeList.add("Hear about the new restaurant called Karma?" + "There's no menu, you get what you deserve!");
    }


    public String getJoke() {
        //return "This is totally a funny joke";
        Random rand = new Random();
        int upperBound = JokeList.size();
        int randomJoke = rand.nextInt(upperBound);
        return JokeList.get(randomJoke);

    }
}

