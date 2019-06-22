import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.*;
import javafx.scene.image.Image;
import javafx.scene.shape.*;

public class Spielobjekt
{
    //Attribute
    double x;
    double y;
    double vx;
    double vy;

    double breite;
    double hoehe;

    Spielobjekt(double x_, double y_)
    {
        x = x_;
        y = y_;
        vx = 0;
        vy = 0;
    }

    // Methoden
    public double getX()
    {
        return x;
    }

    public double getY()
    {
        return y;
    }

    public double getBreite()
    {
        return breite;
    }

    public void setPosition(double x_, double y_)
    {
        x = x_;
        y = y_;
    }

    public void update()
    {
        x = x + vx;
        y = y + vy;
    }

    void zeichnen(GraphicsContext gc)
    {

    }
}
