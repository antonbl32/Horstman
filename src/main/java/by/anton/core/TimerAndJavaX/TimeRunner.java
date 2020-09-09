package by.anton.core.TimerAndJavaX;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.time.*;



public class TimeRunner {
    public static void main(String[] args) {
        ActionListener myTime= new MyTime();
        Timer timer=new Timer(1000, (ActionListener) myTime);
        timer.start();
        JOptionPane.showMessageDialog(null, "Quit the program?");
        int k= JOptionPane.showConfirmDialog(null, "Really?");
        System.out.println(k);
        timer.stop();
        System.exit(0);
    }



}
