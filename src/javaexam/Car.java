package javaexam;

import java.time.LocalDate;

/**
 * @author Alyssa
 */
public class Car implements Transport
{
    private String make,model;
    private int modelYear, maxSpeed;
    private static final String[] validMakes = {"Audi","Toyota","Ford"};

    public Car(String make, String model, int modelYear, int maxSpeed)
    {
	setMake(make);
	setModel (model);
	setModelYear (modelYear);
	setMaxSpeed (maxSpeed);
    }

    public String getMake()
    {
	return make;
    }
    
     @Override
    public int getMaxSpeed()
    {
	return maxSpeed;
    }
    
    public String getModel()
    {
	return model;
    }
    
     @Override
    public int getModelYear() 
    {
	return modelYear;
    }

    
    @Override
    public String poweredBy() 
    {
	return "gas or diesel engine";
    }
    
    public void setMake(String make) 
    {
	for (String validMake: validMakes)
        {
            if (validMake.equalsIgnoreCase(make))
            {
                this.make = validMake;
                return;
            }
	    else 
		throw new IllegalArgumentException("That is not a valid make. valid makes are Audi Toyota Ford");
	}
	 
    }

    public void setMaxSpeed(int maxSpeed) 
    {
	if (maxSpeed>600)
	{
            throw new IllegalArgumentException("That seems a little high. The higest you can go is 600");
	}
	else if(maxSpeed<0)
	{
            throw new IllegalArgumentException("Car speed can't got into the negatives! The lowest you can go is 0");
	}
	else
	    this.maxSpeed = maxSpeed;
    }
    
    public void setModel(String model) 
    {
	if (model.isEmpty())
            throw new IllegalArgumentException("you need  model name!");
        else
	    this.model = model;	
    }
    
    public void setModelYear(int modelYear) 
    {
	int overYear= LocalDate.now().getYear()+1;
	if (modelYear>overYear)
	{
            throw new IllegalArgumentException("That seems a little high. The higest you can go is the year you are in");
	}
	else if(modelYear<1900)
	{
            throw new IllegalArgumentException("Invalid model year. Lowest you can go is 1900 ");
	}
	else
	    this.modelYear = modelYear;
	
    }  
}
