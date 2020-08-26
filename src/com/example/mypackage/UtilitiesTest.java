package com.example.mypackage;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UtilitiesTest {
    private Utilities util;

    @Before
    public void setUtil() {
       util = new Utilities();
    }

    @org.junit.Test
    public void everyNthChar() {
        //fail("Not been implemented");
//        char[] array = {'h', 'e', 'l', 'l', 'o'};
//        char[] array2 = {'e', 'l'};
//        assertArrayEquals(array2, util.everyNthChar(array, 2));
        char[] output = util.everyNthChar(new char[] {'h', 'e', 'l', 'l', 'o'}, 2);
        assertArrayEquals(new char[] {'e', 'l'}, output);
        char[] output2 = util.everyNthChar(new char[] {'h'}, 2);
        assertArrayEquals(new char[]{'h'}, output2);

    }

    @org.junit.Test
    public void removePairs() {
//        Utilities util = new Utilities();
        String test = "AABCDDEFF";
        //assertArrayEquals(test, "ABCDDEF", "ABCDEF");
        assertEquals("ABCDEF", util.removePairs("AABCDDEFF"));
        assertEquals("ABCABDEF", util.removePairs("AABCDDEFF"));
        assertNull("Did not get null returned ", util.removePairs(null));
        assertEquals("A", util.removePairs("A"));
        assertEquals("", "");
    }

    @org.junit.Test
    public void converter() {
       // fail("Not been implemented");

        assertEquals(300, util.converter(10, 5));
    }
    @Test(expected = ArithmeticException.class)
    public void converter_div0() {
        util.converter(10, 0);
}
    @org.junit.Test
    public void nullIfOddLength() {
        //fail("Not been implemented");

       // assertEquals("test", util.nullIfOddLength("test"));
        assertNotNull(util.nullIfOddLength("even"));
        assertNull("odd length", util.nullIfOddLength("odd"));
    }
}