import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.*;
import javafx.scene.image.Image;
import javafx.scene.shape.*;

public class Schiff extends Spielobjekt
{
    //Attribute
    Image img; 

    //Konstruktor
    public Schiff(double x_,double y_)
    {
        super(x_,y_);
        img = new Image("schiff.png", true);
        breite = 48;
        hoehe = 48;
    }

    //Methoden

    public void nachRechts()
    {
        vx = 3;
    }

    public void nachLinks()
    {
        vx = -3;
    }

    public void stoppen()
    {
        vx = 0;
    }

    void zeichnen(GraphicsContext gc)
    {
        gc.drawImage(img,x, y,breite,hoehe);
    }

}
