package com;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DetermineGradeTest {

    @Test
    void determineG() {
        DetermineGrade obj=new DetermineGrade();
        assertEquals('C',obj.determineG(75));
    }
    @Test
    void Grade89shouldReturnB() {
        DetermineGrade obj=new DetermineGrade();
        assertEquals('B',obj.determineG(89));
    }
    @Test
    void Grade59shouldReturnf() {
        DetermineGrade obj=new DetermineGrade();
        assertEquals('F',obj.determineG(59));
    }
 //   @Test
//    void NegGradeshouldThrowException() {
//        DetermineGrade obj=new DetermineGrade();
//        obj.determineG(-1);
//    }
    @Test
    void NegGradeshouldThrowException() { //it expects to throw a exception, if it dont get a expection,this test case wont work. show error.
        DetermineGrade obj=new DetermineGrade();
        assertThrows(IllegalArgumentException.class,()->{
        obj.determineG(-1);

        });
    }
}
//how to see what is the coverage of test case.
//write
