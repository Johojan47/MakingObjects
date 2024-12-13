class bicycle extends vehicle {

    boolean hasBell;

    public bicycle (int speed, double fuel, boolean hasBell)
    {
        super(speed, fuel);
        this.hasBell = hasBell;
    }

    @Override
    public void start()
    {
        System.out.println("GO GO PEDAL!");
    }

    public void ringBell()
    {
        if (hasBell)
        {
        System.out.println("Ring Ring!");
        }
        else
        {
            System.out.println("The bike has no bell :(");
        }
    
    }
    
}
