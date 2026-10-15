public class TestRational
{
    public static void main(String[] args)
    {
        Rational r1 = new Rational(2, 3);
        Rational r2 = new Rational(4, 6);
        Rational r3 = new Rational(3, 10);
        Rational zero = new Rational(0, 5);
        System.out.println("r1 = " + r1 + ", r2 = " + r2 + ", r3 = " + r3);
        System.out.println("r1 numerator = " + r1.getNumerator() + ", denom = " + r1.getDenom());
        System.out.println("r1.isEqual(r2) = " + r1.isEqual(r2));
        System.out.println("r1.isEqual(r3) = " + r1.isEqual(r3));
        System.out.println("r1 * r3 = " + r1.multiply(r3));
        System.out.println("r1 / r3 = " + r1.divide(r3));
        System.out.println("r1 / 0 = " + r1.divide(zero));
        System.out.println("r1 + r3 = " + r1.add(r3));
        System.out.println("r1 - r3 = " + r1.subtract(r3));
        System.out.println("r3 - r1 = " + r3.subtract(r1));
    }
}