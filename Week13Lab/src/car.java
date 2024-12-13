class car extends vehicle {

    private int numberofDoors;

    public car (int speed, double fuel, int numberofDoors)
    {
        super(speed, fuel);
        this.numberofDoors = numberofDoors;
    }

    @Override
    public void start()
    {
        System.out.println("Vroom! This car has started.");
    }
    
    public void honk()
    {
        System.out.println("Beep Beep!");
    }

    public int getNumberofDoors()
    {
        return numberofDoors;
    }

    public void setNumberofDoors(int numberofDoors)
    {
        this.numberofDoors = numberofDoors;
    }
}