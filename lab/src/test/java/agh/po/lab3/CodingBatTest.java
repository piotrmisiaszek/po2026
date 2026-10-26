package agh.po.lab3;

import org.junit.Test;

import static org.junit.Assert.*;
public class CodingBatTest {

    @org.junit.Test
    public void array123() {
        CodingBat cb = new CodingBat();
        assertEquals(true, cb.array123(new int[]{1, 1, 2, 3, 1}));


    }


    @Test
    public void testSum67() {
            CodingBat cb1 = new CodingBat();
            assertEquals(5, cb1.sum67(new int[]{1, 2, 2, 6, 99, 99, 7}));
            assertEquals(4, cb1.sum67(new int[]{1, 1, 6, 7, 2}));
            assertEquals(2, cb1.sum67(new int[]{1, 6, 2, 2, 7, 1, 6, 99, 99, 7}));
            assertEquals(2, cb1.sum67(new int[]{1, 6, 2, 6, 2, 7, 1, 6, 99, 99, 7}));
            assertEquals(18, cb1.sum67(new int[]{2, 7, 6, 2, 6, 7, 2, 7}));

        }
    }

