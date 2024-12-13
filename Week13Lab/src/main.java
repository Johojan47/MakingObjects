public class main {

    public static void main(String[] args)
    {
        car myCar = new car(45, 30.0, 4);
        myCar.start();
        myCar.displayFuel();
        myCar.honk();

        System.out.println();

        bicycle mBicycle = new bicycle(5, 0.0, true);
        mBicycle.start();
        mBicycle.displayFuel();
        mBicycle.ringBell();
    }
    
}
