package by.anton.core;

public class DefaultMetod implements DefaultT, DefaultC {
    public static void main(String[] args) {
    DefaultT met=new DefaultMetod();
    met.printIt();

   }


    @Override
    public String mePrint(String m) {
        return null;
    }

    @Override
    public void printIt() {
        DefaultC.super.printIt();
    }
}
