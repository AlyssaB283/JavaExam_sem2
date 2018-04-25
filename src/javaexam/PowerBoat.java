package javaexam;

/**
 * @author Alyssa
 */
public class PowerBoat extends Boat
{
    private int horsePower;

    public PowerBoat(int horsePower,int length, int maxSpeed, int modelYear, String make, String model)
    {
	super(length, maxSpeed, modelYear, make, model);
	setHorsePower(horsePower);
    }

    public int getHorsePower() 
    {
	return horsePower;
    }
    
    public void setHorsePower(int horsePower)
    {
	if (horsePower>200)
	{
            throw new IllegalArgumentException("Too many horses!!. The highest you can go is 200");
	}
	else if(horsePower<2)
	{
            throw new IllegalArgumentException("Too little horses! The lowest you can go is 2");
	}
	else
	    this.horsePower = horsePower;	
    }

    

    @Override
    public String poweredBy()
    {
	return "gas or diesel engine";
    }

    @Override
    public void setMaxSpeed(int maxSpeed) 
    {
	if (maxSpeed>200)
	{
            throw new IllegalArgumentException("Too fast! fastest you can go is 200");
	}
	else if(maxSpeed<1)
	{
            throw new IllegalArgumentException("Too slow! Slowest you can go is 1");
	}
	else
	    this.maxSpeed = maxSpeed;
    }
    
}
