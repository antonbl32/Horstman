package by.anton.core.comparator;

import com.sun.istack.NotNull;

import java.util.Comparator;

public class MyCompar implements Comparator {

    public int compare(@NotNull String first,@NotNull String second) {
        if (first.length()>second.length()) return 1;
        if (first.length()<second.length()) return -1;
        return 0;
    }

    public static void main(String[] args) {
        String m="KKKK";
        String k="MMMMMM";
        int j=new MyCompar().compare(m,k);
       //int h= mm.compare(m,k);
       System.out.println(j);
    }

    @Override
    public int compare(Object o, Object t1) {
        return 0;
    }
}
