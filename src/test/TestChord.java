package test;

import main.model.Chord;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestChord {

    private Chord A;
    private Chord Am;
    private Chord G;
    private Chord Gm;
    private Chord FSharp;
    private Chord FSharpm;

    @BeforeEach
    void setup() {
        A = new Chord("A", true);
        Am = new Chord("Am", false);
        G = new Chord("G", true);
        Gm = new Chord("Gm", false);
        FSharp = new Chord("F#", true);
        FSharpm = new Chord("F#m", false);

    }

    @Test
    void testA() {
        assertEquals("A", A.getName());
        assertEquals("A", A.getRoot());
        assertEquals("C#", A.getThird());
        assertEquals("E", A.getFifth());
        assertEquals("A: A - C# - E", A.toString());
    }

    @Test
    void testAm() {
        assertEquals("Am", Am.getName());
        assertEquals("A", Am.getRoot());
        assertEquals("C", Am.getThird());
        assertEquals("E", Am.getFifth());
        assertEquals("Am: A - C - E", Am.toString());
    }

    @Test
    void testG() {
        assertEquals("G", G.getName());
        assertEquals("G", G.getRoot());
        assertEquals("B", G.getThird());
        assertEquals("D", G.getFifth());
        assertEquals("G: G - B - D", G.toString());
    }

    @Test
    void testGm() {
        assertEquals("Gm", Gm.getName());
        assertEquals("G", Gm.getRoot());
        assertEquals("A#", Gm.getThird());
        assertEquals("D", Gm.getFifth());
        assertEquals("Gm: G - A# - D", Gm.toString());
    }

    @Test
    void testFSharp() {
        assertEquals("F#", FSharp.getName());
        assertEquals("F#", FSharp.getRoot());
        assertEquals("A#", FSharp.getThird());
        assertEquals("C#", FSharp.getFifth());
        assertEquals("F#: F# - A# - C#", FSharp.toString());
    }

    @Test
    void testFSharpm() {
        assertEquals("F#m", FSharpm.getName());
        assertEquals("F#", FSharpm.getRoot());
        assertEquals("A", FSharpm.getThird());
        assertEquals("C#", FSharpm.getFifth());
        assertEquals("F#m: F# - A - C#", FSharpm.toString());
    }


}
