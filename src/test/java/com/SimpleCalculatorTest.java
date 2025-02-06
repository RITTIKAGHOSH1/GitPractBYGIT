package com;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SimpleCalculatorTest {

    @Test
    void testingAddTwoPlusTwoShouldGiveFour(){
        SimpleCalculator cal=new SimpleCalculator();
        assertEquals(4,cal.add(2,2));
    }

}