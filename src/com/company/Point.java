package com.company;

import java.util.Objects;

public class Point
{
    double x, y;
    Point(){}
    Point(double x, double y)
    {
        this.x = x;
        this.y = y;
    }
    public void setPoint(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public Point getPoint()
    {
        return this;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return this.x == point.x &&
                this.y == point.y;
    }

    @Override
    public String toString()
    {
        return "X: " + this.x+"; Y: " + this.y;
    }
}