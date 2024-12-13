public class vehicle {

    protected int speed;
    private double fuel;

    public vehicle (int speed, double fuel)
    {
        this.speed = speed;
        this.fuel = fuel;
    }

    public void start()
    {
        System.out.println("The vehicle has started.");
    }

    public void stop()
    {
        System.out.println("This vehicle has stopped.");
    }

    public final void displayFuel()
    {
        System.out.println("This vehicles fuel is " + fuel);
    }

    public int getSpeed()
    {
        return speed;
    }

    public void getSpeed(int speed)
    {
        this.speed = speed;
    }
    
}
