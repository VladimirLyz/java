package com.company;

import java.util.Objects;

public class Dog extends Unit implements MoovingUnit
{
    private Point speed;
    private int age;

    public Dog()
    {
        this.setType();
    }

    public Dog(Point coordinates, double radius, int age)
    {
        super(coordinates, radius);
        this.age = age;
        this.setType();
    }

    public void Grow()
    {
        this.age++;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Dog that = (Dog) o;
        return this.age == that.age &&
                Objects.equals(this.speed, that.speed);
    }

    @Override
    public String toString()
    {
        return super.toString() + "; Age: " + this.age + "; Speed: " + this.speed.toString();
    }

    @Override
    public void setSpeed(Point speed)
    {
        this.speed = speed;
    }

    @Override
    public Point getSpeed() {
        return this.speed;
    }

    @Override
    public void setType() {
        super.type = "Dog";
    }
}
