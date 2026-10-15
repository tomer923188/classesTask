public class TestTruck
{
    public static String lessStorageCar(Truck t1, Truck t2)
    {
        if (t1.getNumStorage() < t2.getNumStorage())
            return t1.getTruckId();
        return t2.getTruckId();
    }

    public static void main(String[] args)
    {
        Truck t1 = new Truck("12-345-67", "Ron", 20);
        Truck t2 = new Truck("98-765-43", "Ben", 35);

        System.out.println(t1);
        System.out.println(t2);

        System.out.println("Driver of the truck with more storage: " + t1.moreStorageDriver(t2));
        System.out.println("License of the truck with less storage: " + lessStorageCar(t1, t2));
    }
}