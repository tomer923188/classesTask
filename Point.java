public class Point
{
    private double x;
    private double y;

    public Point(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public double getX() { return this.x; }
    public void setX(double x) { this.x = x; }

    public double getY() { return this.y; }
    public void setY(double y) { this.y = y; }

    public String toString()
    {
        return "(" + this.x + ", " + this.y + ")";
    }

    public double distance(Point p)
    {
        double dx = this.getX() - p.getX();
        double dy = this.getY() - p.getY();
        return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
    }

    public Point middle(Point p)
    {
        return new Point((this.getX() + p.getX()) / 2, (this.getY() + p.getY()) / 2);
    }
}