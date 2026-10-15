public class TestPlayer
{
    public static void main(String[] args)
    {
        Player p1 = new Player("Amit levi", 27.5, "middle field", 2019, 45000.0);
        Player p2 = new Player("Nissan Gino", 24.0, "center", 2021, 38000.0);

        System.out.println(p1);
        System.out.println(p2);

        // The player who joined the team before
        System.out.println("Joined first: " + p1.firstJoined(p2));

        // The youngest player
        if (p1.getAge() < p2.getAge())
            System.out.println("Youngest: " + p1.getName());
        else if (p2.getAge() < p1.getAge())
            System.out.println("Youngest: " + p2.getName());
    }
}