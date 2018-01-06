package com.company;

public class Car extends Transport
{
    private String drive;

    public Car()
    {
        super(0, 4, "");
    }

    public Car(int velosity, String drive, String brand)
    {
        super(velosity, 4, brand);
        this.drive = drive;
    }

    public String getDrive()
    {
        return this.drive;
    }

    public Car(Car c)
    {
        super(c.getVelocity(), c.getWeels(), c.getBrand());
        this.drive = c.getDrive();
    }

}
