package by.anton.flat;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class MyMathsTest {

    @org.junit.jupiter.api.Test
    void addDouble() {
        double k=2.5;
        double m=54.2254;
        double l= 4.21587740;
        double Kresult=k+m+l;
        double result=MyMaths.addDouble(k,m,l);
        Assertions.assertEquals(result,Kresult);

    }
}