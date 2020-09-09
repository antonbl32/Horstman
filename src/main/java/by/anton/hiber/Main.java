package by.anton.hiber;

import by.anton.hiber.Employee;
import by.anton.hiber.First;
import by.anton.hiber.Manager;

import java.lang.reflect.Field;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;
import static java.lang.Math.random;
import static java.lang.System.*; // можно использовать не System.out а просто out

/**
 * Данный метод <code>by.anton.hiber.Main</code> является главным в программе
 * @author SH
 * @see <a href="http://web.oblgaz.com">Oblgaz</a>
 *
 */
public class Main  {
    /**
     *
     * @param k входной параметр
     * @param m входной параметр2
     * @return возвращается значение <code>k+m</code>
     */
    private static int summAll(int k, int m){
        return k+m;
    }



    /**
     *
     * @param args аргументы
     *             запуска программы
     */
    public static void main(String[] args) throws IllegalAccessException {
        First m=new First();
        Date mm=m.getTime();
        out.println(m.getTime());
        mm.setTime(1254445);
        out.println(m.getTime());

            try {
                Field field=m.getClass().getDeclaredField("m");
                field.setAccessible(true);
                out.println(field.get(m));
                field.set(m, (int) 2);
                out.println(field.get(m));
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            }



        LocalDate date= LocalDate.now();
        LocalDate firstdate=date.minusDays(date.getDayOfYear()-1);
        out.println(firstdate);
        double viv=2.55;
        NumberFormat currency=NumberFormat.getCurrencyInstance();
        NumberFormat by=NumberFormat.getPercentInstance();
        out.println(currency.format(viv));
        out.println(by.format(viv));
        Random rd=new Random();
        int k=(int)(random()*10);
        out.println(random());
        out.println(k);

        int mmk=summAll(5,1);

        Manager boss= new Manager("Carl Cracker", 80000,1987,12,15);
        boss.setBonus(5000);
        Employee[] staff= new Employee[3];
        staff[0] = boss;
        staff[1] = new Employee("Harry Hacker", 50000,1989,10,1);
        staff[2] = new Employee("Tony Tester",40000,1990,3,15);
        Class emp=boss.getClass();
        out.println(emp.getName());
        try {
            Field field=emp.getField("bonus");
            field.set(boss,6000);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }

        for (Employee e: staff
             ) {
            if (e instanceof Manager){
                ((Manager) e).printThis();
            }
            out.println(e.getName()+ " salary: " + e.getSalary());
        }
        out.println(staff[1].getSalary());
        double[][] mass=new double[2][2];
        for (int i = 0; i <mass.length ; i++) {
            for (int j = 0; j <mass[i].length ; j++) {
                mass[i][j]=i*2+j*3;
            }
        }
        out.println(Arrays.deepToString(mass));
    }


}
