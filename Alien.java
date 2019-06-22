import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.*;
import javafx.scene.image.Image;
import javafx.scene.shape.*;

public class Alien extends Spielobjekt
{
    //Attribute
    Image img;

    int zaehler; // zählt die Schritte nach links und die Schritte nach rechts

    //Konstruktor
    public Alien(double x_,double y_)
    {
        super(x_,y_);
        zaehler = 0;
        vx = 0.4;
        breite = 48;
        hoehe = 48;
        img = new Image("alien1.png", true);
    }

    //Methoden
    public void update()
    {
        super.update();   // Ganz normal bewegen, wie jede Spielobjekt
        zaehler++;
        if (zaehler > 300) // Nach 300 Einheiten
        {
            zaehler = 0;
            vx = -vx;      // ändert das Alien die Richtung
            y = y + 10;    // und fliegt ein bisschen tiefer
        }
    }

    void zeichnen(GraphicsContext gc)
    {
        gc.drawImage(img,x, y,breite,hoehe);
    }

}

