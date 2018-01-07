package com.company;

import java.util.Objects;

public abstract class Unit
{
    private Point coordinates;
    private double radius;
    protected String type;
    public Unit(){}

    public Unit(Point coordinates, double radius)
    {
        this.coordinates = coordinates;
        this.radius = radius;
    }

    public abstract void setType();

    void setCoordinates(Point coordinates)
    {
        this.coordinates = coordinates;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    public double getRadius()
    {
        return this.radius;
    }

    public Point getCoordinates()
    {
        return this.coordinates;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Unit unit = (Unit) o;
        return Double.compare(unit.radius, this.radius) == 0 &&
                Objects.equals(this.coordinates, unit.coordinates);
    }

    @Override
    public String toString()
    {
        return "Type: " + this.type + "; Coordinates: " + this.coordinates + "; radius: " + this.radius;
    }


}
