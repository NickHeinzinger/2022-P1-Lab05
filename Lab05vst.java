// Lab05vst.java
// This is the student, starting version of the Lab05 assignment.


import java.awt.*;
import java.applet.*;


public class Lab05vst extends Applet
{
    public void paint(Graphics g)
    {
        int width = 980;
        int height = 630;
        int x1 = 10;
        int y1 = 640;
        int x2 = 990;
        int y2 = 640;
        g.drawRect(10,10,width,height);

        for(int k = 0; k<70; k++)
        {
            g.drawLine(x1, y1, x2, y2);
            x1 += 14;
            y2 -= 9;
        }

        x1 = 10;
        y1 = 640;
        x2 = 990;
        y2 = 640;

        for(int k = 0; k<70; k++)
        {
            g.drawLine(x1, y1, x2, y2);
            y1 -= 9;
            x2 -= 14;
        }

        x1 = 10;
        y1 = 640;
        x2 = 10;
        y2 = 10;

        for(int k = 0; k<70; k++)
        {
            g.drawLine(x1, y1, x2, y2);
            y1 -= 9;
            x2 += 14;
        }

        x1 = 10;
        y1 = 10;
        x2 = 980;
        y2 = 10;

        for(int k = 0; k<70; k++)
        {
            g.drawLine(x1, y1, x2, y2);
            x1 += 14;
            y2 += 9;
        }


//smaller curves inside other curves
        width = 380;
        height = 230;
        x1 = 310;
        y1 = 440;
        x2 = 690;
        y2 = 440;

        g.drawRect(310,210,width,height);

        for(int k = 0; k<20; k++)
        {
            g.drawLine(x1, y1, x2, y2);
            x1 += 19;
            y2 -= 12;
        }

        x1 = 310;
        y1 = 440;
        x2 = 690;
        y2 = 440;

        for(int k = 0; k<20; k++)
        {
            g.drawLine(x1, y1, x2, y2);
            y1 -= 12;
            x2 -= 19;
        }

        x1 = 310;
        y1 = 440;
        x2 = 310;
        y2 = 210;

        for(int k = 0; k<20; k++)
        {
            g.drawLine(x1, y1, x2, y2);
            y1 -= 12;
            x2 += 19;
        }

        x1 = 310;
        y1 = 210;
        x2 = 690;
        y2 = 210;

        for(int k = 0; k<20; k++)
        {
            g.drawLine(x1, y1, x2, y2);
            x1 += 19;
            y2 += 12;
        }
    }
}