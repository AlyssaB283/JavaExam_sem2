package javaexam;

/**
 * @author Alyssa
 */
public class ElectricCar extends Car
{   
    private int kilowattHours;
    public ElectricCar(int kilowattHours,String make, String model, int modelYear, int maxSpeed) 
    {
	super(make, model, modelYear, maxSpeed);
	setKilowattHours(kilowattHours);
    }

    public int getKilowattHours() 
    {
	return kilowattHours;
    }

    public void setKilowattHours(int kilowattHours) 
    {
	if (kilowattHours>400)
	{
            throw new IllegalArgumentException("Invaild entry! The higest you can go is 400");
	}
	else if(kilowattHours<10)
	{
            throw new IllegalArgumentException("Invaild entry! The lowest you can go is 10");
	}
	else
	    this.kilowattHours = kilowattHours;
    }
    
     @Override
    public String poweredBy() 
    {
	return "electric motor";
    }
    
    
}
