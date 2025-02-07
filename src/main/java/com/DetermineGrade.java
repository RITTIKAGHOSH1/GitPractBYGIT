package com;

public class DetermineGrade {
    public char determineG(int n){
        if(n<0) throw new IllegalArgumentException("Number grade cannot be Negative");
        else if(n<60) return 'F';
        else if(n<70) return 'D';
        else if(n<80) return 'C';
        else if(n<90) return 'B';
        else return 'A';
    }
}
