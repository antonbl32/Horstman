package by.anton.core.clone;

import java.time.LocalDate;

public class Employer implements Cloneable {
    private String name;
    private String soname;
    private int salary;
    private LocalDate dateToWork;

    public Employer(String name, String soname, int salary, int day,int month, int year) {
        this.name = name;
        this.soname = soname;
        this.salary = salary;
        this.dateToWork = LocalDate.of(year,month,day);
    }
    public Employer clone() throws CloneNotSupportedException{

        return (Employer) super.clone();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateToWork(LocalDate dateToWork) {
        this.dateToWork = dateToWork;
    }

    @Override
    public String toString() {
        return "Employer{" +
                "name='" + name + '\'' +
                ", soname='" + soname + '\'' +
                ", salary=" + salary +
                ", dateToWork=" + dateToWork +
                '}';
    }
}
