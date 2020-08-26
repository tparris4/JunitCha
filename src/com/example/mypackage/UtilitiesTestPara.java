package com.example.mypackage;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class UtilitiesTestPara {

private Utilities util;
private String input;
private String output;

    public UtilitiesTestPara(String input, String output) {
        this.input = input;
        this.output = output;
    }

    @Before
    public void setup(){
        util = new Utilities();
    }

    @Parameterized.Parameters
    public static Collection<Object> testConditions(){
        return Arrays.asList(new Object[][]{
            {"ABCDEFF", "ABCDEF"},
            {"ABBBEFFG", "ABEFG"},
            {"112233445566", "123456"},
            {"A" , "A"}

        });

    }
    @Test
    public void removePairs(){
        assertEquals(output, util.removePairs(input));
    }
}