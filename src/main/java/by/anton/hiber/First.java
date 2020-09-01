package by.anton.hiber;

import java.util.Date;

public class First {
    private static int k;
    private int m=CheckK(k);
    Date time;
    private static int CheckK(int k){
        k++;
        return k;

    }
    public First(){

        time=new Date();
    }
    public int summCheck(int c){
        return this.getK()+c;
    }
    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }



    public void setM(int m) {
        this.m = m;
    }

    public Date getTime() {
        return (Date) time.clone();
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
