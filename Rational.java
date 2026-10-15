public class Rational
{
    private int numerator;
    private int denom;

    public Rational(int x, int y)
    {
        this.numerator = x;
        this.denom = y;
    }

    public int getNumerator()
    {
        return this.numerator;
    }

    public int getDenom()
    {
        return this.denom;
    }

    public boolean isEqual(Rational num)
    {
        return this.numerator * num.denom == num.numerator * this.denom;
    }

    public Rational multiply(Rational num)
    {
        return new Rational(this.numerator * num.numerator, this.denom * num.denom);
    }

    public Rational divide(Rational num)
    {
        if (num.numerator == 0)
            return null;
        return new Rational(this.numerator * num.denom, this.denom * num.numerator);
    }

    public Rational add(Rational num)
    {
        return new Rational(this.numerator * num.denom + num.numerator * this.denom,
                this.denom * num.denom);
    }

    public Rational subtract(Rational num)
    {
        return new Rational(this.numerator * num.denom - num.numerator * this.denom,
                this.denom * num.denom);
    }

    public String toString()
    {
        return this.numerator + "/" + this.denom;
    }
}