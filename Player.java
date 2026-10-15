public class Player
{
    private String name;
    private double age;
    private String role;
    private int year;
    private double salary;

    public Player(String name, double age, String role, int year, double salary)
    {
        this.name = name;
        this.age = age;
        this.role = role;
        this.year = year;
        this.salary = salary;
    }

    public String getName() { return this.name; }
    public double getAge() { return this.age; }
    public String getRole() { return this.role; }
    public int getYear() { return this.year; }
    public double getSalary() { return this.salary; }

    public void setName(String name) { this.name = name; }
    public void setAge(double age) { this.age = age; }
    public void setRole(String role) { this.role = role; }
    public void setYear(int year) { this.year = year; }
    public void setSalary(double salary) { this.salary = salary; }

    public String toString()
    {
        return "Player: " + this.name + ", age: " + this.age + ", role: " + this.role
                + ", year joined: " + this.year + ", salary: " + this.salary;
    }

    // Returns the name of the player who joined before or equals if both joined the same year
    public String firstJoined(Player other)
    {
        if (this.year < other.year)
            return this.name;
        if (this.year > other.year)
            return other.name;
        return "equals";
    }
}