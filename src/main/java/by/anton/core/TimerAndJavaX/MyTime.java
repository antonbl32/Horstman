package by.anton.core.TimerAndJavaX;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Instant;

public class MyTime implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        System.out.println("Time left " + Instant.ofEpochMilli(actionEvent.getWhen()));
        //Toolkit.getDefaultToolkit().beep(); звук из динамиков
        System.out.println(Toolkit.getDefaultToolkit().getMaximumCursorColors());
    }
}

