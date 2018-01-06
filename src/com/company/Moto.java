package com.company;

public class Moto extends Transport
{
    private String type;

    public Moto()
    {
        super(0, 2, "");
    }

    public Moto(int velosity, String type, String brand)
    {
        super(velosity, 2, brand);
        this.type = type;
    }

    public String getType()
    {
        return this.type;
    }

    public Moto(Moto c)
    {
        super(c.getVelocity(), c.getWeels(), c.getBrand());
        this.type = c.getType();
    }
}
