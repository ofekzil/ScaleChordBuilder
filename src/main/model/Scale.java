package main.model;

import java.util.ArrayList;
import java.util.List;

public class Scale {


    // assumes name is never empty
    private String name;
    private boolean major;
    private List<Chord> chords;

    // constructs a scale with a name of the form "A" (major), or "Am" (minor)
    public Scale(String name) {
        this.name = name;
        major = !(name.length() > 1 && name.charAt(1) == 'm');
        chords = new ArrayList<>();
    }

    // constructs a scale with a name such as "A" and true of major, false if minor
    public Scale(String name, boolean major) {
        this.name = name;
        this.major = major;
        chords = new ArrayList<>();
    }

    // creates chords based on scale
    public void setChords() {

    }

}
