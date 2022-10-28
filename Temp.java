
import java.awt.*;
import java.applet.*;

public class Temp extends Applet
{
    public void paint(Graphics g)
    {
        int x = 20;
        int y = 20;
        int width = 50;
        int height = 50;
        for(int k = 0; k<50; k++){
            g.drawOval(x,y,width,height);

            x += 5;
            y += 5;
        }
    }

}
