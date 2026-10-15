public class TestPoint
{
    public static void main(String[] args)
    {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(4, 6);

        System.out.println("p1 = " + p1 + ", p2 = " + p2);
        System.out.println("p1.getX() = " + p1.getX() + ", p1.getY() = " + p1.getY());

        p1.setX(0);
        p1.setY(0);
        System.out.println("p1 after setters = " + p1);

        System.out.println("distance(p1, p2) = " + p1.distance(p2));
        System.out.println("middle(p1, p2) = " + p1.middle(p2));
    }
}