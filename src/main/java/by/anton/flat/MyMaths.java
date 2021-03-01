package by.anton.flat;

public class MyMaths {
    public static double addDouble(double ... a){
        double summ=0;
        for (double s:a
             )
            summ += s;
        return summ;
    }
}
