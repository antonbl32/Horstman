package by.anton.core.clone;

import java.time.LocalDate;

public class CloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employer em1=new Employer("Arkl","Humm",5000,10,05,2020);
        Employer emClone=em1.clone();
        System.out.println(em1.toString());
        emClone.setName("Anton");
        LocalDate mydate=LocalDate.of(1990,05,12);
        emClone.setDateToWork(mydate);
        System.out.println(em1.toString());
        System.out.println(emClone.toString());

    }
}
