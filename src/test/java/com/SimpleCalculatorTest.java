package com;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

class SimpleCalculatorTest {

    @Test
    void testingAddTwoPlusTwoShouldGiveFour(){
        SimpleCalculator cal=new SimpleCalculator();
        assertEquals(4,cal.add(2,2));
    }

    @Test
    public void testGradeB() {
        DetermineGrade grade = new DetermineGrade();
        assertEquals('B', grade.determineG(85));  // Covers 'B'
         // Ensure full coverage for 'B'
    }

    @Test
    void testingMulFunc(){
        SimpleCalculator cal=new SimpleCalculator();
        assertEquals(45,cal.mul(15,3));
    }
}