package com.company;

import java.util.Objects;

public class User implements MoovingUnit
{
    private Point speed;
    private String name;
    private int age;
    private boolean scientist;

    public User(){}

    public User(String name, int age, boolean scientist)
    {
        this.name = name;
        this.age = age;
        this.scientist = scientist;
    }

    public void visitSirius()
    {
        scientist = true;
    }

    @Override
    public Point getSpeed()
    {
        return this.speed;
    }

    @Override
    public void setSpeed(Point speed)
    {
        this.speed = speed;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return this.age == user.age &&
                this.scientist == user.scientist &&
                Objects.equals(this.speed, user.speed) &&
                Objects.equals(this.name, user.name);
    }

    @Override
    public String toString() {
        return "Name: " + this.name + "; Age: " + this.age + "; Speed: " + this.speed.toString() + "; Is scientist: " + scientist;
    }
}
