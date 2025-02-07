package com;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeTest {

    @Test
    void isPrime() {
        Prime obj=new Prime();
        assertEquals(false,obj.isPrime(8));
    }
}