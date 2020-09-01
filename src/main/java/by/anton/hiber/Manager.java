package by.anton.hiber;

import by.anton.hiber.Employee;

public class Manager extends Employee
{
    private double bonus;
    /**
     * @param n Имя работника
     * @param s Зарплата
     * @param year Год приема на работу
     * @param month Месяц приема на работу
     * @param day День приема на работу
     *
     */
    public Manager(String n, double s, int year, int month, int day) {
        super(n, s, year, month, day);
        bonus=0;
    }
    public  double getSalary()
    {
        return super.getSalary()+bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public void printThis(){
        System.out.println("Yes");
    }
}
