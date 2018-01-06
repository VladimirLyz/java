package com.company;

public class Transport
{
    private int velocity;
    private int weels;
    private String brand;

    public Transport ()
    {
        this(0, 0, "");
    }

    public Transport (int velocity, int weels, String brand)
    {
        this.velocity = velocity;
        this.weels = weels;
        this.brand = brand;
    }

    public Transport(Transport arg)
    {
        this.velocity=arg.velocity;
        this.weels=arg.weels;
        this.brand=arg.brand;
    }

    public String toString()
    {
        return brand+" Speed: " + velocity+ " Number of weels: "+weels;
    }
    public void accelerate(int acceleration)
    {
        this.velocity += acceleration;
    }

    public String getBrand() {
        return brand;
    }

    public int getWeels()
    {
        return this.weels;
    }
    public int getVelocity()
    {
        return this.velocity;
    }
}
