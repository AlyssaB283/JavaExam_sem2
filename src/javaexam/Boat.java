package javaexam;

import java.time.LocalDate;

/**
 * @author Alyssa
 */
public abstract class Boat implements Transport
{
    private String make, model;
    private int modelYear,length;
    public int maxSpeed;
    

    public Boat(int length,int maxSpeed, int modelYear, String make, String model) 
    {
	setMake (make);
	setModel (model);
	setModelYear(modelYear);
	setLength(length);
    }
    public abstract void setMaxSpeed(int maxSpeed);
    public int getLength() 
    {
	return length;
    }

    public String getMake() {
	return make;
    }

    @Override
    public int getMaxSpeed() 
    {
	return maxSpeed;
    }

    public String getModel() {
	return model;
    }

    public void setMake(String make) 
    {
	if (make.isEmpty())
            throw new IllegalArgumentException("you need  make name!");
        else
	    this.make = make;	
	
    }
    public void setModel(String model) 
    {
	if (model.isEmpty())
            throw new IllegalArgumentException("you need  model name!");
        else
	    this.model = model;	
    }

    public int getModelYear() 
    {
	return modelYear;
    }

    public void setModelYear(int modelYear)
    {
	int overYear= LocalDate.now().getYear()+1;
	if (modelYear>overYear)
	{
            throw new IllegalArgumentException("That seems a little high. The higest you can go is the year you are in");
	}
	else if(modelYear<1400)
	{
            throw new IllegalArgumentException("Invalid model year. Lowest you can go is 1400 ");
	}
	else
	    this.modelYear = modelYear;
    }

    
    public void setLength(int length) 
    {
	if (length>1550)
	{
            throw new IllegalArgumentException("That seems a little long. The longest you can go is 1550 in feet");
	}
	else if(length<6)
	{
            throw new IllegalArgumentException("Boat length can't got into the negatives! The shortest you can go is 6 feet");
	}
	else
	    this.length = length;
	
    }
}
