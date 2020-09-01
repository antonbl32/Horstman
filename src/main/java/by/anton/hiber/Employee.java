package by.anton.hiber;

import org.hibernate.mapping.Value;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;
@Entity
@Table(name = "mytest")
public class Employee
{

    private long ID;

    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee( String name, double salary, int year, int month, int day)
    {
        this.name=name;
        this.salary=salary;
        hireDay= LocalDate.of(year,month,day);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void setHireDay(LocalDate hireDay) {
        this.hireDay = hireDay;
    }

    public void raiseSalary(double byPercent)
    {
        double raise = salary*byPercent/100;
        salary +=raise;

    }
}
