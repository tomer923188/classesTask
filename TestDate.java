public class TestDate
{
    public static void main(String[] args)
    {
        Date a = new Date(16, 7, 1963);
        Date b = new Date(1, 1, 2020);
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("a.getDay() = " + a.getDay());
        System.out.println("a.getMonth() = " + a.getMonth());
        System.out.println("a.getYear() = " + a.getYear());
        b.setDay(25);
        b.setMonth(12);
        b.setYear(2021);
        System.out.println("b after setters = " + b);
        System.out.println("a.compareTo(b) = " + a.compareTo(b));
        System.out.println("b.compareTo(a) = " + b.compareTo(a));
        Date c = new Date(16, 7, 1963);
        System.out.println("a.compareTo(c) = " + a.compareTo(c));
        Date d1 = new Date(16, 7, 1963);
        Date d2 = d1;
        Date d3 = null;
        Date d4 = new Date(1, 1, 2020);
        d1.setDay(20);
        d2.setYear(1980);
        System.out.println(d1);
        System.out.println(d2);
    }
}