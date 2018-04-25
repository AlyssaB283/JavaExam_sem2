package javaexam;

/**
* @author Alyssa
*/
public class SailBoat extends Boat
{
    private int numberOfMasts;

    public SailBoat(int numberOfMasts, int length, int maxSpeed, int modelYear, String make, String model) 
    {
	super(length, maxSpeed, modelYear, make, model);
	setNumOfMasts (numberOfMasts);
    }

    public int getNumOfMasts() {
	return numberOfMasts;
    }

    public void setNumOfMasts(int numberOfMasts)
    {
	
	if (numberOfMasts>5)
	{
            throw new IllegalArgumentException("Too many masts!! The highest you can go is 5");
	}
	else if(numberOfMasts<1)
	{
            throw new IllegalArgumentException("You need a Mast! The lowest you can go is 1");
	}
	else
	    this.numberOfMasts = numberOfMasts;	
	
    }

    @Override
    public int getMaxSpeed() 
    {
	return maxSpeed;
    }


    @Override
    public void setMaxSpeed(int maxSpeed) 
    {
	if (maxSpeed>75)
	{
            throw new IllegalArgumentException("Too fast! fastest you can go is 75");
	}
	else if(maxSpeed<1)
	{
            throw new IllegalArgumentException("Too slow! Slowest you can go is 1");
	}
	else
	    this.maxSpeed = maxSpeed;
    }

    @Override
    public String poweredBy() 
    {
	return "wind";
    }
    
}
