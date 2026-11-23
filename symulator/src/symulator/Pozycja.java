package symulator;

public class Pozycja {

    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public String getPozycja()
    {
        return "(" + x + ", " + y + ")";
    }
    public void aktualizujPozycję(double deltaX, double deltaY)
    {
        x=x+deltaX;
        y=y+deltaY;
    }
}


