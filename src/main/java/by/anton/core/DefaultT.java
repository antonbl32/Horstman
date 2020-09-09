package by.anton.core;

public interface DefaultT {
    String mePrint(String m);
    default void printIt(){
        System.out.println("Interface Print");
    }


}
