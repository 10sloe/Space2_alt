import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.*;
import javafx.scene.shape.*;

public class Kugel extends Spielobjekt
{ 
    boolean sichtbar;
    Color farbe;

    Kugel(double x_, double y_)
    {
        super(x_,y_);
        sichtbar = false;
        breite = 6;
        hoehe = 6;
        farbe = Color.YELLOW;
    }

    void sichtbarMachen()
    {
        sichtbar = true;
    }

    void unsichtbarMachen()
    {
        sichtbar = false;
    }

    void zeichnen(GraphicsContext gc)
    {
        if(sichtbar)
        {
            gc.setFill(farbe);  
            gc.fillOval(x,y,breite,hoehe); 
        }
    }
}

