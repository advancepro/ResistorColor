package main;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class ResistorColorTest {
    private ResistorColor ResistorColor;

    @Before
    public void setup() {
        ResistorColor = new ResistorColor();
    }

    @Test
    public void testBlackColorCode() {
        String input = "black";
        int expected = 0;

        assertEquals(expected, ResistorColor.colorCode(input));
    }

  //  @Ignore("Remove to run test")
    @Test
    public void testWhiteColorCode() {
        String input = "white";
        int expected = 9;

        assertEquals(expected, ResistorColor.colorCod(input));
    }

  //  @Ignore("Remove to run test")
    @Test
    public void testOrangeColorCode() {
        String input = "orange";
        int expected = 3;

        assertEquals(expected, ResistorColor.colorCo(input));
    }

   // @Ignore("Remove to run test")
    @Test
    public void testColors() {
        String[] expected = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};

        assertEquals(expected, ResistorColor.testColors());
    }

}