public class Date
{
    private int day;
    private int month;
    private int year;

    // (day 1-31, month 1-12, year not negative 4 digits)
    public Date(int day, int month, int year)
    {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getYear()
    {
        return this.year;
    }

    public int getMonth()
    {
        return this.month;
    }

    public int getDay()
    {
        return this.day;
    }

    public void setYear(int yearToSet)
    {
        this.year = yearToSet;
    }

    public void setMonth(int monthToSet)
    {
        this.month = monthToSet;
    }

    public void setDay(int dayToSet)
    {
        this.day = dayToSet;
    }

    // Returns a positive number if this date is later than other
    public int compareTo(Date other)
    {
        if (this.year != other.year)
            return this.year - other.year;
        if (this.month != other.month)
            return this.month - other.month;
        return this.day - other.day;
    }

    // Format: <day>.<month>.<year>
    public String toString()
    {
        return this.day + "." + this.month + "." + this.year;
    }
}