package main.model;

// represents a chord with a name (root note), its fifth, third and whether it is major or minor
// TODO: add m7b5 chords (seventh in major scale)
// TODO: add options for flat chords, not just sharps
public class Chord {

    private String name;
    private boolean major;
    private String root;
    private String third;
    private String fifth;

    // constructs a chord
    // assumes input is valid (i.e. it's of form 'C', 'Cm', 'C#', 'C#m' for now)
    public Chord(String name, boolean major) {
        this.name = name;
        this.major = major;
        root = (this.major ? this.name : this.name.substring(0,this.name.length() - 1));
        third = setThird();
        fifth = setFifth();
    }

    // sets the third note for the chord
    private String setThird() {
        int rootIdx = Constants.NOTES.indexOf(root);
        int idx = rootIdx + (major ? Constants.JUMPS.get(2) : Constants.JUMPS.get(2) - 1);
        if (idx >= Constants.NOTES.size()) {
            idx -= (Constants.NOTES.size());
        }
        return Constants.NOTES.get(idx);
    }

    // sets the third note for the chord
    private String setFifth() {
        int rootIdx = Constants.NOTES.indexOf(root);
        assert(rootIdx >= 0);
        int idx = rootIdx + Constants.JUMPS.get(4);
        if (idx >= Constants.NOTES.size()) {
            idx -= (Constants.NOTES.size());
        }
        return Constants.NOTES.get(idx);
    }

    // getters

    public String getName() {
        return name;
    }

    public String getRoot() {
        return root;
    }

    public boolean isMajor() {
        return major;
    }

    public String getThird() {
        return third;
    }

    public String getFifth() {
        return fifth;
    }

    // returns a string representation of the chord
    @Override
    public String toString() {
        return name + ": " + root + " - " + third + " - " + fifth;
    }

}
