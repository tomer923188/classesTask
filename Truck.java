public class Truck
{
    private String truckId;
    private String driverName;
    private int numStorage;

    public Truck(String truckId, String driverName, int numStorage)
    {
        this.truckId = truckId;
        this.driverName = driverName;
        this.numStorage = numStorage;
    }

    public String getTruckId() { return this.truckId; }
    public String getDriverName() { return this.driverName; }
    public int getNumStorage() { return this.numStorage; }

    public void setTruckId(String truckId) { this.truckId = truckId; }
    public void setDriverName(String driverName) { this.driverName = driverName; }
    public void setNumStorage(int numStorage) { this.numStorage = numStorage; }

    public String toString()
    {
        return "Truck: id " + this.truckId + ", driver: " + this.driverName
                + ", storage places: " + this.numStorage;
    }

    // Returns the driver name of the truck with more storage places
    public String moreStorageDriver(Truck other)
    {
        if (this.numStorage > other.numStorage)
            return this.driverName;
        return other.driverName;
    }
}