package com.alexw.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        ExecuteCal testExecuteCal = new ExecuteCal();
        assertEquals("4.0" ,testExecuteCal.strExecuteCal("2+2"));

    }
}